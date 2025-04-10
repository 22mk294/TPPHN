package org.example.data;


import org.example.exception.AgeInvalidException;

public abstract class  Oiseau extends Animal {
    private static final long serialVersionUID = 1L;
    private double envergureDesAilles;

    public Oiseau (String nom, int age, String pellage, double envergureDesAilles) throws AgeInvalidException {
        super(nom, age);
        this.envergureDesAilles = envergureDesAilles;
    }
    public double getEnvergureDesAilles() {
        return envergureDesAilles;
    }
    public void setEnvergureDesAilles(double envergureDesAilles) {
        this.envergureDesAilles = envergureDesAilles;
    }

    @Override
    public String toString() {
        return super.toString() + " " + envergureDesAilles;
    }

    public void voler(){
        super.affiche();
        System.out.println(envergureDesAilles + " est entrain de voler");
    }

}
