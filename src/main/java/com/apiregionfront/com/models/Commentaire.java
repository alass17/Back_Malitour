package com.apiregionfront.com.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Commentaires")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcom;
    private String libelle;
    private Date date;




    @ManyToOne
    private Region region;
}

