package com.aruna.wcms.requestNewBin.service;

import com.aruna.wcms.requestNewBin.model.RequestNewBin;
import org.springframework.data.repository.CrudRepository;

public interface RequestNewBinService {

    RequestNewBin createRequestNewBin(RequestNewBin requestNewBin);

    //Iterable<RequestNewBin> readAllRequestNewBin(RequestNewBin requestNewBin);

    RequestNewBin readRequestNewBin(RequestNewBin requestNewBin);

    RequestNewBin updateRequestNewBin(RequestNewBin requestNewBin);

    RequestNewBin deleteRequestNewBin(RequestNewBin requestNewBin);

}
