package spesce.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spesce.springframework.mypetclinic.model.Specialty;
import spesce.springframework.mypetclinic.services.SpecialtyService;

import java.util.Set;

/**
 * -------------------------------------------------------------
 * Created By Steve P. on 1/8/2021
 * original package: spesce.springframework.mypetclinic.services.map
 */
@Service
public class SpecialtyMapService  extends AbstractMapService<Specialty,Long> implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
