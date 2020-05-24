package com.example.rm.movieDB.web.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.rm.movieDB.model.TMDBPersonSchema;
import com.example.rm.movieDB.model.UserExampleRequest;



@Component
public class URITemplateService {
	
	// TODO: These values should NOT be stored here; these ideally would be 
	// stored as environment properties, and injected during runtime. 
	@Value("${API_KEY}")
	private static final String PROTOCOL = "https";
	private static final String API_KEY = "b9e34c17e1f375937c33f3ae43e76a88"; 
	private static final String GET_PERSON_BASE_URL = "api.themoviedb.org";
	private static final String GET_IMAGE_BASE_URL = "image.tmdb.org"; 

	public URI generatePersonApiUrl(UserExampleRequest config, int id) throws URISyntaxException {
		URI uri = new URIBuilder()
				.setScheme(PROTOCOL)
				.setHost(GET_PERSON_BASE_URL)
				.setPath("3/" + config.getCategory() + "/" + id)
				.setParameter("api_key", API_KEY)
				.build();
		return uri;
	}

	public URI generateImageApi(UserExampleRequest config, TMDBPersonSchema tmdbPersonSchema) throws URISyntaxException {
		URI originalLink = new URIBuilder()
				.setScheme(PROTOCOL)
	    		.setHost(GET_IMAGE_BASE_URL)
	    		.setPath("t/p/" + config.getFilesize() + tmdbPersonSchema.getProfilePath())
	    		.build(); 
		return originalLink;
	}

}
