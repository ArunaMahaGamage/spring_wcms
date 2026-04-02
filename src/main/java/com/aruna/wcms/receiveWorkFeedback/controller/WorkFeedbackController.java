package com.aruna.wcms.receiveWorkFeedback.controller;

import com.aruna.wcms.receiveWorkFeedback.model.WorkFeedback;
import com.aruna.wcms.receiveWorkFeedback.service.WorkFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/work-feedback")
public class WorkFeedbackController {

    @Autowired
    WorkFeedbackService workFeedbackService;

    @PostMapping(path="/create")
    public @ResponseBody WorkFeedback createWorkFeedback(@RequestBody WorkFeedback workFeedback) {
        return workFeedbackService.createWorkFeedback(workFeedback);
    }

    @PostMapping(path="/update")
    public @ResponseBody WorkFeedback updateWorkFeedback(@RequestBody WorkFeedback workFeedback) {
        return workFeedbackService.updateWorkFeedback(workFeedback);
    }

    @PostMapping(path = "/read")
    public @ResponseBody Iterable<WorkFeedback> readAllWorkFeedback() {
        return workFeedbackService.readAllWorkFeedback();
    }

    @PostMapping(path = "/read-all")
    public @ResponseBody WorkFeedback readWorkFeedback(@RequestBody WorkFeedback workFeedback) {
        return workFeedbackService.readWorkFeedback(workFeedback);
    }

    @PostMapping(path = "/delete")
    public @ResponseBody WorkFeedback deleteWorkFeedback(@RequestBody WorkFeedback workFeedback) {
        return workFeedbackService.deleteWorkFeedback(workFeedback);
    }
}
