package spesce.springframework.mypetclinic.model;

import java.time.LocalDate;

/**
 * Created By Steve P. on 12/4/2020
 * original package: spesce.springframework.mypetclinic.model
 * ------------------------------------------------------------------------------------------
 */
public class Pet extends BaseEntity{
    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
