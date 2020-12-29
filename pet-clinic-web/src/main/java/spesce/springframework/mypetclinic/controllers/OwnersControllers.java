package spesce.springframework.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spesce.springframework.mypetclinic.services.OwnerService;

/**
 * Created By Steve P. on 12/22/2020
 * original package: spesce.springframework.mypetclinic.controllers
 * ------------------------------------------------------------------------------------------
 */

@Controller
@RequestMapping({"/owners"})
public class OwnersControllers {

    private final OwnerService ownerService;

    public OwnersControllers(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

}
