package com.revature.rectarot.controllers;

import com.revature.rectarot.models.Card;
import com.revature.rectarot.services.CardService;
import com.revature.rectarot.services.DeckService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class DeckController {
    final DeckService deckService;
    final CardService cardService;

    public DeckController(DeckService deckService, CardService cardService) {
        this.deckService = deckService;
        this.cardService = cardService;
    }

    //View Deck View Card Add Card Remove Card Draw random Card

    @GetMapping(value = "/getDeck",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<Card> getDeck(@RequestParam(required = false) String deckId, HttpServletResponse resp, HttpServletRequest req){
        //default to the userId linked deck if there is no Id provided or create a new one if there is none linked to the user.
        List<Card> deck = new ArrayList<>();
        return deck;
    }
    @GetMapping(value = "/getCard",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Card getCard(@RequestParam(required = true) String cardId, HttpServletResponse resp, HttpServletRequest req){
        Card card = new Card();
        return card;
    }
    @GetMapping(value = "/removeCard",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String removeCard(@RequestParam(required = true) String cardId, HttpServletResponse resp, HttpServletRequest req){

        return "Card Removed.";
    }
    @GetMapping(value = "/drawcard",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String drawCard(@RequestParam(required = false) int numOfCards, HttpServletResponse resp, HttpServletRequest req){

        return "Card Drawn.";
    }
}
