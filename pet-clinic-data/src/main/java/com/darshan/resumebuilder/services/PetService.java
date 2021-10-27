package com.darshan.resumebuilder.services;


import com.darshan.resumebuilder.models.Pet;

import java.util.Set;

public interface PetService {

    public Pet save(Pet oet);

    public Pet findById(Long id);

    public Set<Pet> findAll();

}
