package spesce.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spesce.springframework.mypetclinic.model.Specialty;
import spesce.springframework.mypetclinic.model.Vet;
import spesce.springframework.mypetclinic.services.SpecialtyService;
import spesce.springframework.mypetclinic.services.VetService;

import java.util.Set;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.services.map
 * ------------------------------------------------------------------------------------------
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size() > 0){
            object.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpec = specialtyService.save(specialty);
                    specialty.setId(savedSpec.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
