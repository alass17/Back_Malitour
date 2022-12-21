package com.apiregionfront.com.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "REGION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegion;
    @Column(length = 150)
    private String codeRegion;
    @Column(length = 150)
    private String nomRegion;
    @Column(length = 150)
    private String superficie;
    private String imageregion;
    private String description;


 @ManyToOne
 @JoinColumn(name = "pays_id_pays")
 private Pays pays;
 @ManyToOne
 @JoinColumn(name = "langue_id_langue")
 private Langue langue;

 @ManyToOne
 @JoinColumn(name = "activite_id_activite")
 private Activite activite;
}
