
package com.pablochochoy.portfolio.security.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LoginUsuario {
    //@NotBlank
    private String nombreUsuario;
    //@NotBlank
    private String password;
}
