package com.sha.springbootmicroservice1course.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String subtitle;

    @Column
    private Double price;

    @Column
    private LocalDateTime createTime;
}
