package spesce.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spesce.springframework.mypetclinic.model.Vet;
import spesce.springframework.mypetclinic.services.VetService;

import java.util.Set;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.services.map
 * ------------------------------------------------------------------------------------------
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {



    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
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
