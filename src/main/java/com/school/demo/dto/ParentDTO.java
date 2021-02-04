package com.school.demo.dto;

import com.school.demo.entity.Role;
import com.school.demo.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ParentDTO {
    private long id;
    private String username;
    private String password;
    private String role;
    private String firstName;
    private String lastName;
    private Set<Student> kids;
}
