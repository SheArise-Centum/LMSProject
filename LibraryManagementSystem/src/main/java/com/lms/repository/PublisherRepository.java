package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
