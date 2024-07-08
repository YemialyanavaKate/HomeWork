package control2.music;

import control2.music.fabricSong.api.ISong;

public class SongInPlaylist {

    private ISong song;
    private String genre;
    private String mood;

    public SongInPlaylist(ISong song) {
        this.song = song;
    }

    public ISong getSong() {
        return song;
    }
    public String getGenre(){
        return genre;
    }
    public String getMood(){
        return mood;
    }

    @Override
    public String toString() {
        return " " + song.getNameSong() + " - " + song.getSinger() +" " + song.getTimeSong();
    }
}
