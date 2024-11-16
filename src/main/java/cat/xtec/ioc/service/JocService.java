/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.service;
import cat.xtec.ioc.domain.Joc;
import java.util.List;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */

public interface JocService {
    
    /**
     * Afegeix un nou joc a la col·lecció.
     * 
     * @param joc L'objecte Joc a afegir.
     */
    void addJoc(Joc joc);
    
    /**
     * Retorna una llista de tots els jocs disponibles.
     * 
     * @return Llista de tots els jocs.
     */
    List<Joc> getAllJocs();

    /**
     * Recupera un joc per la seva identificació única.
     * 
     * @param jocId L'identificador únic del joc.
     * @return El joc amb l'identificador especificat o null si no es troba cap joc amb aquest identificador.
     */
    Joc getJocById(String jocId);
}
