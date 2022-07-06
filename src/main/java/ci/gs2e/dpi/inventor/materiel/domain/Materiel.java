package ci.gs2e.dpi.inventor.materiel.domain;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Materiel extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="code", length = 10)
    private String code;
    @Column(name = "libelle", length = 15)
    private String libelle;
    @Column(name = "marque", length = 25)
    private String marque;
    @Column(name = "modele", length = 25)
    private String modele;
    @Column(name = "numero_serie", length = 30)
    private String numero_serie;
    @Column(name = "debut_garantie", length = 10)
    private Date debut_garantie;
    @Column(name = "fin_garantir", length = 10)
    private Date fin_garantie;
    @Column(name = "montant", length = 20)
    private int montant;
    @Column(name = "quantite", length = 25)
    private int quantite;
    @Column(name = "date_enregistrement", length = 10)
    private Date date_enregistrement;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Fournisseur_id", nullable = false)
    private Fournisseur fournisseur;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "Entreprise_id", nullable = false)
    private Entreprise entreprise;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "EtatMateriel_id", nullable = false)
    private EtatMateriel etatMateriel;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "TypeMateriel_id", nullable = false)
    private TypeMateriel typeMateriel;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "BonCommande_id", nullable = false)
    private BonCommande bonCommande;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "BonLivraison_id", nullable = false)
    private BonLivraison bonLivraison;
}
