package com.example.bookreview.bookreview.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookreview.bookreview.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
