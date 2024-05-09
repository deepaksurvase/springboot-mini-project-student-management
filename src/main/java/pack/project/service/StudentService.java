package pack.project.service;

import java.util.List;

import pack.project.entity.Student;

public interface StudentService {
List<Student>getAllStudents();

Student saveStudent(Student student);

Student getStudentById(Long id);
Student updateStudent(Student student);

void deleteStudentByid(Long id);
}
