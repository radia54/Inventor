package ci.gs2e.dpi.inventor.BonCommande.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BonCommandeDto {
    private long id;
    @JsonProperty("numero_bon_commande")
    private String numero_bon_commande;
}
