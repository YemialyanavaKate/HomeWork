package control2.music.filter;

import control2.music.FilterGanre;
import control2.music.SongInPlaylist;
import control2.music.fabricSong.Song;
import control2.music.fabricSong.api.ISong;
import control2.music.filter.api.IFilterSong;

import java.util.List;

public class FilterGenre implements IFilterSong {
    @Override
    public boolean filterSong(ISong song, String genre) {
        return song.getGenre().equals(genre);
    }
}
