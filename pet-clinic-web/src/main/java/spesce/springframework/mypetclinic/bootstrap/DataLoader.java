package spesce.springframework.mypetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spesce.springframework.mypetclinic.model.Owner;
import spesce.springframework.mypetclinic.model.Vet;
import spesce.springframework.mypetclinic.services.OwnerService;
import spesce.springframework.mypetclinic.services.VetService;
import spesce.springframework.mypetclinic.services.map.OwnerServiceMap;
import spesce.springframework.mypetclinic.services.map.VetServiceMap;

/**
 * Created By Steve P. on 12/23/2020
 * original package: spesce.springframework.mypetclinic.bootstrap
 * ------------------------------------------------------------------------------------------
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Owners...");
        Owner owner1 = new Owner();
        owner1.setFirstName("Bob");
        owner1.setLastName("Bobbington");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fred");
        owner2.setLastName("Freddington");
        ownerService.save(owner2);
        System.out.println("Owners Loaded");
        System.out.println("Loading Vets...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Morty");
        vet2.setLastName("Smith");
        vetService.save(vet2);

        System.out.println("Loaded Vets");   
    }
}
