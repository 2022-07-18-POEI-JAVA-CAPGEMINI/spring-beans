package com.example.beans;

import java.util.ArrayList;

public class ListStoreImpl implements MyStoreInterface {

    private ArrayList<Person> items = new ArrayList<>();


    public void add(Person p){
        items.add(p);
    }

    public int size(){
        return items.size();
    }
}
