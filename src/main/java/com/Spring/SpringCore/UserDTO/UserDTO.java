package com.Spring.SpringCore.UserDTO;


import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;


    private String email;

    private Set<RoleDTO> roles;
}
