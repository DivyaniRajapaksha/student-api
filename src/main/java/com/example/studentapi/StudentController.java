package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    StudentRepository studentRepository=new inMemoryStudentRepository();

    //Create Student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        //todo: logic to save the student in the database
        studentRepository.save(student);

    }

    //retrieve student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return studentRepository.get(id);
    }

    //delete student
    @DeleteMapping("student/{id}")
    public String deleteStudent(@PathVariable String id){
        Student student=studentRepository.deleteStudent(id);
        if(student!=null){
            return ("Student " + student.name+" Deleted");
        }else{
            return ("Student " + student.name+" Unable to delete");
        }
    }

    //update student
    @PutMapping("student/{id}")
    public void updateStudent(@RequestBody Student student, @PathVariable String id){
        studentRepository.updateStudent(id,student);
    }
}
