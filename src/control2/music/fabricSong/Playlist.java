package control2.music.fabricSong;

import control2.music.SongInPlaylist;
import control2.music.fabricSong.api.ISong;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String namePlaylist;
    private String aboutPlaylist;
    private List<SongInPlaylist> songsInPlaylist = new ArrayList<>();

    public Playlist(String namePlaylist, String aboutPlaylist) {
        this.namePlaylist = namePlaylist;
        this.aboutPlaylist = aboutPlaylist;
    }
    public Playlist(){

    }
    public void add(ISong song){
        songsInPlaylist.add(new SongInPlaylist(song));
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public String getAboutPlaylist() {
        return aboutPlaylist;
    }

    public List<SongInPlaylist> getSongsInPlaylist() {
        return songsInPlaylist;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (SongInPlaylist songLine : songsInPlaylist){
            builder.append(i++)
                    .append(". ")
                   // .append(songsInPlaylist.get(i - 2).toString())
                    .append(songLine.getSong().getNameSong())
                    .append(" - ")
                    .append(songLine.getSong().getSinger())
                    .append(" ")
                    .append(songLine.getSong().getTimeSong())
                    .append("\n");
        }
        return builder.toString();
    }
}
