package com.revature.rectarot.controllers;

import com.revature.rectarot.services.CardService;
import com.revature.rectarot.services.DeckService;

public class DeckController {
    final DeckService deckService;
    final CardService cardService;

    public DeckController(DeckService deckService, CardService cardService) {
        this.deckService = deckService;
        this.cardService = cardService;
    }

    //View Deck View Card Add Card Remove Card
}
