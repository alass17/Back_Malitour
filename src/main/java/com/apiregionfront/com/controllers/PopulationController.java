package com.apiregionfront.com.controllers;


import com.apiregionfront.com.Service.PopulationService;
import com.apiregionfront.com.models.Population;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/population")
@AllArgsConstructor
public class PopulationController {
       @Autowired
        private final PopulationService populationService;


        @PostMapping("/create")
        public Population create (@RequestBody Population population){
            return populationService.ajouter(population);
        }



        @PutMapping("/update/{id}")
        public Population update(@PathVariable Long id, @RequestBody Population population) {
            return populationService.modifier(id, population);
        }



        @DeleteMapping("/delete/{id}")
        public String delete (@PathVariable Long id){
            return populationService.supprimer(id);
        }

    }

