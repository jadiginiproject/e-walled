package id.co.bsi.e_walled.dto.request;

import lombok.Data;

@Data
public class TopupRequest {
    private int amount;
    private String from;
    private String notes;
}
