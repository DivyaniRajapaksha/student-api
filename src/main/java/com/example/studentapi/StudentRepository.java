package com.example.studentapi;

public interface StudentRepository {
    void save(Student student);
     Student get(String id);
     Student deleteStudent(String id);
     void updateStudent(String id,Student student);
}
