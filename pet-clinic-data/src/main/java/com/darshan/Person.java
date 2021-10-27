package com.darshan;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class Person {

    @NonNull
    private String firstName;

    @NonNull
    private String secondName;

}
