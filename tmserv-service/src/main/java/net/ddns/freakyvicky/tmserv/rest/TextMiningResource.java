package net.ddns.freakyvicky.tmserv.rest;

import net.ddns.freakyvicky.tmserv.ai.LoadingService;
import net.ddns.freakyvicky.tmserv.rest.model.LoadResponse;
import net.ddns.freakyvicky.tmserv.rest.model.TextRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class TextMiningResource {

    @Resource
    LoadingService loadingService;

    public TextMiningResource(LoadingService loadingService) {
        this.loadingService = loadingService;
    }

    @ResponseBody
    @RequestMapping(path = "/tmserv", method = POST)
    public LoadResponse loadData(@RequestBody TextRequest request) {

        loadingService.loadData(request.getText(), request.getReference());

        LoadResponse response= new LoadResponse(0, "");

        return response;

    }

}
