package com.school.demo.repository;

import com.school.demo.entity.Director;
import com.school.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Date: 1/29/2021 Time: 12:14 PM
 * <p>
 * TODO: WRITE THE DESCRIPTION HERE
 *
 * @author Vladislav_Zlatanov
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByUsername(String userName);
}
