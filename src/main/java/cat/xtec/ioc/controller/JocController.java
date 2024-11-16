/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.controller;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.service.JocService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */
@Controller
@RequestMapping("/jocs")
public class JocController {
// Injecta el servei que gestiona les operacions sobre els jocs.

    @Autowired
    private JocService jocService;

// Mètode per obtenir i mostrar tots els jocs disponibles.
    @RequestMapping("/all")
    public ModelAndView allJocs(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("jocs");
        modelview.getModelMap().addAttribute("jocs", jocService.getAllJocs());
        return modelview;
    }

// Mètode per obtenir un joc específic per ID.    
    @RequestMapping("/joc")
    public ModelAndView getJocById(@RequestParam("codi") String jocId, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("joc");
        modelview.getModelMap().addAttribute("joc", jocService.getJocById(jocId));
        return modelview;
    }

// Mètode per mostrar el formulari d'afegir un nou joc (GET).
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getAddNewJocForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("addJoc");
        Joc newJoc = new Joc();
        modelview.getModelMap().addAttribute("newJoc", newJoc);
        return modelview;
    }

// Mètode per processar la petició d'afegir un nou joc (POST).
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddNewJocForm(@ModelAttribute("newJoc") Joc newJocToAdd) {
        jocService.addJoc(newJocToAdd);
        return "redirect:/jocs/all";
    }
}
