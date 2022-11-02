package com.epf.models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte)) return false;
        Carte carte = (Carte) o;
        return Objects.equals(getCouleur(), carte.getCouleur()) && Objects.equals(getRang(), carte.getRang());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCouleur(), getRang());
    }

    @Override
    public String toString() {
        return "Carte{" +
                "couleur='" + couleur + '\'' +
                ", rang='" + rang + '\'' +
                '}';
    }
}
