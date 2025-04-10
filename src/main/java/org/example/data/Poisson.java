package org.example.data;


import org.example.exception.AgeInvalidException;

public abstract class Poisson extends Animal {
    private static final long serialVersionUID = 1L;
    private String typeDeeaux;

    public Poisson(String nom,int age, String typeDeeaux) throws AgeInvalidException {
        super(nom, age);
        this.typeDeeaux = typeDeeaux;
    }
    public String getTypeDeeaux() {
        return typeDeeaux;
    }

    @Override
    public String toString() {
        return super.toString() + " " + typeDeeaux;
    }

    public void setTypeDeeaux(String typeDeeaux) {
        this.typeDeeaux = typeDeeaux;
    }
    public void nager(){
        System.out.println(this.getNom() + " est entrain de nager");
    }

}
