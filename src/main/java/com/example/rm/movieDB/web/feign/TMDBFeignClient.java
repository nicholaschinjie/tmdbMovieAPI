package com.example.rm.movieDB.web.feign;

import java.net.URI;


import org.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "theMovieDatabaseFeignClient", url = "runtimePassedIn", configuration = tMDBFeignConfig.class)
public interface TMDBFeignClient {
	
//	@RequestLine("GET") 
//	public TMDBMovieResponse requestMovieInformation(URI uri);
	
	// Fetch All Movie Information
	// Example link: https://api.themoviedb.org/3 + /movie/2/images + ?api_key=b9e34c17e1f375937c33f3ae43e76a88
	@GetMapping(value="/movie/{movieId}") 
	public ResponseEntity<JSONObject> requestMovieInformation(URI uri, @PathVariable("movieId") int movieId, @RequestParam("api_key") String token); 
	
	
	
	
	
}
