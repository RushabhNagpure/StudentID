package com;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

public class StudentController {
    Map<Integer,Student> db = new HashMap<>();

    @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int admnNo){
        return db.get(admnNo);
    }

    @PostMapping("/add")
    String addStudent(@RequestBody() Student student){
         db.put(student.getAdmnNo(), student);
         return "Student has been addad succesfully ";
    }


}
