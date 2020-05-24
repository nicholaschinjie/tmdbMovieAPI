package com.example.rm.movieDB.web.service;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import org.apache.http.client.utils.URIBuilder;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.rm.movieDB.db.ImageRepository;
import com.example.rm.movieDB.model.ImageDefaultSchema;
import com.example.rm.movieDB.model.TMDBPersonSchema;
import com.example.rm.movieDB.model.UserExampleRequest;
import com.example.rm.movieDB.web.feign.TMDBFeignClient;


@Service 
public class MovieImageService {
	
	
	@Autowired
	MovieImageTransformer imgTransformer; 
	
	@Autowired
	private ImageRepository imageRepository;
	
//	@Autowired
//	MovieRestTemplate client; 
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieImageService.class);
	
	/** 
	 * 
	 * @param movieId = id entered by user
	 * layering for application logic + response object transformation 
	 * @param config 
	 * @return now completed fields 
	 */
	public ImageDefaultSchema retrievePhoto(int movieId, ResponseEntity<TMDBPersonSchema> apiresponse, UserExampleRequest config) {
		//	TODO: Support for movie_name search query, one day
		
		try {
			ImageDefaultSchema imageDetails = ImageDefaultSchema.builder().build();

			//TODO: if config filesize is one of enum, do this
			// else, ImageResponseSchema.error = "" 
			// Transform and clean TMDBPersonSchema data before passing it to ImageResponseSchema 
			TMDBPersonSchema tmdb = apiresponse.getBody();
			imageDetails = imgTransformer.verifyFields(config, 
					tmdb);			
			LOGGER.info("Successfully called TMDB API server and obtained Image Details");
			
			// and save transformed object 
			imageRepository.save(imageDetails);
			LOGGER.info("Saved Image and Relevant Details to database");
			
			return imageDetails; 
			
		} catch (Exception e) {
			LOGGER.info("Exception caught");
			LOGGER.info(e.toString());
			LOGGER.info(apiresponse.getBody().toString());
			e.printStackTrace();
			return ImageDefaultSchema.builder()
					.error("Houston we have a problem")
					.build();
		}
		
	}

	public ImageDefaultSchema searchForImage(ImageDefaultSchema request) {
		ImageDefaultSchema response = ImageDefaultSchema.builder()
				.error("Could not file locally. Try using /api/tmdb/images to pull image from TMDB API first")
				.build();
		if (request.getId() != null && imageRepository.findByid(request.getId()) != null) {
			response = imageRepository.findByid(request.getId());
		} else if (request.getTitle() != null && imageRepository.findByTitle(request.getTitle()) != null ) {
			response = imageRepository.findByTitle(request.getTitle());
		} else if (request.getFileName() != null && imageRepository.findByFileName(request.getFileName()) != null) {
			response = imageRepository.findByFileName(request.getFileName()); 
		} else if (request.getOriginalLink() != null && imageRepository.findByOriginalLink(request.getOriginalLink()) != null) {
			response = imageRepository.findByOriginalLink(request.getOriginalLink());
		}
		
		return response;
	}
	
}
