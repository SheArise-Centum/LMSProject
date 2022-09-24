package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
