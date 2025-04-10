package org.example.data;


import org.example.exception.AgeInvalidException;

public  class Pigeon extends Oiseau{
    public Pigeon(String nom, int age, String pellage, double envergureDesAilles) throws AgeInvalidException {

        super(nom, age, pellage, envergureDesAilles);
    }
    @Override
    public void faireDuBruit() {
        System.out.println(this.getNom() + " est entrain de roucouler");
    }
}
