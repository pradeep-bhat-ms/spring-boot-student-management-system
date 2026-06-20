package com.example.StudentManagementSpringBoot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentManagementSpringBoot.Entity.StudentEntity;
import com.example.StudentManagementSpringBoot.Repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/save")
	public List<StudentEntity> save(@RequestBody List<StudentEntity> studentEntity){
		return studentRepository.saveAll(studentEntity);
	}
	
	@GetMapping("/get")
	public List<StudentEntity> get(){
		return studentRepository.findAll();
	}
	@GetMapping("/{id}")
	public StudentEntity getbyId(@PathVariable int id) {
		Optional<StudentEntity> student=studentRepository.findById(id);
		return  student.orElse(null);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		studentRepository.deleteById(id);
	}
	@PutMapping("/{id}")
	public StudentEntity updateById(@PathVariable int id ,@RequestBody StudentEntity studententity){
		{
			Optional<StudentEntity> existingStudent= studentRepository.findById(id);
			if(existingStudent.isPresent()) {
				StudentEntity s= existingStudent.get();
				s.setName(studententity.getName());
				s.setEmail(studententity.getEmail());
				s.setAge(studententity.getAge());
				s.setCourse(studententity.getCourse());
				s.setMobileno(studententity.getMobileno());
				return studentRepository.save(s);
				
			}
			else {
				return null;
			}
		}
	
	}
}
