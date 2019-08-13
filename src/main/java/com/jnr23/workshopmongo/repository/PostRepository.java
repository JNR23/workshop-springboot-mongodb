package com.jnr23.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jnr23.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}
