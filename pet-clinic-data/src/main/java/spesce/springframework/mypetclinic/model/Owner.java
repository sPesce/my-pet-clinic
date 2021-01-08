package spesce.springframework.mypetclinic.model;

import java.util.Set;

/**
 * Created By Steve P. on 12/4/2020
 * original package: spesce.springframework.mypetclinic.model
 * ------------------------------------------------------------------------------------------
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
