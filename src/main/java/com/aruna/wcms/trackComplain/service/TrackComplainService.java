package com.aruna.wcms.trackComplain.service;


import com.aruna.wcms.trackComplain.model.TrackComplain;

public interface TrackComplainService {
    TrackComplain createCitizen(TrackComplain trackComplain);

    TrackComplain readCitizen(TrackComplain trackComplain);

    TrackComplain updateCitizen(TrackComplain trackComplain);

    TrackComplain deleteCitizen(TrackComplain trackComplain);
}
