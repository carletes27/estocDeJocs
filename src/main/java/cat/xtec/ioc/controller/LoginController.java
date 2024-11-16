/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */

@Controller
public class LoginController {

// Mètode que maneja la petició GET per accedir a la pàgina de login.
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

// Mètode que maneja la petició GET quan el login ha fallat.
    @RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
    public String loginerror(Model model) {
        model.addAttribute("error", "true");
        return "login";
    }

// Mètode que maneja la petició GET per realitzar el logout.
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model) {
        return "login";
    }
}
