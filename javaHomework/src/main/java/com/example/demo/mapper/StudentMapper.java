package com.example.demo.mapper;
import java.util.ArrayList;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Student;

@Mapper
public interface StudentMapper {
	public void addStu(Student student);
	public Student findById(int id);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
	public ArrayList<Student> selectStudentgradeid(int id);
	
	Student selectstudentbymap(Map<String, Object> map);
	int selectclassidbyid(int id);
	
	
//	public void findUserByUserQuveryVo(int id);

	 

		//<!-- 查询员工，要求，携带了哪个字段查询条件就带上这个字段的值 -->
//	public ArrayList<Student> getEmpsByConditionIf(Student  student);
		
	}


