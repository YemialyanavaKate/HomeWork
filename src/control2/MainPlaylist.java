package control2;

import control2.music.MadePlayList;
import control2.music.SongInPlaylist;
import control2.music.fabricSong.PlayList;
import control2.music.fabricSong.songLines;
import control2.music.fabricSong.Song;

import java.util.List;

public class MainPlaylist {
    public static void main(String[] args) {
        Song song1 = new Song("Sting", "Shape of my heart",
                "pop-rock", "sad", 180);
        Song song2 = new Song("Queen", "We Will Rock You",

                "rock", "sad", 180);

        SongInPlaylist songInPlaylist1 = new SongInPlaylist(song1);
            SongInPlaylist songInPlaylist2 = new SongInPlaylist(song1);



        MadePlayList songLines = new MadePlayList();
        songLines.add(song1);
        songLines.add(song2);

      //  PlayList playList = new PlayList("rock", "ярко выраженным ритм, США и Западная Европа",songLines)
        //;
                /*List.of(
                new Song("Sting", "Shape of my heart",
                        "pop-rok", "sad", 180)*/

    }

}
