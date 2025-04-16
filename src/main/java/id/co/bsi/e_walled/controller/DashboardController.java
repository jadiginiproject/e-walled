package id.co.bsi.e_walled.controller;

import id.co.bsi.e_walled.dto.request.GetUserRequest;
import id.co.bsi.e_walled.dto.response.GetAccountDetailResponse;
import id.co.bsi.e_walled.dto.response.GetListTransactionResponse;
import id.co.bsi.e_walled.dto.response.GetUserResponse;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class DashboardController {

    @GetMapping("/users/1")
    public ResponseEntity<GetUserResponse> getUser() {
        GetUserResponse getUserResponse = new GetUserResponse();

        getUserResponse.setName("aldin");
        getUserResponse.setEmail("aldin@gmail.com");
        getUserResponse.setProfileImg("img.jpg");
        getUserResponse.setMessage("success");

        return ResponseEntity.ok(getUserResponse);
    }

    @GetMapping("/accounts/1")
    public ResponseEntity<GetAccountDetailResponse> getAccountDetail() {
        GetAccountDetailResponse getAccountDetailResponse = new GetAccountDetailResponse();

        getAccountDetailResponse.setAccountNumber("AN00001");
        getAccountDetailResponse.setBalance(1000000000);
        getAccountDetailResponse.setMessage("success");

        return ResponseEntity.ok(getAccountDetailResponse);
    }

    @GetMapping("/transactions/1")
    public ResponseEntity<List<GetListTransactionResponse>> getListTransaction() {
        List<GetListTransactionResponse> listTransaction = new ArrayList<>();

        GetListTransactionResponse trx1 = new GetListTransactionResponse();

        trx1.setDate("16/2/2025");
        trx1.setType("transfer");
        trx1.setFromTo("admin");
        trx1.setDesc("thr");
        trx1.setAmount(10000000);

        listTransaction.add(trx1);

        GetListTransactionResponse trx2 = new GetListTransactionResponse();

        trx2.setDate("10/2/2025");
        trx2.setType("top up");
        trx2.setFromTo("bsi");
        trx2.setDesc("gaji");
        trx2.setAmount(50000000);

        listTransaction.add(trx2);

        return ResponseEntity.ok(listTransaction);
    }
}
