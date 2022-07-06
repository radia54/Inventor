package ci.gs2e.dpi.inventor.materiel.domain.dto;

import ci.gs2e.dpi.inventor.BonCommande.domain.BonCommande;
import ci.gs2e.dpi.inventor.BonLivraison.domain.BonLivraison;
import ci.gs2e.dpi.inventor.EtatMateriel.domain.EtatMateriel;
import ci.gs2e.dpi.inventor.Fournisseur.domain.Fournisseur;
import ci.gs2e.dpi.inventor.TypeMateriel.domain.TypeMateriel;
import ci.gs2e.dpi.inventor.entreprise.domain.Entreprise;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MaterielDto implements Serializable {
    private long id;
    private String code;
    private String libelle;
    private String marque;
    private String modele;
    private String numero_serie;
    private Date debut_garantie;
    private Date fin_garantie;
    private int montant;
    private int quantite;
    private Date date_enregistrement;
    private Fournisseur fournisseur;
    private Entreprise entreprise;
    private TypeMateriel typeMateriel;
    private EtatMateriel etatMateriel;
    private BonCommande bonCommande;
    private BonLivraison bonLivraison;
}
