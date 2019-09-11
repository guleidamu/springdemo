package com.example.damuMyschool.mapper;


import com.example.damuMyschool.data.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}