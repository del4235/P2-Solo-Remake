package com.revature.rectarot.controllers;

import com.revature.rectarot.services.CardService;
import com.revature.rectarot.services.ReadingService;
import com.revature.rectarot.services.SpreadService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

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
    @GetMapping(value = "/getreading",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getReading(@RequestParam(required = false) String readingSpread, HttpServletResponse resp, HttpServletRequest req){

        return "Get Reading.";
    }
    @DeleteMapping(value = "/deletereading",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE) //leaving in the produces to possibly use to confirm what was removed?
    public @ResponseBody String deleteReading(@RequestParam(required = true) String readingId, HttpServletResponse resp, HttpServletRequest req){

        return "Delete Reading.";
    }
    @GetMapping(value = "/viewSavedreading",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<String> viewSavedReading(HttpServletResponse resp, HttpServletRequest req){
        List<String> savedReadings = new ArrayList<>();
        return savedReadings;
    }
   /* @GetMapping(value = "/viewSavedreading",  consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String viewSavedReading(@RequestParam(required = true) String readingId, HttpServletResponse resp, HttpServletRequest req){

        return "savedReading";
    }*/

}
