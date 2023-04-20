package com.student.ms.service;

import java.util.List;

import com.student.ms.dto.StudentResponse;
import com.student.ms.entity.Student;

public interface StudentService {

	public List<StudentResponse>  getAllStudents();

	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public Student updateStudent(Student student);

	public void deleteStudentById(Long id);
}
