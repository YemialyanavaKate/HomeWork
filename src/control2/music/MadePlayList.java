package control2.music;

import control2.music.fabricSong.api.ISong;

import java.util.ArrayList;
import java.util.List;

public class MadePlayList {
    private List<SongInPlaylist> songs = new ArrayList<>();

    public void add (ISong song) {
        songs.add(new SongInPlaylist(song));
    }

    public List<SongInPlaylist> getSongs() {
        return songs;
    }
}
