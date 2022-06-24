package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.*;
import org.wecancodeit.birdwatcher.repo.*;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private countriesRepository countriesRepo;

    @Resource
    private RegionRepository regionRepo;

    @Resource
    private habitatRepository habitatRepo;

    @Resource
    private BirdRepository birdRepo;

    @Override
    public void run(String...args) throws Exception {
        ContinentModel southamerica = new ContinentModel("South America", "description", "image");
        continentRepo.save(southamerica);

        countriesModel chile = new countriesModel("Chile", "description", "/images/Province/Aysen_Chile/Aysen.jpg", southamerica);
        countriesModel argentina = new countriesModel("Argentina", "description", "/images/Province/Chubut_Argentina/Chubut.jpg", southamerica);
        countriesRepo.save(chile);
        countriesRepo.save(argentina);

        regionModel patagonia = new regionModel("Patagonia","Argentina", "About 2 Million","cold and dry", "/images/South America/Patagonia.png", argentina);
        regionModel aysen = new regionModel("Aysen", "Chile", "102,317", "Cool Oceanic", "/images/Province/Aysen_Chile/Aysen_in_Chile_2018.png", chile);
        regionModel losLagos = new regionModel("Los Lagos","Chile", "823,204", "Tropical Savanna", "/images/Province/Los_Lagos_Chile/Los_Lagos_in_Chile_2018.png",chile);
        regionModel magallanes = new regionModel("Magallanes", "Chile", "165,5932", "Tundra", "/images/Province/Magallanes_Chile/Magallanes_and_Antartica_Chilena_in_Chile.png", chile);
        regionRepo.save(patagonia);
        regionRepo.save(aysen);
        regionRepo.save(losLagos);
        regionRepo.save(magallanes);

        habitatModel habitat1= new habitatModel("Andean", "rocky, mountainous areas", "images/Birds/Andean_Condor/AndeanMap.png", patagonia);
        habitatModel habitat2= new habitatModel("Austral", "wooded country, but also shrubland and farmland", "/images/Birds/Austral_Parakeet/Enicognathus_ferrugineus_map.svg.png", aysen);
        habitatModel habitat3= new habitatModel("Chilean","salt lagoons and soda lakes","/images/Birds/Chilean_Flamingo/800px-Phoenicopterus_chilensis_map.png", losLagos);
        habitatModel habitat4= new habitatModel("Magallanes", "Arctic coast", "/images/Birds/Magellanic_Penguin/Spheniscus_magellanicus_map.png", magallanes);
        habitatRepo.save(habitat1);
        habitatRepo.save(habitat2);
        habitatRepo.save(habitat3);
        habitatRepo.save(habitat4);

        BirdModel bird1 = new BirdModel("Condor", "The Andean condor is the largest living land bird capable of flight", "/images/Birds/Andean_Condor/Andean_condor.jpg", habitat1);
        BirdModel bird2 = new BirdModel("Parakeet", "There are two recognized subspecies.", "/images/Birds/Austral_Parakeet/Austral_Parakeet.jpg", habitat2);
        BirdModel bird3 = new BirdModel("Flamingo", "Pink Floyd the Flamingo", "/images/Birds/Chilean_Flamingo/Chilenischer_Flamingo.jpg", habitat3);
        BirdModel bird4 = new BirdModel("Penguin", "Argentina, Chile, and the Falkland Islands", "/images/Birds/Magellanic_Penguin/Magellanic_penguin.jpg", habitat4);
        birdRepo.save(bird1);
        birdRepo.save(bird2);
        birdRepo.save(bird3);
        birdRepo.save(bird4);
    }
}
