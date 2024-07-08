package control2.music.fabricSong;

import control2.music.fabricSong.api.ISong;

import java.util.List;

public class Song implements ISong {
    private String singer;
    private String nameSong;
    private String genres;
    private String moods;

    private String timeSong;

    public Song(String singer, String nameSong, String genres, String moods, String timeSong) {
        this.singer = singer;
        this.nameSong = nameSong;
        this.genres = genres;
        this.moods = moods;
        this.timeSong = timeSong;
    }

    public String getSinger() {
        return singer;
    }

    public String getNameSong() {
        return nameSong;
    }

    public String getGenre() {
        return genres;
    }

    public String getMood() {
        return moods;
    }

    public String getTimeSong() {
        return timeSong;
    }

    @Override
    public String toString() {

        return  nameSong + " - " + singer + " " + timeSong ;
    }
}
