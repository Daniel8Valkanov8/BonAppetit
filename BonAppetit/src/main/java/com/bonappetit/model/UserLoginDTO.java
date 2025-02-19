package com.bonappetit.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserLoginDTO {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;

    private String password;

    public UserLoginDTO() {
    }

    public @NotBlank @Size(min = 3, max = 20) String getUsername() {
        return username;
    }

    public void setUsername(@NotBlank @Size(min = 3, max = 20) String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
