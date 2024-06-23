package com.youtube;

import com.youtube.Video;

public class VideoEncoder implements EcnodeAble {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
