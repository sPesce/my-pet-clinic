package spesce.springframework.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Steve P. on 12/21/2020
 * original package: spesce.springframework.mypetclinic.controllers
 * ------------------------------------------------------------------------------------------
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index.htmlm"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}
