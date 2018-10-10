package com.example.demo.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Grade;

@Mapper
public interface GradeMapper {
	
	public void addGra(Grade grade);
	public Grade findById(int id);
	
	public void deleteById(int id);
	
	public void updateGrade(Grade grade);

}
