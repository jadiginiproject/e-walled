package id.co.bsi.e_walled.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopupSourceListResponse {
    private String message; // contoh: "success"
    private List<TopupSourceResponse> data; // daftar sumber topup: BCA, BSI, dll
}