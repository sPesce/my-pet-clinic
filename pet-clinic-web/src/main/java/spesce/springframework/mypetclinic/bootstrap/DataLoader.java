package spesce.springframework.mypetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spesce.springframework.mypetclinic.model.*;
import spesce.springframework.mypetclinic.services.OwnerService;
import spesce.springframework.mypetclinic.services.PetTypeService;
import spesce.springframework.mypetclinic.services.SpecialtyService;
import spesce.springframework.mypetclinic.services.VetService;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created By Steve P. on 12/23/2020
 * original package: spesce.springframework.mypetclinic.bootstrap
 * ------------------------------------------------------------------------------------------
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if(count == 0) loadData();
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loading Owners...");
        Owner owner1 = new Owner();
        owner1.setFirstName("Bob");
        owner1.setLastName("Bobbington");
        owner1.setAddress("123 Brickerel St");
        owner1.setCity("Miami");
        owner1.setTelephone("5712350060");
        ownerService.save(owner1);

        Pet bobsPet = new Pet();
        bobsPet.setPetType(savedDogPetType);
        bobsPet.setOwner(owner1);
        bobsPet.setName("Harley");
        bobsPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(bobsPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fred");
        owner2.setLastName("Freddington");
        owner2.setAddress("123 Brickerel St");
        owner2.setCity("Miami");
        owner2.setTelephone("5712350060");
        ownerService.save(owner2);
        System.out.println("Owners Loaded");
        System.out.println("Loading Vets...");

        Pet fredsPet = new Pet();
        fredsPet.setBirthDate(LocalDate.now());
        fredsPet.setName("Squag");
        fredsPet.setOwner(owner2);
        fredsPet.setPetType(savedCatPetType);
        owner2.getPets().add(fredsPet);

        Specialty radiology  = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadSpec = specialtyService.save(radiology);

        Specialty surgery  = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgSpec = specialtyService.save(surgery);

        Specialty dentistry  = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentSpec = specialtyService.save(dentistry);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialties().add(savedRadSpec);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Morty");
        vet2.setLastName("Smith");
        vet2.getSpecialties().add(savedSurgSpec);
        vetService.save(vet2);

        System.out.println("Loaded Vets");
    }
}
