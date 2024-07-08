package control2.music.filter;

import control2.music.fabricSong.api.ISong;
import control2.music.filter.api.IFilterSong;

public class FilterMood implements IFilterSong {
    @Override
    public boolean filterSong(ISong song, String mood) {
        return song.getMood().equals(mood);
    }
}
