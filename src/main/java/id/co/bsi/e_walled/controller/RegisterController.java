package id.co.bsi.e_walled.controller;

import id.co.bsi.e_walled.dto.request.RegisterRequest;
import id.co.bsi.e_walled.dto.response.RegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Menandakan bahwa class ini adalah controller REST (mengembalikan JSON)
public class RegisterController {

    @PostMapping("/api/register") // Menangani request POST ke endpoint /api/register
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        // Membuat objek response untuk dikembalikan ke client
        RegisterResponse registerResponse = new RegisterResponse();

        registerResponse.setMessage("success");
        return ResponseEntity.ok(registerResponse);
    }
}
