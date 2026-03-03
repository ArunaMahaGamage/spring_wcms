package com.aruna.wcms.trackComplain.service;


import com.aruna.wcms.trackComplain.model.TrackComplain;

public interface TrackComplainService {
    TrackComplain createTrackComplain(TrackComplain trackComplain);

    TrackComplain readTrackComplain(TrackComplain trackComplain);

    TrackComplain updateTrackComplain(TrackComplain trackComplain);

    TrackComplain deleteTrackComplain(TrackComplain trackComplain);
}
