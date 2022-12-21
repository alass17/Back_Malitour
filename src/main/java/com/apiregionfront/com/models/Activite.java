package com.apiregionfront.com.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ACTIVITE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActivite;
    @Column(length = 50)
    private String domaine;



}
