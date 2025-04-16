package id.co.bsi.e_walled.dto.response;

import lombok.Data;

@Data
public class GetAccountDetailResponse {
    private String accountNumber;
    private int balance;
    private String message;
}
