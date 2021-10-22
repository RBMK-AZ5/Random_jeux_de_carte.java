package com.company;
import java.util.Objects;

public class Carte {

    private  String couleur;
    private String nom;
    private int valeur;
    public int comparer(Carte carte)
    {
        int res=0;
        String rep1="Meme nom";
        String rep2="Pas le meme nom";
        String rep3="Meme couleur";
        String rep4="Pas meme couleur";
        if(nom.equalsIgnoreCase(carte.nom))
        {
            System.out.println(rep1);
        }
        else
        {
            System.out.println(rep2);
        }
        if(valeur>carte.valeur)
        {
            res=1;
        }
        else if(valeur<carte.valeur)
        {
            res=-1;
        }
        return res;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.couleur);
        hash = 71 * hash + Objects.hashCode(this.nom);
        hash = 71 * hash + this.valeur;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carte other = (Carte) obj;
        if (this.valeur != other.valeur) {
            return false;
        }
        if (!Objects.equals(this.couleur, other.couleur)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carte{" + "couleur=" + couleur + ", nom=" + nom + ", valeur=" + valeur + '}';
    }


    public Carte(String couleur, String nom, int valeur) {
        this.couleur = couleur;
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

}