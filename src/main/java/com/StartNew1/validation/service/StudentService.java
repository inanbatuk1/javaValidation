package com.StartNew1.validation.service;

import com.StartNew1.validation.models.Student;
import com.StartNew1.validation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public  void  save (Student student){
        studentRepository.save(student);
    }
}
