package com.example.rm.movieDB.db;

import com.example.rm.movieDB.model.ImageDefaultSchema;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ImageRepository extends MongoRepository<ImageDefaultSchema, String>{
	
	public ImageDefaultSchema findByid(Integer photoId); 
	public ImageDefaultSchema findByTitle(String name);
	public ImageDefaultSchema findByFileName(String filename);
	public ImageDefaultSchema findByOriginalLink(String link);
	public List<ImageDefaultSchema> findAll();
	
}
