package com.apiregionfront.com.controllers;




import com.apiregionfront.com.Service.ActiviteService;
import com.apiregionfront.com.Service.LangueService;
import com.apiregionfront.com.Service.PaysService;
import com.apiregionfront.com.Service.RegionService;
import com.apiregionfront.com.images.ConfigImage;
import com.apiregionfront.com.models.Activite;
import com.apiregionfront.com.models.Langue;
import com.apiregionfront.com.models.Pays;
import com.apiregionfront.com.models.Region;
import com.apiregionfront.com.payload.request.repository.PaysRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:8100", maxAge = 3600 ,allowCredentials = "true")
@RequestMapping("/region")
@AllArgsConstructor
public class RegionController {
    @Autowired
    private final RegionService regionService;

    @Autowired
    PaysService paysService;

    @Autowired
    LangueService langueService;
    @Autowired
    ActiviteService activiteService;



    @PostMapping("/create/{pays}/{activite}/{langue}")
    //@PreAuthorize("hasRole('ADMIN')")
    public Region create (@Param("codeRegion") String codeRegion,
                          @Param("nomRegion") String nomRegion, @Param("superficie") String superficie,
                          @Param("imageregion") MultipartFile imageregion,
                          @Param("descripion") String description,
                          @PathVariable("pays") String pays,
                          @PathVariable("activite") String activite,
                          @PathVariable("langue") String langue
                          ) throws IOException {
        Region region = new Region();
        region.setCodeRegion(codeRegion);
        region.setNomRegion(nomRegion);
        region.setSuperficie(superficie);
        region.setDescription(description);
        String img = StringUtils.cleanPath(imageregion.getOriginalFilename());
        region.setImageregion(img);
        String uploaDir = "C:\\Users\\amalle\\Documents\\Frontend_Malitour\\src\\assets\\img";
        ConfigImage.saveimg(uploaDir, img, imageregion);

        Pays pays1 = paysService.TrouverPaysParNom(pays);
        region.setPays(pays1);

        Langue langue1 = langueService.TrouverLangueParLibelle(langue);
        region.setLangue(langue1);

        Activite activite1 = activiteService.TrouverActiviteParDomaine(activite);
        region.setActivite(activite1);
        return regionService.creer(region);
    }


    @GetMapping("/read")
    public List<Region> read(){
        return regionService.lister();
    }


    @PutMapping("/update/{id}")
    public Region update(@PathVariable Long id, @RequestBody Region region) {
        return regionService.modifier(id, region);

    }


    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id){
        return regionService.supprimer(id);
    }

}
