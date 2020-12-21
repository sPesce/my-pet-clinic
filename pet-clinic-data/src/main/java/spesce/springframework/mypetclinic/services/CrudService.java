package spesce.springframework.mypetclinic.services;

import java.util.Set;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.services
 * ------------------------------------------------------------------------------------------
 */
public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
