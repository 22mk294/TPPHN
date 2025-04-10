package org.example.data;


import org.example.exception.AgeInvalidException;

public class Chien extends Mammifere {
    private static final long serialVersionUID = 1L;
    private String race ;

    public Chien(String nom, int age, String pellage, String race) throws AgeInvalidException {
        super(nom, age, pellage);
        this.race = race;
    }

    @Override
    public String toString() {
        return super.toString() +  " " + race;
    }

    @Override
    public void faireDuBruit() {
        System.out.println(this.getNom() + " est entrain d'aboier");
    }
}
