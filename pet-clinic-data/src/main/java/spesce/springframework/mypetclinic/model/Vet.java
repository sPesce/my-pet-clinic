package spesce.springframework.mypetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Steve P. on 12/4/2020
 * original package: spesce.springframework.mypetclinic.model
 * ------------------------------------------------------------------------------------------
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
