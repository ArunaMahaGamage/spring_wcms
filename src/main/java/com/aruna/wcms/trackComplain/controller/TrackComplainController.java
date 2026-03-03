package com.aruna.wcms.trackComplain.controller;

import com.aruna.wcms.trackComplain.model.TrackComplain;
import com.aruna.wcms.trackComplain.service.TrackComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/track-complain")
public class TrackComplainController {

    @Autowired
    TrackComplainService trackComplainService;

    public @ResponseBody TrackComplain createTrackComplain(@RequestBody TrackComplain trackComplain) {
        return trackComplainService.createTrackComplain(trackComplain);
    }

    public @ResponseBody TrackComplain readTrackComplain(@RequestBody TrackComplain trackComplain) {
        return null;
    }

    public @ResponseBody TrackComplain updateTrackComplain(@RequestBody TrackComplain trackComplain) {
        return null;
    }

    public @ResponseBody TrackComplain deleteTrackComplain(@RequestBody TrackComplain trackComplain) {
        return null;
    }
}
