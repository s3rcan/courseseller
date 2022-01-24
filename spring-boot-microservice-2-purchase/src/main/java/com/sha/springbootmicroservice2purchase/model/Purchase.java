package com.sha.springbootmicroservice2purchase.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long userId;

    @Column
    private Long courseId;

    @Column
    private String title;

    @Column
    private Double price;

    @Column
    private LocalDateTime purchaseTime;
}
