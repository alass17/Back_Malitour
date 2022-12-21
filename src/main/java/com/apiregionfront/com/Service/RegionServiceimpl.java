package com.apiregionfront.com.Service;

import com.apiregionfront.com.models.Region;
import com.apiregionfront.com.payload.request.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class RegionServiceimpl implements RegionService{
    private final RegionRepository regionRepository;
    @Override
    public Region creer(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> lister() {
        return regionRepository.findAll();
    }

    @Override
    public Region modifier(Long id, Region region) {
        return regionRepository.findById(id)
                .map(r->{
                    r.setCodeRegion(region.getCodeRegion());
                    r.setNomRegion(region.getNomRegion());
                    r.setSuperficie(region.getSuperficie());
                    r.setLangue(region.getLangue());
                    r.setPays(region.getPays());
                    r.setImageregion(region.getImageregion());
                    r.setActivite(region.getActivite());
                    r.setDescription(region.getDescription());
                    return regionRepository.save(r);
                }).orElseThrow(() -> new RuntimeException("Region non trouvée !"));


    }

    @Override
    public String supprimer(Long id) {
        regionRepository.deleteById(id);
        return "Region supprimée";
    }
}
