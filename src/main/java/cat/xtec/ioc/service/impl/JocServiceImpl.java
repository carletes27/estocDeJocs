/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.repository.JocRepository;
import cat.xtec.ioc.service.JocService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */

@Service
public class JocServiceImpl implements JocService{
    
    // Injecció de la dependència del repositori que gestiona els jocs.
     @Autowired
    private JocRepository jocRepository;

    /**
     * Recupera tots els jocs disponibles utilitzant el repositori.
     * 
     * @return Una llista de jocs disponibles.
     */
     public List<Joc> getAllJocs() {
        return jocRepository.getAllJocs();
    }

     /**
     * Recupera un joc basat en el seu identificador únic.
     * 
     * @param jocId L'identificador del joc a recuperar.
     * @return El joc corresponent a l'identificador proporcionat.
     */
    public Joc getJocById(String jocId) {
        return jocRepository.getJocById(jocId);
    }
    
    /**
     * Afegeix un nou joc al repositori.
     * 
     * @param joc L'objecte Joc a afegir.
     */
     public void addJoc(Joc joc) {
        jocRepository.addJoc(joc);
    }
}
