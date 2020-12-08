package spesce.springframework.mypetclinic.model;

import java.io.Serializable;

/**
 * Created By Steve P. on 12/8/2020
 * original package: spesce.springframework.mypetclinic.model
 * ------------------------------------------------------------------------------------------
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
