package com.vamandeshmukh.demo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vamandeshmukh.demo.dtos.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

}
