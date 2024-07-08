package control2.music;

import control2.FileSong;
import control2.music.fabricSong.api.IFabricPlaylist;
import control2.music.fabricSong.api.ISong;
import control2.music.filter.FilterGenre;
import control2.music.filter.FilterMood;

import java.util.ArrayList;
import java.util.List;

public class FabricPlaylist implements IFabricPlaylist {
    private List<ISong> songs = new ArrayList<>();
    public FabricPlaylist(){

    }

    public FabricPlaylist(List<ISong> songs) {
        this.songs = songs;
    }

    @Override
    public void add(ISong song) {
        songs.add(song);
    }

    @Override
    public List<ISong> getSongs() {
        return songs;
    }

    @Override
    public SongInPlaylist addSongInPlaylist() {
        return null;
    }

    @Override
    public FilterGenre filterGanre() {
        return null;
    }

    @Override
    public FilterMood filterMood() {
        return null;
    }

    @Override
    public FileSong fileSong() {
        return null;
    }
}
