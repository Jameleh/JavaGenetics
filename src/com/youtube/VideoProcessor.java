package com.youtube;

import com.youtube.EmailService;

public class VideoProcessor {

    private EcnodeAble encoder;
    private  DatabaseAble database;
    private ConnectAble emailService;

    public VideoProcessor(EcnodeAble encoder, DatabaseAble database, ConnectAble emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }


    public void process(Video video) {

        encoder.encode(video);
        database.store(video);
        emailService.sendNotify(video.getUser());
    }
}

