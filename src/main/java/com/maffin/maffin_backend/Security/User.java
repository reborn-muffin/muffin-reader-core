package com.maffin.maffin_backend.Security;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;

    @Column(name = "role_id")
    private String roleId;

}