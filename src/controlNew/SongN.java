package controlNew;

import control2.music.fabricSong.api.ISong;

import java.util.List;

public class SongN{
    private String singer;
    private String nameSong;
    private List<String> genres;
    private List<String> moods;

    private int timeSong;

    public String getSinger() {
        return singer;
    }

    public String getNameSong() {
        return nameSong;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getMoods() {
        return moods;
    }

    public int getTimeSong() {
        return timeSong;
    }

    @Override
    public String toString() {

        return  nameSong + " - " + singer + " " + timeSong ;
    }
}
