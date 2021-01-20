package com.company.practice.proxy;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib { // Интерейс удаленного сервиса
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoID);
}

