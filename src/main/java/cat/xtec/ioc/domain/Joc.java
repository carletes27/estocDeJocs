/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.domain;

/**
 *
 * @author Carlos Ordóñez Ortiz EAC3 M06
 */

public class Joc {
    // Atributs de la classe
    private String jocId;
    private String name;
    private double price;
    private String description;
    private String creator;
    private String category;

    // Constructor sense parámetres
    public Joc() {
        super();
    }

    /**
     * Constructor amb paràmetres per inicialitzar un objecte Joc amb valors específics.
     *
     * @param jocId Identificador del joc.
     * @param name Nom del joc.
     * @param price Preu del joc.
     */
    public Joc(String jocId, String name, double price) {
        this.jocId = jocId;
        this.name = name;
        this.price = price;
    }

    // Getters y setters
    public String getJocId() {
        return jocId;
    }

    public void setJocId(String jocId) {
        this.jocId = jocId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Mètodes redefinits de la classe Object

    /**
     * Mètode per comparar aquest objecte Joc amb un altre per determinar si són iguals.
     * 
     * @param obj Objecte amb el qual comparar.
     * @return true si són iguals, false en cas contrari.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Joc other = (Joc) obj;
        return jocId != null && jocId.equals(other.jocId);
    }

     /**
     * Mètode per calcular el codi hash de l'objecte basat en el seu identificador.
     * 
     * @return el codi hash de l'objecte.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + ((jocId == null) ? 0 : jocId.hashCode());
    }

    /**
     * Mètode per obtenir una representació en cadena de l'objecte Joc.
     * 
     * @return una cadena que representa l'objecte.
     */
    @Override
    public String toString() {
        return "Joc [jocId=" + jocId + ", name=" + name + ", price=" + price + "]";
    }
}
