package com.darshan.resumebuilder.services;

import com.darshan.resumebuilder.models.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner findByLastName(String lastName);

    public Owner save(Owner owner);

    public Owner findById(Long id);

    public Set<Owner> findAll();

}
