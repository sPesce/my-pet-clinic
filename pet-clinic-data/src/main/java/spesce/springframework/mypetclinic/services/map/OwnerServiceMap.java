package spesce.springframework.mypetclinic.services.map;

import org.springframework.stereotype.Service;
import spesce.springframework.mypetclinic.model.Owner;
import spesce.springframework.mypetclinic.services.OwnerService;

import java.util.Set;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.services.map
 * ------------------------------------------------------------------------------------------
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
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
