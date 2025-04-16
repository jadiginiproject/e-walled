package id.co.bsi.e_walled.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class GetListTransactionResponse {
    private String date;
    private String type;
    private String fromTo;
    private String desc;
    private int amount;
}
