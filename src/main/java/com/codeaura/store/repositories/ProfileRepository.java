package com.codeaura.store.repositories;

import com.codeaura.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository  extends CrudRepository<Profile, Long> {
    
}
