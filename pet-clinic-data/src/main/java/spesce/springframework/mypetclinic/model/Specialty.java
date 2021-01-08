package spesce.springframework.mypetclinic.model;

/**
 * -------------------------------------------------------------
 * Created By Steve P. on 1/8/2021
 * original package: spesce.springframework.mypetclinic.model
 */
public class Specialty extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
