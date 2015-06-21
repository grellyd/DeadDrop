package com.example.graham.deaddrop.datatypes;

import java.util.List;

public class DeadDrop {

    String name;
    List<Card> cards;

    public DeadDrop() {}

    public DeadDrop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
