package com.aruna.wcms.receiveWorkFeedback.repository;

import com.aruna.wcms.receiveWorkFeedback.model.WorkFeedback;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WorkFeedbackRepository extends CrudRepository<WorkFeedback, Integer> {

    Optional<WorkFeedback> findByIdNumber(String idNumber);

}
