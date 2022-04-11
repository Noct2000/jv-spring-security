package mate.academy.spring.dto.request;

import mate.academy.spring.lib.Email;

import javax.validation.constraints.NotBlank;

public class UserRequestDto {
    @Email
    private String email;
    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
