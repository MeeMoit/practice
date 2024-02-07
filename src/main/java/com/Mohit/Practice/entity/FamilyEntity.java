package com.Mohit.Practice.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Entity
@Table(name = "family")
@AllArgsConstructor
@NoArgsConstructor
public class FamilyEntity {
    @Id
    @Column(name = "memberId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "relationship")
    private String relationship;
    @Column(name = "email")
    private String email;
    @Column(name = "contact")
    private long contact;
}
