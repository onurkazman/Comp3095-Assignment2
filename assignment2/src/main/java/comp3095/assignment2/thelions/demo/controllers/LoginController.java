package comp3095.assignment2.thelions.demo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String index() {
        return "login"; }


}


