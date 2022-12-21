package com.apiregionfront.com.controllers;


import com.apiregionfront.com.Service.ActiviteService;
import com.apiregionfront.com.models.Activite;
import com.apiregionfront.com.models.Pays;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600 ,allowCredentials = "true")
@RequestMapping("/activite")
@AllArgsConstructor
public class ActiviteControler {
    private final ActiviteService activiteService;


    @PostMapping("/ajouter")
    public Activite create(@RequestBody Activite activite) {
        return activiteService.ajouter(activite);
    }


    @DeleteMapping("/supprimer/{id}")
    public String delete(@PathVariable Long id) {
        return activiteService.supprimer(id);
    }


    @GetMapping("/lister")
    public List<Activite> read(){
        return activiteService.lister();
    }
}
