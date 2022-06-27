package com.Spring.SpringCore.UserDTO;

import com.Spring.SpringCore.model.EnWord;
import com.Spring.SpringCore.model.RuWord;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private Long rating;
    private EnWordDTO enWord;
    private RuWordDTO ruWord;
}
