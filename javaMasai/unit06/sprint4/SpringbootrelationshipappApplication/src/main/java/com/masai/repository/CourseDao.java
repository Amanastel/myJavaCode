package com.masai.repository;

import com.masai.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Integer> {
}
