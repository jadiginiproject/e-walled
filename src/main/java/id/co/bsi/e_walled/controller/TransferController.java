package id.co.bsi.e_walled.controller;

import id.co.bsi.e_walled.dto.request.PostTransferRequest;
import id.co.bsi.e_walled.dto.response.GetTransferResponse;
import id.co.bsi.e_walled.dto.response.PostTransferResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TransferController {

    @GetMapping("/account/:id")
    public ResponseEntity<List<GetTransferResponse>> getTransferResponseResponseEntity() {
        List<GetTransferResponse> getTransferResponseList = new ArrayList<>();

        //1
        GetTransferResponse getTransferResponse1 = new GetTransferResponse();

        getTransferResponse1.setId(1);
        getTransferResponse1.setAccount_number("1245021");
        getTransferResponse1.setActive(true);
        getTransferResponse1.setBalance(75000);
        getTransferResponse1.setMessage("success");

        getTransferResponseList.add(getTransferResponse1);

        //2
        GetTransferResponse getTransferResponse2 = new GetTransferResponse();

        getTransferResponse2.setId(2);
        getTransferResponse2.setAccount_number("16130204");
        getTransferResponse2.setActive(true);
        getTransferResponse2.setBalance(35000);
        getTransferResponse2.setMessage("success");

        getTransferResponseList.add(getTransferResponse2);

        return ResponseEntity.ok(getTransferResponseList);

    }

    @PostMapping("/transfer")
    public ResponseEntity<PostTransferResponse> postTransferResponseResponseEntity (@RequestBody PostTransferRequest postTransferRequest) {
        PostTransferResponse postTransferResponse = new PostTransferResponse();
        postTransferResponse.setMessage("Transfer successful");
        postTransferResponse.setTransaction_id("TX87654321");
        postTransferResponse.setBalance_after(7250000);

        return ResponseEntity.ok(postTransferResponse);
    }
}
