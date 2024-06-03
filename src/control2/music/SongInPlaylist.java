package control2.music;

import control2.music.fabricSong.api.ISong;

public class SongInPlaylist {

    private ISong song;
 //   private int count;

    public SongInPlaylist(ISong song) {
        this.song = song;
       // this.count = count;
    }

    public ISong getSong() {
        return song;
    }

    /*public int getCount() {
        return count;
    }*/
}
