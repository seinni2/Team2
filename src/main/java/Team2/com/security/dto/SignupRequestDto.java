package Team2.com.security.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
public class SignupRequestDto {

    private String username;

    private String password;

    //private String email;
    private boolean admin = false;  //admin 인지 아닌지 확인
    private String adminToken = "";
}