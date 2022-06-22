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


        regionModel patagonia = new regionModel("Patagonia","Argentina", "About 2 Million","cold and dry", "/images/South America/Patagonia.png");
        regionRepo.save(patagonia);

        regionModel aysen = new regionModel("Aysen", "Chile", "102,317", "Cool Oceanic", "/images/Province/Aysen_Chile/Aysen_in_Chile_2018.png");
        regionRepo.save(aysen);

        regionModel losLagos = new regionModel("Los Lagos","Chile", "823,204", "Tropical Savanna", "/images/Province/Los_Lagos_Chile/Los_Lagos_in_Chile_2018.png");
        regionRepo.save(losLagos);

        regionModel magallanes = new regionModel("Magallanes", "Chile", "165,5932", "Tundra", "/images/Province/Magallanes_Chile/Magallanes_and_Antartica_Chilena_in_Chile.png");
        regionRepo.save(magallanes);



    }
}
