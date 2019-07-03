package com.example.androidrealmdatabase.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Language extends RealmObject {

    @PrimaryKey
    @Required
    public String name;
}
