package id.co.bsi.e_walled.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopupResponse {
    private String message;
    private int amount;
    private String from;
    private String notes;
}
