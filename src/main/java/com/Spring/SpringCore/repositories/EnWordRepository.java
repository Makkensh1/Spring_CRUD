package com.Spring.SpringCore.repositories;

import com.Spring.SpringCore.model.EnWord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnWordRepository  extends CrudRepository <EnWord, Long>  {
    EnWord getById(Long id);
}
