package com.example.rm.movieDB.web.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.rm.movieDB.model.ImageDefaultSchema;
import com.example.rm.movieDB.model.TMDBPersonSchema;
import com.example.rm.movieDB.model.UserExampleRequest;

@Component
public class MovieImageTransformer {
	
	@Autowired
	URITemplateService uriService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieImageService.class);


	// Transform JSON object returned by TMDB into a POJO readable by MongodB 
	// Clean data 
	public ImageDefaultSchema verifyFields(UserExampleRequest config, TMDBPersonSchema tmdbPersonSchema) throws URISyntaxException {
		ImageDefaultSchema response = ImageDefaultSchema.builder().build();
		
		response.setId(tmdbPersonSchema.getId());
		response.setPhotoDescription(tmdbPersonSchema.getBiography());
		response.setTitle(tmdbPersonSchema.getName());
		
		if (tmdbPersonSchema.getProfilePath() != null) {
		
			URI originalLink = uriService.generateImageApi(config, tmdbPersonSchema); 
			
			response.setFileName(tmdbPersonSchema.getProfilePath().replaceAll("/", "")); // remove special characters
			response.setOriginalLink(originalLink.toString());
			
		} else {
			response.setFileName("No Image found for " + response.getTitle() + " on TMDB");
			response.setOriginalLink("Image Path does not exist on TMDB for " + response.getTitle());
		}
		
		return response;
	}

	
	
	
}
