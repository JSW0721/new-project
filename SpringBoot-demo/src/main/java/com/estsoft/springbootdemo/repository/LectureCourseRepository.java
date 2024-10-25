package com.estsoft.springbootdemo.repository;

import com.estsoft.springbootdemo.entity.LectureCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureCourseRepository extends JpaRepository<LectureCourse, Long> {
}
