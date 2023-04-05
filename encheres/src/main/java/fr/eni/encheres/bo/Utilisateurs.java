package fr.eni.encheres.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
/**
 * Entité representant un Utilisateur
 *
 * @Autor Jérémy
 */
@Getter
@Setter
@AllArgsConstructor
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

    @Column(name="telephone")
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

}


