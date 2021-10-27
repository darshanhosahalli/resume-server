package com.darshan.resumebuilder.services;

import com.darshan.resumebuilder.models.Vet;

import java.util.Set;

public interface VetService {

    public Vet save(Vet pet);

    public Vet findById(Long id);

    public Set<Vet> findAll();

}
