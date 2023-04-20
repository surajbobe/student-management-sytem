package com.student.ms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.ms.dto.StudentResponse;
import com.student.ms.entity.Student;
import com.student.ms.repository.StudentRepository;
import com.student.ms.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

	private final StudentRepository studentRepository;
	
	@Override
	public List<StudentResponse> getAllStudents() {
		
		List<Student> studentList = studentRepository.findAll();
		
		return studentList.stream().map(student -> mapToStudentResponse(student)).toList();
	}

	private StudentResponse mapToStudentResponse(Student student){
		return   StudentResponse
				.builder()
				.id(student.getId())
				.firstName(student.getFirstName())
				.lastName(student.getLastName())
				.email(student.getEmail())
				.number(student.getNumber())
				.build();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		Student oldStudent = studentRepository.findById(student.getId()).get();
		oldStudent.setFirstName(student.getFirstName());
		oldStudent.setLastName(student.getLastName());
		oldStudent.setNumber(student.getNumber());
		oldStudent.setEmail(student.getEmail());
		
		return studentRepository.save(oldStudent);
	}

	@Override
	public void deleteStudentById(Long id) {	
		studentRepository.deleteById(id);
	}
}
