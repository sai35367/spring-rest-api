package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.User;

import com.example.demo.Model.Student;

@org.springframework.stereotype.Service

public class Service {
    private List<Student> list = new ArrayList<>();

    public List<Student> getStudents() {
        // list = new ArrayList<>();
        list.add(new Student("sai", 10, "bbsr"));
        list.add(new Student("subham", 11, "puri"));
        return list;
    }

    public Student getStudent(int id) {
        Student stid = null;
        for (Student studentId : list) {
            if (studentId.getRoll() == id) {
                stid = studentId;
                break;
            }
        }
        return stid;
    }

    public Student addStudent(Student student) {
        list.add(student);
        return student;
    }

    public Student deleteStudents(Integer id) {
        Iterator<Student> iterator = list.iterator();
        Student st = null;
        while (iterator.hasNext()) {
            Student user = iterator.next();
            if (user.getRoll() == id) {
                iterator.remove();
                st = user;
            }

        }
        return st;
    }

    public Student UpdateStudents(Integer id, Student student) {
        return null;
    }

    public Student deleteById(int id) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student st = iterator.next();
            if (st.getRoll() == id) {
                iterator.remove();
                return st;
            }
        }
        return null;
    }
}
