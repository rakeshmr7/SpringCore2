package com.example.spring_core.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.spring_core.College;
import com.example.spring_core.Student;

@Configuration
public class MyConfig {
    @Bean(name = "s1")
    public Student getStudent() {
        Student s = new Student();
        s.setRollno(101);
        s.setName("Rahul");
        s.setMarks(90);
        return s;
    }

    @Bean(name = "c1")
    public College getCollege() {
        College c = new College();
        c.setC_id(1);
        c.setC_name("ABC College");
        return c;
    }   
}
