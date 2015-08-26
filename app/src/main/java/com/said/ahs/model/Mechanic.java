package com.said.ahs.model;

import com.said.data.model.CardsJSON;

import org.parceler.Parcel;

/**
 * Created by Said on 20/8/15.
 */
@Parcel
public class Mechanic {

    String name;

    public Mechanic() {
    }

    public Mechanic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
