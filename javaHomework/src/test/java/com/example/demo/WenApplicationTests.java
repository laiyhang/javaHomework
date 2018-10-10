package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Address;
import com.example.demo.domain.Grade;
import com.example.demo.domain.Student;
import com.example.demo.mapper.AddressMapper;
import com.example.demo.mapper.GradeMapper;
import com.example.demo.mapper.StudentMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WenApplicationTests {

  @Autowired
  GradeMapper gradeMapper;
  @Autowired
  AddressMapper addressMapper;
  @Autowired
  StudentMapper studentMapper;
//private StudentMapper studentMapper;
	@Test
	public void test() {
		//增加
//		this.addGrade();
//		this.addAddress();
//		this.addStudent();
		//删除
//		this.deleteGrade(1);
//		this.deleteAddress(1);
//		this.deleteStudent(1);
		//更新
//		this.updateGrade();
//		this.updateAddress();
//		this.updateStudent();
		
		//查询
//		ArrayList<Student> list = this.selectStudentBygradeid(2018);
//		System.out.println(list.size());
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		this.deleteAddressBylist(list);

	}

	 
	void addGrade(){
		Grade grade = new Grade();
		grade.setId(1);
		grade.setStuGrade("dd");
		gradeMapper.addGra(grade);
	}
	 void addAddress(){
		 Address address = new Address();
		 address.setId(1);
		 address.setAddress("j");
		 addressMapper.addAddr(address);
	 }
	 void addStudent(){
		 Student student = new Student();
		 student.setId(1);
		 student.setAddressId(1);
		 student.setAge(20);
		 student.setGradeId(2018);
		 student.setName("成龙");
		 studentMapper.addStu(student);
	 }
	 
	 void deleteGrade(int id){
		 gradeMapper.deleteById(id);
	 }
	 void deleteAddress(int id){
		 addressMapper.deleteById(id);
	 }
	 void deleteStudent(int id){
		 studentMapper.deleteStudent(id);
	 }
	 void updateGrade(){
		 Grade grade1 = new Grade();
		 grade1.setId(1);
		 grade1.setStuGrade("2018");
		 gradeMapper.updateGrade(grade1);
	 }
	 void updateAddress(){
		 Address address = new Address();
		 address.setId(1);
		 address.setAddress("k");
		 addressMapper.updateAddress(address);
	 }
	 void updateStudent(){
		 Student student = new Student();
		 student.setId(1);
		 student.setAge(22);
		 studentMapper.updateStudent(student);
	 }
	 ArrayList<Student> selectStudentBygradeid(int id){
		 ArrayList<Student> students = studentMapper.selectStudentgradeid(id);
		 return students;
	 }
//	 ArrayList<Student> findUserBy(int id){
//		 ArrayList<Student> students = studentMapper.findUserByUserQuveryVo(id);
//		 return students;
//	 }
	 void deleteAddressBylist(List<Integer> list){
		 addressMapper.deleteaddressbylist(list);
	 }
}
