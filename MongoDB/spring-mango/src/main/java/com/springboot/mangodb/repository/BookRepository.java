package com.springboot.mangodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mangodb.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

}
