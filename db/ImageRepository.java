package com.example.rm.movieDB.db;

import com.example.rm.movieDB.model.ImageResponseSchema;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ImageRepository extends MongoRepository<ImageResponseSchema, String>{
	
	public ImageResponseSchema findByid(Integer photoId);
	public ImageResponseSchema findByName(String name);
	public ImageResponseSchema findByFileName(String photoName);
	public ImageResponseSchema findByOriginalLink(String link); 
}
