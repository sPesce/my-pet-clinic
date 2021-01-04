package spesce.springframework.mypetclinic.services.map;

import spesce.springframework.mypetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.services.map
 * ------------------------------------------------------------------------------------------
 */
public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object){

        if(object != null){
            if(object.getId() == null)
                object.setId(getNextId());

            map.put(object.getId(),object);
        } else {
            throw new RuntimeException("Objects cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId = null;

        try{
            nextId =  Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
