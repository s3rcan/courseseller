package com.sha.springbootmicroservice3apigateway.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column
    private Role role;

    @Transient
    private String token;
}
