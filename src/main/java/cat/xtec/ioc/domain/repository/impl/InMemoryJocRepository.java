/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.domain.repository.impl;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.repository.JocRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */
@Repository
public class InMemoryJocRepository implements JocRepository {

    // Llista que emmagatzema tots els jocs disponibles
    private List<Joc> listOfJocs = new ArrayList<Joc>();

    // Constructor que inicialitza la llista de jocs amb dades de mostra.
    public InMemoryJocRepository() {

        Joc Virus = new Joc("Joc01", "Virus", 30.00);
        Virus.setDescription("Joc de Virus");
        Virus.setCreator("Carlos Ordóñez");
        Virus.setCategory("Puzzle");

        Joc Dixit = new Joc("Joc02", "Dixit", 35.00);
        Dixit.setDescription("Joc de Dixit");
        Dixit.setCreator("Carlos Ordóñez");
        Dixit.setCategory("Plataforma");

        Joc Catan = new Joc("Joc03", "Catan", 15.00);
        Catan.setDescription("Joc de Catan");
        Catan.setCreator("Carlos Ordóñez");
        Catan.setCategory("Aventura");
        
        Joc Monopoly = new Joc("Joc04", "Monopoly", 25.00);
        Monopoly.setDescription("Joc de Monopoly");
        Monopoly.setCreator("Carlos Ordóñez");
        Monopoly.setCategory("Financer");
        
        Joc Scategories = new Joc("Joc05", "Scategories", 40.00);
        Scategories.setDescription("Joc de Scategories");
        Scategories.setCreator("Carlos Ordóñez");
        Scategories.setCategory("Cartes");

        listOfJocs.add(Virus);
        listOfJocs.add(Dixit);
        listOfJocs.add(Catan);
        listOfJocs.add(Monopoly);
        listOfJocs.add(Scategories);
    }

    // Retorna la llista completa de jocs.
    public List<Joc> getAllJocs() {
        return listOfJocs;
    }

    // Cerca i retorna un joc per ID.
    public Joc getJocById(String jocId) {
        Joc jocById = null;
        for (Joc joc : listOfJocs) {
            if (joc != null && joc.getJocId() != null
                    && joc.getJocId().equals(jocId)) {
                jocById = joc;
                break;
            }
        }
        if (jocById == null) {
            throw new IllegalArgumentException(
                    "No s'han trobat jocs amb el codi: " + jocId);
        }
        return jocById;
    }
    
    // Afegeix un nou joc a la llista.
    public void addJoc(Joc joc) {
        listOfJocs.add(joc);
    }
}
