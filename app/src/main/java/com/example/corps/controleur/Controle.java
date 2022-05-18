package com.example.corps.controleur;

import com.example.corps.modele.Profil;

public final class Controle {

    private static Controle instance = null;
    private Profil profil;

    private Controle(){
        super();
    }

    public static final Controle getInstance(){
        if (Controle.instance==null){
            Controle.instance = new Controle();
        }
        return Controle.instance;
    }

    public void creerProfil (String prenom, Integer age){
        profil = new Profil(prenom,age);
    }

    public String getPrenom() {
        return profil.getPrenom();
    }

    public Integer getAge(){
        return profil.getAge();
    }
}
