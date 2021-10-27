package com.darshan.resumebuilder.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Person extends  BaseEntity {

    @NonNull
    private String firstName;

    @NonNull
    private String secondName;

}
