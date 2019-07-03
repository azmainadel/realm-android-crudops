package com.example.androidrealmdatabase.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Person extends RealmObject {

    @PrimaryKey
    public long nid;
    public String name;
    public int age;
    public RealmList<Language> languages;



}
