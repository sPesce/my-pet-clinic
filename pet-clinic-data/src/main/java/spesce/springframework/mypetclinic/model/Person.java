package spesce.springframework.mypetclinic.model;

/**
 * Created By Steve P. on 12/4/2020
 * original package: spesce.springframework.mypetclinic.model
 * ------------------------------------------------------------------------------------------
 */
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
