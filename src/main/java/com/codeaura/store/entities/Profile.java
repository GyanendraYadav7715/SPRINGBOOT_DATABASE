package com.codeaura.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "bio")
    private String bio;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name="date_of_birth")
    private LocalDate date_of_birth;
    @Column(name = "loyalty_points")
    private Integer loyalty_points ;

    @OneToOne
    @JoinColumn(name="id")
    @MapsId
    @ToString.Exclude
    private User user;
}
