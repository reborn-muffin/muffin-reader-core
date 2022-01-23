package com.maffin.maffin_backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private String name;
    private String password;

    public UserDTO(String name, String password){
        this.name = name;
        this.password = password;
    }
}
