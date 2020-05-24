package com.example.rm.movieDB.web.controller;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.imageio.ImageIO;
import javax.websocket.server.PathParam;

import org.apache.catalina.connector.Response;
import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;

import com.example.rm.movieDB.db.ImageRepository;
import com.example.rm.movieDB.model.ImageDefaultSchema;
import com.example.rm.movieDB.model.TMDBPersonSchema;
import com.example.rm.movieDB.model.UserExampleRequest;
import com.example.rm.movieDB.web.service.MovieImageService;
import com.example.rm.movieDB.web.service.URITemplateService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ImagesController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ImagesController.class);
	
	private static final String VERSION = "version";
	private static final String STATUS = "status";
	private static final String OK = "OK";
	
	@Autowired
	RestTemplate restTemplate; 
	
	@Autowired
	MovieImageService imageService; 
	
	@Autowired
	ImageRepository imageRepo; 
	
	@Autowired
	URITemplateService uriService; 
	
	// Retrieve photos and save those photos in your server. 
	// You should be able to retrieve any photo from TMDB via person Id 
	@RequestMapping("/api/tmdb/images")
	public ResponseEntity<Object> pullImage(@RequestParam int id, @RequestBody UserExampleRequest config) throws URISyntaxException {
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    ImageDefaultSchema response = ImageDefaultSchema.builder()
	    		.error("category." + config.getCategory() + " is not a supported query")
	    		.build(); 
	    
	    URI uri = uriService.generatePersonApiUrl(config, id);
	    
	    // TODO: Move to Service and Implement HTTP Error Logging
	    LOGGER.info(config.toString());
	    
	    //TODO: error logging for file_size 
	    if (config.getCategory().contentEquals("person")) {
			ResponseEntity<TMDBPersonSchema> apiresponse = restTemplate.getForEntity(uri, TMDBPersonSchema.class);
			response = imageService.retrievePhoto(id, apiresponse, config); 
	//				restTemplate.exchange("https://api.themoviedb.org/3/person/2?api_key=b9e34c17e1f375937c33f3ae43e76a88", HttpMethod.GET, entity, String.class).getBody();
	    }
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	
	/*
	 * Allows users to search images by any one of: {id, title, filename, originalLink} 
	 */
	@RequestMapping("/api/images/person")
	public ResponseEntity<Object> searchImageById(@RequestBody ImageDefaultSchema request) {
		// If what you're looking for doesn't exist, return error message
		ImageDefaultSchema response = imageService.searchForImage(request);
		
		return ResponseEntity.status(HttpStatus.OK).body(response); 
	}
	
	
	@RequestMapping("/api/users/person/all")
	public ResponseEntity<Object> searchAll() {
		List<ImageDefaultSchema> response = imageRepo.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	// TODO: IGNORE
	// Trying pulling an image to local storage 
	@RequestMapping("api/images")
	public void getPhoto(@RequestParam int id) throws URISyntaxException, IOException {
		BufferedImage image = null; 
		URL url = new URL("https://image.tmdb.org/t/p/original/mDLDvsx8PaZoEThkBdyaG1JxPdf.jpg");
		image = ImageIO.read(url);
		// if you do this later, make save file location dynamic
		ImageIO.write(image, "jpg", new File("/Users/nicholaschin/Desktop/movieDB/images"));
		return;  
	}

}
