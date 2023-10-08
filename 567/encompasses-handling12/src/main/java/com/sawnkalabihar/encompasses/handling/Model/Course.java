package com.sawnkalabihar.encompasses.handling.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ID;
    private String title;
    private String description;
    private String duration;

   @ManyToMany( cascade = CascadeType.ALL)
    private Set<Student> studentSet = new HashSet<>();
}
