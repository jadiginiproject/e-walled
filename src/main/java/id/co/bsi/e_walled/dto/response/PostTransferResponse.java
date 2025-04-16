package id.co.bsi.e_walled.dto.response;

import lombok.Data;

@Data
public class PostTransferResponse {

    private String message;
    private String transaction_id;
    private int balance_after;
}
