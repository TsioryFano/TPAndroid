package com.example.corps.modele;

public class Profil {
    // Propriétés
    private String prenom;
    private Integer age;

    public Profil(String prenom, Integer age) {
        this.prenom = prenom;
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getAge() {
        return age;
    }
}
