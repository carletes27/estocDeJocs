/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */

// Anotació que indica que aquesta classe és un controlador en el context de Spring MVC.
@Controller
public class HomeController {
// Anotació que defineix el mètode com a gestor de peticions GET a la ruta inicial "/".
    
// Mètode que s'encarrega de processar les peticions HTTP GET dirigides a la ruta "/".
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("index");
        modelview.getModelMap().addAttribute("benvinguda", "Benvingut/da a la col·leció de jocs");
        modelview.getModelMap().addAttribute("tagline", "Col·lecció de jocs de Carlos Ordóñez");
        return modelview;
    }

}
