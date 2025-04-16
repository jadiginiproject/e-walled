package id.co.bsi.e_walled.dto.response;

import lombok.Data;

@Data
public class GetUserResponse {
    private String name;
    private String email;
    private String profileImg;
    private String message;
}
