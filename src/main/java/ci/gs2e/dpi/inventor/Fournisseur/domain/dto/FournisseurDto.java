package ci.gs2e.dpi.inventor.Fournisseur.domain.dto;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import lombok.Data;

@Data
public class FournisseurDto {
    private long id;
    private String nom;
    private String prenom;
    private int contact;
    private String raison_sociale;
    private  String email;
    private String adresse;
    private  String site_web;
    private TypeFournisseur typeFournisseur;
}
