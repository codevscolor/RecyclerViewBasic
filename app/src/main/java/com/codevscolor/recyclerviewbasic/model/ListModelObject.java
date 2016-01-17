package com.codevscolor.recyclerviewbasic.model;

public class ListModelObject {
    private String mName;

    public ListModelObject(String name, int i) {
        this.mName = name + i;
    }

    public String getName() {
        return this.mName;
    }
}
