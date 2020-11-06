package comp3095.assignment2.thelions.demo.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @RequestMapping("/index")
    public String index() {
        return "index"; }

    @RequestMapping("/register")
    public String register() {
        return "@{/register.html}"; }

}


