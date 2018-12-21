package net.ddns.freakyvicky.tmserv.rest;

import net.ddns.freakyvicky.tmserv.ai.LoadingService;
import net.ddns.freakyvicky.tmserv.rest.model.StatusResponse;
import net.ddns.freakyvicky.tmserv.rest.model.TextRequest;
import net.ddns.freakyvicky.tmserv.util.ExceptionHandlingService;
import net.ddns.freakyvicky.tmserv.util.ServerMessage;
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

    @Resource
    ExceptionHandlingService exceptionHandlingService;

    public TextMiningResource(LoadingService loadingService) {
        this.loadingService = loadingService;
    }

    @ResponseBody
    @RequestMapping(path = "/tmserv", method = POST)
    public StatusResponse loadData(@RequestBody TextRequest request) {

        StatusResponse response;

        try {
            loadingService.loadData(request.getText(), request.getReference());
            response = StatusResponse.ok();
        } catch (Exception e) {
            ServerMessage message = exceptionHandlingService.getMessageFromException(e);
            response = new StatusResponse(message.getCode(), message.getMessage());
        }

        return response;

    }

}
