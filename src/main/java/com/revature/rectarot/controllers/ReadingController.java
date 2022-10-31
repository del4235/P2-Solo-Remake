package com.revature.rectarot.controllers;

import com.revature.rectarot.services.CardService;
import com.revature.rectarot.services.ReadingService;
import com.revature.rectarot.services.SpreadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Reading")
public class ReadingController {
    final ReadingService readingService;
    final SpreadService spreadService;
    final CardService cardService;

    public ReadingController(ReadingService readingService, SpreadService spreadService, CardService cardService) {
        this.readingService = readingService;
        this.spreadService = spreadService;
        this.cardService = cardService;
    }

    /*
    *Get Reading Save Reading Delete Reading View Saved Readings List Review A Saved Reading
    * * */

}
