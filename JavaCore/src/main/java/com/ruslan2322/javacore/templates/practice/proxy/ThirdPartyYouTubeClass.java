package com.company.practice.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib { // Реализация удаленного сервиса


    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.youtube.com/"); // Подключение к серверу ютуб
        return getRandomVideos();                  // Возвращает рандомный видеоролик
    }

    @Override
    public Video getVideo(String videoID) {
        connectToServer("http://www.youtube.com/" + videoID); // Подключение к серверу ютуб по ссылке на видео
        return getSomeVideo(videoID);                        // Возврат видео по ссылке
    }

    // ------------------------------------------------------------------
    // Фальшивые методы моделирования сетевой активности. Они такие же медленные, как реальная жизнь.

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {    // время ожидания сети или то то такое

        int randomLatency = random(5, 10);
        for (int i= 0; i < randomLatency;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }

    private void connectToServer(String server) { // метод коннека к срверу
        System.out.println("Coneting to " + server + " ...");
        experienceNetworkLatency();
        System.out.println("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() { // метод добавления рандомного видео
        System.out.println("Downloading poplars... ");
        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Done!" + "\n");
        return hmap;

    }

    private Video getSomeVideo(String videoID){ // получение виео по ИД
        System.out.println("Downloading video...");

        experienceNetworkLatency();
        Video video = new Video(videoID, "Some video title");

        System.out.println("Done!" + "\n");
        return video;
    }
}
