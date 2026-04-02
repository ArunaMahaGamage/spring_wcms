package com.aruna.wcms.receiveWorkFeedback.service;

import com.aruna.wcms.Helper.model.Helper;
import com.aruna.wcms.receiveWorkFeedback.model.WorkFeedback;
import com.aruna.wcms.receiveWorkFeedback.repository.WorkFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkFeedbackServiceImpl implements WorkFeedbackService {

    @Autowired
    WorkFeedbackRepository workFeedbackRepository;

    @Override
    public WorkFeedback createWorkFeedback(WorkFeedback workFeedback) {
        if (!workFeedback.getIdNumber().isEmpty()) {
            WorkFeedback workFeedbackResponse =  workFeedbackRepository.save(workFeedback);
            return workFeedbackResponse;
        } else {
            return null;
        }
    }

    @Override
    public WorkFeedback updateWorkFeedback(WorkFeedback WorkFeedback) {
        return null;
    }

    @Override
    public Iterable<WorkFeedback> readAllWorkFeedback() {
        Iterable<WorkFeedback> readAllHelperWorkFeedbackResult = workFeedbackRepository.findAll();
        if (readAllHelperWorkFeedbackResult.iterator().hasNext()) {
            return readAllHelperWorkFeedbackResult;
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Complain is not found.");
        }
    }

    @Override
    public WorkFeedback readWorkFeedback(WorkFeedback workFeedback) {
        Optional<WorkFeedback> workFeedbackResponse = workFeedbackRepository.findByIdNumber(workFeedback.getIdNumber());

        // Handle the Optional result
        if (workFeedbackResponse.isPresent()) {
            return workFeedbackResponse.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + workFeedback.getId());
        }
    }

    @Override
    public WorkFeedback deleteWorkFeedback(WorkFeedback WorkFeedback) {
        return null;
    }
}
