package com.example.studentapi;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.HashMap;
import java.util.Map;

public class inMemoryStudentRepository implements StudentRepository{
    Map<String, Student> database=new HashMap<>();
    @Override
    public void save(Student student) {

            database.put(student.id,student);
             System.out.println("Student Saved");
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }

    @Override
    public Student deleteStudent(String id) {
        return database.remove(id);
    }

    @Override
    public void updateStudent(String id, Student student) {
         database.put(id, student);
        System.out.println("Student Updated");
    }
}
