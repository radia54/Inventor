package ci.gs2e.dpi.inventor.AppSequence.domain.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class AppSequenceDto implements Serializable {
    private long id;
    private String prefixe;
    private int next;
}
