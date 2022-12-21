package com.apiregionfront.com.Service;


import com.apiregionfront.com.models.Region;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RegionService {
    Region creer(Region region);
    List<Region> lister();
    Region modifier(Long id,Region region);
    String supprimer(Long id);
}
