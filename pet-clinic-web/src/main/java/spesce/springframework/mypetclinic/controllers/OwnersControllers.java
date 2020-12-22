package spesce.springframework.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Steve P. on 12/22/2020
 * original package: spesce.springframework.mypetclinic.controllers
 * ------------------------------------------------------------------------------------------
 */

@Controller
@RequestMapping({"/owners"})
public class OwnersControllers {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }

}
