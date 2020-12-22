package spesce.springframework.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Steve P. on 12/22/2020
 * original package: spesce.springframework.mypetclinic.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}