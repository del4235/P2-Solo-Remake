package com.revature.rectarot.models;

import com.revature.rectarot.models.enums.EnumSuit;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Cards")
public class Card {
    @Id
    private String card_id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "meanings", columnDefinition = "varchar(38)[]", nullable = false)
    private ArrayList<String> meanings;
    @Column(name = "meanings_rev", columnDefinition = "varchar(38)[]", nullable = false)
    private ArrayList<String> meaningsRev;
    @Column(name = "value", nullable = false)
    private int value;
    @Column(name = "suit", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumSuit suit;
    @Column(name = "major", nullable = false)
    private boolean major;

    public Card(){}

    public Card(String card_id, String name, String description, ArrayList<String> meanings, ArrayList<String> meaningsRev, int value, EnumSuit suit, boolean major) {
        this.card_id = card_id;
        this.name = name;
        this.description = description;
        this.meanings = meanings;
        this.meaningsRev = meaningsRev;
        this.value = value;
        this.suit = suit;
        this.major = major;
    }

    public String getCard_id() {
        return card_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<String> getMeanings() {
        return meanings;
    }

    public ArrayList<String> getMeaningsRev() {
        return meaningsRev;
    }

    public int getValue() {
        return value;
    }

    public EnumSuit getSuit() {
        return suit;
    }

    public boolean isMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Card{" +
                "card_id='" + card_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", meanings=" + meanings +
                ", meaningsRev=" + meaningsRev +
                ", value=" + value +
                ", suit=" + suit +
                ", major=" + major +
                '}';
    }
}
