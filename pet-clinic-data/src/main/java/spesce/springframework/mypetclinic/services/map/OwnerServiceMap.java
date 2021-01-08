package spesce.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spesce.springframework.mypetclinic.model.Owner;
import spesce.springframework.mypetclinic.model.Pet;
import spesce.springframework.mypetclinic.services.OwnerService;
import spesce.springframework.mypetclinic.services.PetService;
import spesce.springframework.mypetclinic.services.PetTypeService;

import java.util.Set;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.services.map
 * ------------------------------------------------------------------------------------------
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object != null)
        {
            if(object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else
                        throw new RuntimeException("Pet Type Required.");

                    if(pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else
            return null;


    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
