package fr.eni.encheres.bo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Encheres {

    @Column(name="date_enchere",nullable = false)
    private LocalDateTime dateEnchère;

    @Column(name="montant_enchere",nullable = false)
    private int montantEnchere;

    @Id
    @ManyToOne
    @JoinColumn(name="no_utilisateur", nullable= false)
    private Utilisateurs utilisateur;

    @Id
    @ManyToOne
    @JoinColumn(name="no_article", nullable = false)
    private Articles article;

    public Encheres() {

    }

    public Encheres(LocalDateTime dateEnchère, int montantEnchere, Utilisateurs utilisateur, Articles article) {
        this.dateEnchère = dateEnchère;
        this.montantEnchere = montantEnchere;
        this.utilisateur = utilisateur;
        this.article = article;
    }
}

