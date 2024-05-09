package pack.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pack.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student , Long> {

}
