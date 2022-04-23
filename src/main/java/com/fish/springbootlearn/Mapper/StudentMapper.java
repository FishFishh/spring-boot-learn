package com.fish.springbootlearn.Mapper;
import com.fish.springbootlearn.User.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Student Mapper类
 */
@Mapper
@Repository
public interface StudentMapper {
    @Select("select * from student where id = #{id}")
    Student findById(Integer id);
}
