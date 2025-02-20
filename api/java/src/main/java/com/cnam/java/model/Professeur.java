package com.cnam.java.model;

import jakarta.persistence.*;
import lombok.*; 

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String specialisation;
}