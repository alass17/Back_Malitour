package com.apiregionfront.com.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "LANGUE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Langue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLangue;
    @Column(length = 150)
    private String libelle;
}
