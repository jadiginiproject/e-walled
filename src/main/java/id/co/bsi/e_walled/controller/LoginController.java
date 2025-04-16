package id.co.bsi.e_walled.controller;

import id.co.bsi.e_walled.dto.request.LoginRequest;
import id.co.bsi.e_walled.dto.response.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Menandakan bahwa class ini adalah controller REST (mengembalikan JSON)
public class LoginController {

    @PostMapping("/api/login") // Menangani request POST ke endpoint /api/login
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        // Membuat objek response untuk dikembalikan ke client
        LoginResponse loginResponse = new LoginResponse();

        // Validasi login secara hardcoded
        if ("vionaCoreBanking@IDG.com".equals(loginRequest.getEmail()) &&
                "123".equals(loginRequest.getPassword())) {

            // Jika email dan password cocok
            loginResponse.setMessage("success");
            loginResponse.setToken("dsarqweqdsa"); // Token dummy (bisa diganti JWT di masa depan)

            // Kembalikan response dengan status 200 OK
            return ResponseEntity.ok(loginResponse);
        } else {
            // Jika email atau password salah
            loginResponse.setMessage("Email or Password Incorrect");
            loginResponse.setToken(null); // Tidak ada token diberikan
            return ResponseEntity.ok(loginResponse);
        }
    }
}
