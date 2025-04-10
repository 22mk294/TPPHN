package org.example.data;


import org.example.exception.AgeInvalidException;
import org.example.interfaces.Parler;

public class Personne extends Mammifere implements Parler {
    private static final long serialVersionUID = 1L;
    private int QI;
    private String bruit;

    public Personne(String nom, int age, String pellage, int QI) throws AgeInvalidException {
        super(nom, age, pellage);
        this.QI = QI;
        this.bruit = "pleurer";
    }
    @Override
    public void parler() {
        System.out.println(this.getNom() + " est entraint de parler");
    }
    @Override
    public void faireDuBruit() {
        System.out.println(this.getNom() + bruit);
    }

    public int getQI() {
        return QI;
    }

    public void setQI(int QI) {
        this.QI = QI;
    }

    public void setBruit(String bruit) {
        this.bruit = bruit;
    }

    public String getBruit() {
        return bruit;
    }

    @Override
    public String toString() {
        return super.toString() + " " + QI;
    }
}
