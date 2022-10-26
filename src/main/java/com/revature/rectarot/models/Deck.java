package com.revature.rectarot.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Decks")
public class Deck {
    @Id
    private String deck_id;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user_id;
    @Column(name = "card_ids", columnDefinition = "text[]", nullable = true)
    private ArrayList<String> card_ids;
    @Column(name = "date_created", nullable = false)
    private Timestamp date_created;

    public Deck(){}

    public Deck(String deck_id, User user_id, ArrayList<String> card_Ids, Timestamp date_created) {
        this.deck_id = deck_id;
        this.user_id = user_id;
        this.card_ids = card_Ids;
        this.date_created = date_created;
    }

    public String getDeck_id() {
        return deck_id;
    }

    public void setDeck_id(String deck_id) {
        this.deck_id = deck_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public List<String> getCard_ids() {
        return card_ids;
    }

    public void setCard_ids(ArrayList<String> card_ids) {
        this.card_ids = card_ids;
    }

    public Timestamp getDate_created() {
        return date_created;
    }

    public void setDate_created(Timestamp date_created) {
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck_id='" + deck_id + '\'' +
                ", user_id=" + user_id +
                ", card_Ids=" + card_ids +
                ", date_created=" + date_created +
                '}';
    }
}
