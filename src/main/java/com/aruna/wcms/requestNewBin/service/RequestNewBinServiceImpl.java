package com.aruna.wcms.requestNewBin.service;

import com.aruna.wcms.exceptions.ResourceNotFoundException;
import com.aruna.wcms.requestNewBin.model.RequestNewBin;
import com.aruna.wcms.requestNewBin.repository.RequestNewBinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RequestNewBinServiceImpl implements RequestNewBinService {

    @Autowired
    RequestNewBinRepository requestNewBinRepository;

    @Override
    public RequestNewBin createRequestNewBin(RequestNewBin requestNewBin) {
        if (!requestNewBin.getIdNumber().isEmpty()) {
            RequestNewBin requestNewBinResponse =  requestNewBinRepository.save(requestNewBin);

            return requestNewBinResponse;
        } else {
            return null;
        }
    }

    @Override
    public RequestNewBin readRequestNewBin(RequestNewBin requestNewBin) {
        Optional<RequestNewBin> requestNewBinResult = requestNewBinRepository.findById(requestNewBin.getId());

        // Handle the Optional result
        if (requestNewBinResult.isPresent()) {
            return requestNewBinResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + requestNewBin.getId());
        }
    }

    @Override
    public RequestNewBin updateRequestNewBin(RequestNewBin requestNewBin) {
        return requestNewBinRepository.findById(requestNewBin.getId()).map(requestNewBinUpdate -> {
            requestNewBinUpdate.setAddress(requestNewBin.getAddress());
            requestNewBinUpdate.setDescription(requestNewBin.getDescription());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return requestNewBinRepository.save(requestNewBinUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + requestNewBin.getId()));
    }

    @Override
    public RequestNewBin deleteRequestNewBin(RequestNewBin requestNewBin) {
        return null;
    }
}
