package com.revature.rectarot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.rectarot.models.enums.EnumCategory;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;

@Entity
@Table(name = "Readings")
public class Reading {
    @Id
    private String reading_id;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user_id;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "spread_id", nullable = false)
    @JsonBackReference
    private Spread spread_id;
    @Column(name = "category", nullable = true)
    @Enumerated(EnumType.STRING)
    private EnumCategory category;
    @Column(name = "card_ids", columnDefinition = "text[]", nullable = false)
    private ArrayList<String> card_ids;
    @Column(name = "date", nullable = false)
    private Timestamp date;

    public Reading(){}

    public Reading(String reading_id, User user_id, Spread spread_id, EnumCategory category, ArrayList<String> card_ids, Timestamp date) {
        this.reading_id = reading_id;
        this.user_id = user_id;
        this.spread_id = spread_id;
        this.category = category;
        this.card_ids = card_ids;
        this.date = date;
    }

    public String getReading_id() {
        return reading_id;
    }

    public void setReading_id(String reading_id) {
        this.reading_id = reading_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Spread getSpread_id() {
        return spread_id;
    }

    public void setSpread_id(Spread spread_id) {
        this.spread_id = spread_id;
    }

    public EnumCategory getCategory() {
        return category;
    }

    public void setCategory(EnumCategory category) {
        this.category = category;
    }

    public ArrayList<String> getCard_ids() {
        return card_ids;
    }

    public void setCard_ids(ArrayList<String> card_ids) {
        this.card_ids = card_ids;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reading{" +
                "reading_id='" + reading_id + '\'' +
                ", user_id=" + user_id +
                ", spread_id=" + spread_id +
                ", category=" + category +
                ", card_ids=" + card_ids +
                ", date=" + date +
                '}';
    }
}
