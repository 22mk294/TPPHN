package org.example.data;


import org.example.exception.AgeInvalidException;
import org.example.interfaces.Chanter;
import org.example.interfaces.Volant;

public class ChauveSouris extends Mammifere implements Volant, Chanter {

    public ChauveSouris(String nom, int age, String pellage) throws AgeInvalidException {
        super(nom, age, pellage);
    }
    @Override
    public void voler(){
        System.out.println(this.getNom() + " est entrain de voler");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(this.getNom() + " emet des ultra son");
    }



    @Override
    public void chanter() {
        System.out.println(this.getNom() + " est entrain de chanter");
    }
}
