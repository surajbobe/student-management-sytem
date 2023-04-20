package com.student.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.ms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
