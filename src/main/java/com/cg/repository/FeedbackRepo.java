package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.FeedBack;

public interface FeedbackRepo extends JpaRepository<FeedBack, Integer> {

}
