package spesce.springframework.mypetclinic.services;

import spesce.springframework.mypetclinic.model.Owner;
import spesce.springframework.mypetclinic.model.Pet;

import java.util.Set;

public interface PetServices {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
