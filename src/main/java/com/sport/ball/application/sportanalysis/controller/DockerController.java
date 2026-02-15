package com.sport.ball.application.sportanalysis.controller;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/sport")
public class DockerController {

    @RequestMapping("/getdockerservice")
    public @ResponseBody String docker(HttpServletRequest req) {
        return "Docker -" + req.getServerName() + "-getRemotePort:" + req.getLocalPort() + req.getLocalName() + "-getRemotePort:" + req.getServerPort();
    }
}
