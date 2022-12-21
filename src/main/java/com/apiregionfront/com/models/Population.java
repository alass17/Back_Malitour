package com.apiregionfront.com.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POPULATION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_population;
    @Column(length = 150)
    private String nbre_population;
    @Column(length = 50)
    private Long annee;
    @ManyToOne
    @JoinColumn(name = "region_id_region")
    private Region region;
}
