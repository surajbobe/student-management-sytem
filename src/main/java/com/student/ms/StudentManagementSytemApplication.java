package com.student.ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.ms.entity.Student;
import com.student.ms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSytemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSytemApplication.class, args);
	}

	@Autowired
	private StudentRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student student1  = new Student("Suraj", "Bobe", "surajbobe@gmail.com", "7276183531");
		Student student2  = new Student("Kiran", "Tokale", "kirantokale@gmail.com", "34656535735");
		Student student3  = new Student("Atul", "Pate", "atulpate@gmail.com", "7865183531");
		Student student4  = new Student("Shubham", "Kale", "shubhamkale@gmail.com", "7686483531");
		Student student5  = new Student("Karan", "Bobe", "karanbobe@gmail.com", "7646183531");
		
		repository.save(student1);
		repository.save(student2);
		repository.save(student3);
		repository.save(student4);
		repository.save(student5);
		
		
	}

}
