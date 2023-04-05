package fr.eni.encheres.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name="utilisateur")
public class Utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="no_utilisateur",nullable = false)
    private int noUtilisateur;

    @Column(name="pseudo",nullable = false)
    private String pseudo;

    @Column(name="nom",nullable = false)
    private String nom;

    @Column(name="prenom",nullable = false)
    private String prenom;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="telephone",nullable = true)
    private String telephone;

    @Column(name="rue",nullable = false)
    private String rue;

    @Column(name="code_postale",nullable = false)
    private String codePostale;

    @Column(name="ville",nullable = false)
    private String ville;

    @Column(name="mot_de_passe",nullable = false)
    private String motDePasse;

    @Column(name="prenom",nullable = false)
    private int credit;

    @Column(name="administrateur")
    private boolean administrateur;

    @Column(name="compteActif")
    private boolean compteActif;

    public Utilisateurs(String pseudo, String nom, String prenom, String email, String rue, String codePostale,
                       String ville, String motDePasse, int credit, boolean administrateur) {

        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.rue = rue;
        this.codePostale = codePostale;
        this.ville = ville;
        this.motDePasse = motDePasse;
        this.credit = credit;
        this.administrateur = administrateur;
    }
}


