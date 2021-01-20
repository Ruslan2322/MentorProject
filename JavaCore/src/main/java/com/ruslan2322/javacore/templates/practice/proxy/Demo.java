package com.company.practice.proxy;

public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownLoader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownLoader);
        long smart = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naive - smart) + " ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // Поведение пользователя в нашем приложении:

        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");

        // Пользователи могут посещать одну и ту же страницу довольно часто.

        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;

    }
}