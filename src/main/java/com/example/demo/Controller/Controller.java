package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.Service;

@RestController
public class Controller {

    @Autowired
    private Service service;

    @GetMapping("/home")
    public String mesg() {
        return "this is controller";
    }

    @GetMapping("/Students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @GetMapping("/Students/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return service.getStudent(id);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    // @DeleteMapping("/deleteStudent/{sid}")
    // public void deleteUser(@PathVariable int id) throws Exception {
    // Student st = service.deleteById(id);
    // if (st == null)
    // throw new Exception("id: " + id);
    // }
}
