package com.apiregionfront.com.controllers;



import com.apiregionfront.com.Service.PaysService;
import com.apiregionfront.com.models.Pays;
import com.apiregionfront.com.models.Region;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600 ,allowCredentials = "true")
@RequestMapping("/pays")
@AllArgsConstructor
public class PaysController {
    @Autowired
    private final PaysService paysService;


    @PostMapping("/create")
    public Pays create (@RequestBody Pays pays){
        return paysService.creer(pays);
    }



    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return paysService.supprimer(id);
    }


    @GetMapping("/lister")
    public List<Pays> read(){
        return paysService.lister();
    }

}
