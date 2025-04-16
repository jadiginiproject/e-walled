package id.co.bsi.e_walled.controller;

import id.co.bsi.e_walled.dto.response.LogoutResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {
    @PostMapping("/api/logout")
    public ResponseEntity<LogoutResponse> logout() {
        LogoutResponse response = new LogoutResponse();
        response.setMessage("Logout successful");
        return ResponseEntity.ok(response);
    }
}
