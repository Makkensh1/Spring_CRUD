package com.Spring.SpringCore.controllers;

import com.Spring.SpringCore.UserDTO.EnWordDTO;
import com.Spring.SpringCore.mappers.EnWOrdMapper;
import com.Spring.SpringCore.model.EnWord;
import com.Spring.SpringCore.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;


    @GetMapping("en-words/{id}")
    public EnWordDTO sayHello(@PathVariable String id) {
        EnWord enWord = enWordService.getEnWord(Long.valueOf(id));
        return EnWOrdMapper.INSTANCE.toDTO(enWord);
    }


}
