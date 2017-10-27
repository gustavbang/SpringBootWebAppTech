package com.faisaljarkass.demo.domains;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tweettable")
public class TweetString {
    private String tekst;
    @Id
    private int id;

    public TweetString() {
    }

    public TweetString(String tekst, int id) {
        this.tekst = tekst;
        this.id = id;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
