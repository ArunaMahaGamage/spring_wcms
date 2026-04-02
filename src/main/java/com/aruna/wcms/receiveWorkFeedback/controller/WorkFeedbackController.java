package com.aruna.wcms.receiveWorkFeedback.controller;

import com.aruna.wcms.receiveWorkFeedback.model.WorkFeedback;
import com.aruna.wcms.receiveWorkFeedback.service.WorkFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping(path="/api/work-feedback")
public class WorkFeedbackController {

    @Autowired
    WorkFeedbackService workFeedbackService;

    @PostMapping(path="/create")
    public WorkFeedback createWorkFeedback(WorkFeedback workFeedback) {
        return workFeedbackService.createWorkFeedback(workFeedback);
    }

    @PostMapping(path="/update")
    public WorkFeedback updateWorkFeedback(WorkFeedback workFeedback) {
        return workFeedbackService.updateWorkFeedback(workFeedback);
    }

    @PostMapping(path = "/read")
    public Iterable<WorkFeedback> readAllWorkFeedback() {
        return workFeedbackService.readAllWorkFeedback();
    }

    @PostMapping(path = "/read-all")
    public WorkFeedback readWorkFeedback(WorkFeedback workFeedback) {
        return workFeedbackService.readWorkFeedback(workFeedback);
    }

    @PostMapping(path = "/delete")
    public WorkFeedback deleteWorkFeedback(WorkFeedback workFeedback) {
        return workFeedbackService.deleteWorkFeedback(workFeedback);
    }
}
