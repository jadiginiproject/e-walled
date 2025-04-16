package id.co.bsi.e_walled.controller;

import id.co.bsi.e_walled.dto.request.TopupRequest;
import id.co.bsi.e_walled.dto.response.TopupResponse;
import id.co.bsi.e_walled.dto.response.TopupSourceResponse;
import id.co.bsi.e_walled.dto.response.TopupSourceListResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopupSourceController {

    @GetMapping("/api/topup-sources")
    public ResponseEntity<TopupSourceListResponse> getTopupSources() {
        List<TopupSourceResponse> sources = List.of(
                new TopupSourceResponse("BCA"),
                new TopupSourceResponse("BSI"),
                new TopupSourceResponse("Credit Card"),
                new TopupSourceResponse("BRI"),
                new TopupSourceResponse("Mandiri")
        );

        TopupSourceListResponse response = new TopupSourceListResponse("success", sources);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/api/topup")
    public ResponseEntity<TopupResponse> createTopup(@RequestBody TopupRequest request) {
        TopupResponse response = new TopupResponse(
                "Topup successful",
                request.getAmount(),
                request.getFrom(),
                request.getNotes()
        );

        return ResponseEntity.ok(response);
    }
}
