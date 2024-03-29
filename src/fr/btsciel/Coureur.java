package fr.btsciel;

import fr.btsciel.Categorie;

import java.time.LocalTime;

public class Coureur extends Personne {
    private Categorie categorie;
    private LocalTime duree;

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public LocalTime getDuree() {
        return duree;
    }

    public void setDuree(LocalTime duree) {
        this.duree = duree;
    }

    public Coureur(Genre genre, String nom, String prenom, Categorie categorie, LocalTime time) {
        super(genre, nom, prenom);
        this.setCategorie(categorie);
        this.setDuree(time);
    }
}