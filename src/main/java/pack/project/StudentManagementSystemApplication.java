package pack.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pack.project.entity.Student;
import pack.project.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1=new Student("Depak","survase","deepaksurvase@gmail.com");
		 * studentRepository.save(student1); Student student2=new
		 * Student("Deepak","s","deepaks@gmail.com"); studentRepository.save(student2);
		 * Student student3=new Student("sumit", "gaikwad", "sumit@gmail.com");
		 * studentRepository.save(student3);
		 */
	}

}
