package com.codeaura.store.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="tags")
public class Tag {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private int id;

     @Column(name = "name")
     private String name;

     public Tag(String name) {
        this.name = name;
     }

    @ManyToMany(mappedBy = "tags")
    @ToString.Exclude
     private Set<User> user =new HashSet<>();



}
