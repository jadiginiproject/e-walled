package id.co.bsi.e_walled.dto.request;

import lombok.Data;

@Data
public class PostTransferRequest {
    private String to;
    private int amount;
    private String notes;
}
