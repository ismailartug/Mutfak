package com.Artinc.Mutfak.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name="foods")
@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="foodName", nullable = false,length = 100)
    private String foodName;

    @Column(name="price",nullable = false,length = 100)
    private String price;

    @Column(name="description",nullable = false,length = 100)
    private String description;

    @Column(name="seller",nullable = false,length = 100)
    private String Seller;

    // .jpg

    @Column(name="createTime")
    private LocalDateTime createTime;

}
