package control2.music.filter.api;

import control2.music.SongInPlaylist;
import control2.music.fabricSong.Song;
import control2.music.fabricSong.api.ISong;

import java.util.List;

public interface IFilterSong {
   // List<SongInPlaylist> filterSong(List<SongInPlaylist> songs, String genre);
    boolean filterSong(ISong song, String word);
}
