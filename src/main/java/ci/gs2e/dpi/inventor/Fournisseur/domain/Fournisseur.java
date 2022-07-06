package ci.gs2e.dpi.inventor.Fournisseur.domain;

import ci.gs2e.dpi.inventor.TypeFournisseur.domain.TypeFournisseur;
import ci.gs2e.dpi.inventor.common.domain.AuditModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fournisseur extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nom", length= 30)
    private String nom;
    @Column(name = "prenom", length= 30)
    private String prenom;
    @Column(name = "raison_sociale", length= 30)
    private String raison_sociale;
    @Column(name = "contact", length= 10)
    private int contact;
    @Column(name = "email", length= 30)
    private String email;
    @Column(name = "adresse", length= 30)
    private String adresse;
    @Column(name = "site_web", length= 30)
    private String site_web;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "typeFournisseur_id", nullable = false)
    private TypeFournisseur typeFournisseur;

}
