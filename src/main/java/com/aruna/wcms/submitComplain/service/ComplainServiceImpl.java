package com.aruna.wcms.submitComplain.service;

import com.aruna.wcms.driver.model.Driver;
import com.aruna.wcms.exceptions.ResourceNotFoundException;
import com.aruna.wcms.submitComplain.model.Complain;
import com.aruna.wcms.submitComplain.repository.ComplainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplainServiceImpl implements ComplainService {

    @Autowired
    private ComplainRepository complainRepository;
    @Override
    public Complain createComplain(Complain complain) {
        return complainRepository.save(complain);
    }

    @Override
    public Iterable<Complain> readAllComplain(Complain complain) {
        Optional<Iterable<Complain>> complainResult = complainRepository.findByCitizenIDNumber(complain.getCitizenIDNumber());
        if (complainResult.isPresent()) {
            return complainResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + complain.getId());
        }
    }

    @Override
    public Complain readComplain(Complain complain) {
        //Optional<Complain> complainResult = complainRepository.findById(complain.getId());
        Optional<Complain> complainResult = complainRepository.findByComplainIDNumber(complain.getCitizenIDNumber());

        // Handle the Optional result
        if (complainResult.isPresent()) {
            return complainResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + complain.getId());
        }
    }

    @Override
    public Complain updateComplain(Complain complain) {
        return complainRepository.findById(complain.getId()).map(complainUpdate -> {
            complainUpdate.setComplainTitle(complain.getComplainTitle());
            complainUpdate.setComplain(complain.getComplain());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return complainRepository.save(complainUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + complain.getId()));
    }

    @Override
    public Complain deleteComplain(Complain complain) {
        complainRepository.deleteById(complain.getId());
        return null;
    }
}
