package net.ddns.freakyvicky.tmserv.rest;

import net.ddns.freakyvicky.tmserv.rest.model.LoadResponse;
import net.ddns.freakyvicky.tmserv.rest.model.TextRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class TextMiningResource {

    @RequestMapping(path = "/load", method = POST)
    public LoadResponse loadData(@RequestParam TextRequest request) {


    }

}
