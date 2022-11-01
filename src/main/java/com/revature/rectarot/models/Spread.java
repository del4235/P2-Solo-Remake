package com.revature.rectarot.models;

import com.revature.rectarot.models.enums.EnumSpread;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Spreads")
public class Spread {
    @Id
    //@Enumerated(EnumType.STRING)
    //@Type(type = "com.revature.rectarot.models.enums.EnumTranslator")
    @Column(columnDefinition = "enumspread")
    private EnumSpread spread_id;
    @Column(name = "number_of_cards", nullable = false)
    private int numOfCards;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "position_descriptions", columnDefinition = "text[][]", nullable = false)
    private ArrayList<ArrayList<String>> posDescriptions;
    @Column(name = "popularity", nullable = true)
    private int popularity;

    public Spread(){}

    public Spread(EnumSpread spread_id, int numOfCards, String description, ArrayList<ArrayList<String>> posDescriptions, int popularity) {
        this.spread_id = spread_id;
        this.numOfCards = numOfCards;
        this.description = description;
        this.posDescriptions = posDescriptions;
        this.popularity = popularity;
    }

    public EnumSpread getSpread_id() {
        return spread_id;
    }

    public void setSpread_id(EnumSpread spread_id) {
        this.spread_id = spread_id;
    }

    public int getNumOfCards() {
        return numOfCards;
    }

    public void setNumOfCards(int numOfCards) {
        this.numOfCards = numOfCards;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<ArrayList<String>> getPosDescriptions() {
        return posDescriptions;
    }

    public void setPosDescriptions(ArrayList<ArrayList<String>> posDescriptions) {
        this.posDescriptions = posDescriptions;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Spread{" +
                "spread_id=" + spread_id +
                ", numOfCards=" + numOfCards +
                ", description='" + description + '\'' +
                ", posDescriptions=" + posDescriptions +
                ", popularity=" + popularity +
                '}';
    }
}
