package com.epf.classes;

public class Carte {

    private String couleur;
    private String rang;

    public Carte(String couleur, String rang) {
        this.couleur = couleur;
        this.rang = rang;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getRang() {
        return rang;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "couleur='" + couleur + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }
}
