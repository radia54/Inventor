package ci.gs2e.dpi.inventor.BonLivraison.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BonLivraisonDto  implements Serializable {
    private long id;
    private int numero_bon_livraison;
}
