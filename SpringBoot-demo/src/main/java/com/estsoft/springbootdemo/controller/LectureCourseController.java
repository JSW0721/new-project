package com.estsoft.springbootdemo.controller;

import com.estsoft.springbootdemo.entity.LectureCourse;
import com.estsoft.springbootdemo.repository.LectureCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class LectureCourseController {
    @Autowired
    private LectureCourseRepository lcrep;

    @PostMapping("/lecture/course")
    public void savelectureCourse(
            @RequestParam String title,
            @RequestParam Long instructor_id,
            @RequestParam Integer capacity,
            @RequestParam
            @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate from,
            @RequestParam
            @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate to,
            @RequestParam String desc
            )
    {
        LectureCourse lc = new LectureCourse();
        lc.setTitle(title);
        lc.setInstructorId(instructor_id);
        lc.setCapacity(capacity);
        lc.setFrom(from);
        lc.setTo(to);
        lc.setDesc(desc);
        lcrep.save(lc);
    }
}
