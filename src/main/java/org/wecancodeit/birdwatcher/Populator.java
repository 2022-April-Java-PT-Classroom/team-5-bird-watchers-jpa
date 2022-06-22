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

        regionModel patagonia = new regionModel("Patagonia","Argentina", "About 2 Million","cold and dry", "Image");
        regionRepo.save(patagonia);

        regionModel aysen = new regionModel("Aysen", "Chile", "102,317", "Cool Oceanic", "Image");
        regionRepo.save(aysen);

        regionModel losLagos = new regionModel("Los Lagos","Chile", "823,204", "Tropical Savanna", "Image");
        regionRepo.save(losLagos);

        regionModel magallanes = new regionModel("Magallanes", "Chile", "165,5932", "Tundra", "Image");
        regionRepo.save(magallanes);


    }
}
