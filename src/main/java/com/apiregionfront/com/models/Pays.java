package com.apiregionfront.com.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "PAYS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPays;
    @Column(length =50)
    private String codePays;
    @Column(length = 150)
    private String nomPays;



}
