package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.regionModel;
import org.wecancodeit.birdwatcher.repo.RegionRepository;

import javax.annotation.Resource;
import javax.swing.plaf.synth.Region;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String...args) throws Exception {
//
//        regionModel theAndes = new regionModel("The Andes");
//        regionRepo.save(theAndes);
//
//        regionModel theNorth = new regionModel("The North");
//        regionRepo.save(theAndes);
//
//        regionModel thePampas = new regionModel("The Pampas");
//        regionRepo.save(thePampas);
//
//        regionModel patagonia = new regionModel("Patagonia");
//        regionRepo.save(patagonia);
    }
}
