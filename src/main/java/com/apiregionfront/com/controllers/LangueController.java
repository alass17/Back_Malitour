package com.apiregionfront.com.controllers;



import com.apiregionfront.com.Service.LangueService;
import com.apiregionfront.com.models.Activite;
import com.apiregionfront.com.models.Langue;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController

@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600 ,allowCredentials = "true")
@RequestMapping("/langue")
@AllArgsConstructor
public class LangueController {
    private final LangueService langueService;


    @PostMapping("/ajouter")
    public Langue create(@RequestBody Langue langue) {
        return langueService.ajouter(langue);
    }


    @DeleteMapping("/supprimer/{id}")
    public String delete (@PathVariable Long id) {
        return langueService.supprimer(id);
    }

    @GetMapping("/lister")
    public List<Langue> read(){
        return langueService.lister();
    }



}
