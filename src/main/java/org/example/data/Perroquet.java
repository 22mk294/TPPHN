package org.example.data;


import org.example.exception.AgeInvalidException;
import org.example.interfaces.Parler;

public class Perroquet extends Oiseau implements Parler {
    private static final long serialVersionUID = 1L;
    private String parler;

    public Perroquet(String nom, int age, String pellage, double envergureDesAilles, String parler) throws AgeInvalidException {
        super(nom, age, pellage, envergureDesAilles);
        this.parler = parler;
    }

    @Override
    public String toString() {
        return super.toString() +  " " + parler;
    }

    @Override
    public void parler(){
        System.out.println(this.getNom() + " est entraint de parler");
    }
    @Override
    public void faireDuBruit(){
        System.out.println(this.getNom() + " est entraint de jacasser");
    }
}
