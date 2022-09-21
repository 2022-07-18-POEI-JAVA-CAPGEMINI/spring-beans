package com.example.beans;

import java.util.HashSet;

public class SetStoreImpl implements MyStoreInterface {

    private HashSet<Person> items = new HashSet<>();


    public void add(Person p){
        items.add(p);
    }

    public int size(){
        return items.size();
    }
}
