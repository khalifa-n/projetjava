package dao;

import java.util.ArrayList;
import java.util.List;

import Models.Commande;
import Models.Paiemnet;

public class Data {
    List<Commande> commandes = new ArrayList<>();

    public List<Commande> getCommandes(){
        commandes.add(new Commande("12-12-2022","1000"));
        commandes.add(new Commande("12-12-2022","1000"));
        commandes.add(new Commande("12-12-2022","1000"));
        commandes.add(new Commande("12-12-2022","1000",new Paiemnet("12-12-2022","om","09R")));
        commandes.add(new Commande("12-12-2022","1000",new Paiemnet("12-12-2022","om","09R")));

        return commandes; 

    }

}
