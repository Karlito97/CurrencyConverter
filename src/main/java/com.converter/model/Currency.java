package com.converter.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 * Created by Charles Jr on 26/11/2015.
 */
public class Currency {

    //Attributs
    private StringProperty identifiant;
    private StringProperty devise;
    private SimpleDoubleProperty taux;

    /**
     * Propriétés : Accesseurs et Mutateurs
     */
    public String getIdentifiant() {
        return identifiant.get();
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant.set(identifiant);
    }

    public StringProperty identifiantProperty() {
        return identifiant;
    }

    public String getDevise() {
        return devise.get();
    }

    public void setDevise(String devise) {
        this.devise.set(devise);
    }

    public StringProperty deviseProperty() {
        return devise;
    }
    public SimpleDoubleProperty getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux.set(taux);
    }

    /**
     * Default constructor.
     */
    public Currency() {
        this(null, null, 0);
    }

    /**
     * Constructor .
     *
     * @param identifiant
     * @param devise
     */
    public Currency(String identifiant, String devise) {
        this.identifiant = new SimpleStringProperty(identifiant);
        this.devise = new SimpleStringProperty(devise);
    }
    /**
     * Constructor .
     *
     * @param identifiant
     * @param devise
     * @param taux
     */
    public Currency(String identifiant, String devise, double taux) {
        this.identifiant = new SimpleStringProperty(identifiant);
        this.devise = new SimpleStringProperty(devise);
        this.taux = new SimpleDoubleProperty(taux);
    }

    @Override
    public String toString(){
        return getIdentifiant() + " - " + getDevise();
    }

}
