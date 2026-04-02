package com.aruna.wcms.receiveWorkFeedback.service;


import com.aruna.wcms.receiveWorkFeedback.model.WorkFeedback;

public interface WorkFeedbackService {
    WorkFeedback createWorkFeedback(WorkFeedback WorkFeedback);

    WorkFeedback updateWorkFeedback(WorkFeedback WorkFeedback);

    Iterable<WorkFeedback> readAllWorkFeedback();

    WorkFeedback readWorkFeedback(WorkFeedback WorkFeedback);

    WorkFeedback deleteWorkFeedback(WorkFeedback WorkFeedback);
}
