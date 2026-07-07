package com.example.parkseojin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    final private studentRepository studentRepository;

    public void studentCreate(String name, Integer age){
        Student student = new Student(name, age);
        studentRepository.save(student);
    }
}