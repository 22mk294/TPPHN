package org.example.data;


import org.example.exception.AgeInvalidException;

public abstract class Mammifere extends Animal {
    private static final long serialVersionUID = 1L;
    private String pellage;

    public Mammifere(String nom, int age, String pellage) throws AgeInvalidException {
        super(nom, age);
        this.pellage = pellage;
    }
    public String getPellage() {
        return pellage;
    }
    public void setPellage(String pellage) {
        this.pellage = pellage;
    }

    public void allaiter(){
        System.out.println(this.getNom() + " allaite");
    }

    @Override
    public String toString() {
        return super.toString() +  " " + pellage;
    }
}
