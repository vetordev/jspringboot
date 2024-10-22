package com.github.vetordev.jspringboot.model.entity;

public class Client {

    private int id;
    private String name;
    private String doc;

    public Client(int id, String name, String doc) {
        this.id = id;
        this.name = name;
        this.doc = doc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
}
