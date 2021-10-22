package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        /*test1();
        List<String> jeux =new ArrayList<>();
        jeux.add("yo");
        jeux.add("ezeza");
        System.out.println(jeux.get(1));
        System.out.println(jeux.size());
        System.out.println(jeux.contains("yo"));
        System.out.println(jeux);*/
        Random nbr5 = new Random();
        int nbr6 = nbr5.nextInt(12);//generation d un nombre aleatoire
        System.out.println(nbr6);
        //Carte carte1=new Carte("ROUGE","roi",13);
        //System.out.println(carte1);

        Random ip = new Random();
        JeuDeCarte car = new JeuDeCarte(ip.nextBoolean());
        int i;
        for (i = 1; i < 9; i++) {
            System.out.println(i + " choix alleatoire " + car.getRando());
        }
        //car.print();


    }

    public static class JeuDeCarte {
        private List<Carte> jeu = new ArrayList<>();
        Carte laCarte;
        int i;
        public static final String[] nomsDesCarte = {"As", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf", "Dix", "Valet", "Dame", "Roi"};
        public static final int[] jeu52Carte = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        public static final int[] jeu32Carte = {15, 0, 0, 0, 0, 0, 7, 8, 9, 10, 11, 12, 13};
        public static final String[] couleur = {"Coeur", "Trefle", "Pic", "Carreaux"};

        public JeuDeCarte(boolean petit) {
            for (String Couleur : couleur) {
                if (petit) {
                    for (i = 0; i < jeu32Carte.length; i++) {
                        if (jeu32Carte[i] != 0) {
                            laCarte = new Carte(Couleur, nomsDesCarte[i], jeu32Carte[i]);
                            jeu.add(laCarte);
                            // System.out.println(jeu);
                        }
                    }
                } else {
                    for (i = 0; i < jeu52Carte.length; i++) {
                        laCarte = new Carte(Couleur, nomsDesCarte[i], jeu52Carte[i]);
                        jeu.add(laCarte);
                        //System.out.println(jeu);
                    }
                }
            }
        }

        public void print() {
            Iterator<Carte> ip = jeu.iterator();// cration d une collection iterator
            while (ip.hasNext() == true) {// .hasNext Retourne true si l’itérateur n’est pas arrivé en fin de l’ensemble et false sinon.
                System.out.println(ip.next());// .next() Permet d’avancer l’itérateur, et qui retourne l’élément qui a été sauté. Lève une exception NoSuchElementException si l'itérateur n'a pas d'objet qui le suit.
            }
        }


        public Carte getRando() {//generation d une carte aleatoire
            Carte uneCarte;
            Random nbr1 = new Random();
            int num = nbr1.nextInt(jeu.size()); // generation d un nombre aleatoire qui auras pour parametre la taille de la liste:valeur random
            //System.out.println(jeu.size());taille de la liste jeu
            uneCarte = jeu.remove(num);// pas avoir la meme carte on la retire du paquet
            return uneCarte;
        }

    }
}
