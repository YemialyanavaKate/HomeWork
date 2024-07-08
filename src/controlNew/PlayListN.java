package controlNew;

import control2.music.SongInPlaylist;

import java.util.List;

public class PlayListN {
    private String namePlaylist;
    private String aboutPlaylist;
    private List<SongInPlaylist> songLines;

    public PlayListN(String namePlaylist, String aboutPlaylist, List<SongInPlaylist> songLines) {
        this.namePlaylist = namePlaylist;
        this.aboutPlaylist = aboutPlaylist;
        this.songLines = songLines;
    }

    public String getNamePlaylist() {
        return namePlaylist;
    }

    public String getAboutPlaylist() {
        return aboutPlaylist;
    }

    public List<SongInPlaylist> getSongLines() {
        return songLines;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (SongInPlaylist songLine : songLines){
            builder.append(i++)
                    .append(". ")
                    .append(songLine)
                    .append("\n");
        }
        return builder.toString();
    }
}
