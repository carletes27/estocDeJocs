/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.domain.repository;

import cat.xtec.ioc.domain.Joc;
import java.util.List;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */
public interface JocRepository {
    
    /**
     * Afegeix un nou joc al repositori.
     * 
     * @param joc El joc a afegir.
     */
    void addJoc(Joc joc);
    
    /**
     * Retorna un joc basat en el seu identificador.
     * 
     * @param jocId L'identificador únic del joc.
     * @return El joc corresponent a l'identificador, o null si no es troba.
     */
    Joc getJocById(String jocId);
    
    /**
     * Retorna una llista de tots els jocs disponibles al repositori.
     * 
     * @return Una llista de tots els jocs.
     */
  List <Joc> getAllJocs();  
}
