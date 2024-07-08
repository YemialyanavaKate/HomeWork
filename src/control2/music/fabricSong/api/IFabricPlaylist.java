package control2.music.fabricSong.api;

import control2.FileSong;
import control2.music.SongInPlaylist;
import control2.music.filter.FilterGenre;
import control2.music.filter.FilterMood;

import java.util.List;

public interface IFabricPlaylist {
    void add (ISong song);
    List<ISong> getSongs();
    SongInPlaylist addSongInPlaylist();
    FilterGenre filterGanre();
    FilterMood filterMood();
    FileSong fileSong();
}
