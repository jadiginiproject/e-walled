package id.co.bsi.e_walled.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

public class GetTransferResponse {
    private int id;
    private String account_number;
    private boolean active;
    private int balance;
    private String message;
}
