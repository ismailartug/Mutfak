package com.Artinc.Mutfak.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name="purchase-history")
public class PurchaseHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="userId",nullable = false)
    private String userId;

    @Column(name="foodId",nullable = false)
    private String foodId;

    @Column(name="price",nullable = false)
    private String price;

    @Column(name="createTime",nullable = false)
    private LocalDateTime createTime;

    private LocalDateTime purchaseTime;
}
