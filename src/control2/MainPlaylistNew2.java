package control2;

/*import control2.music.fabricSong.PlayList;
import control2.music.fabricSong.songLines;*/

import control2.music.FilterGanre;
import control2.music.SongInPlaylist;
import control2.music.fabricSong.Playlist;
import control2.music.fabricSong.Song;
import control2.music.filter.FilterGenre;
import control2.music.filter.FilterMood;
import home_work_6.dto.EasySearchNew;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// "Songs.txt"
public class MainPlaylistNew2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите название плэйлиста, который будем создавать");
        String namePlaylist = console.nextLine();
        System.out.println("Введите описание для плэйлиста");
        String aboutPlaylist = console.nextLine();
        String nameFile;
        File file;
        do {
            System.out.println("Введите источник для загрузки списка песен (Songs.txt) (для выхода 'quit')");
            nameFile = console.nextLine();
            file = new File(nameFile);
            if (!file.exists()){
                System.out.println("Введите корректный путь");
            } else if ((file.length() == 0)) {
                System.out.println("Источник загрузки песен пуст");
            }
        } while ((nameFile.equals("quit") || nameFile.equals(" ") || !file.exists()) || (file.length() == 0));


        String nameSong;
        long count;
        String line;
        Song song;
        Playlist basePlaylist = new Playlist();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null){
                song = madeSong(line);
                basePlaylist.add(song);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(basePlaylist);

        Playlist playlistForUser = new Playlist(namePlaylist,aboutPlaylist);


        try(FileWriter writer = new FileWriter("Playlist.txt")){
            writer.write("Название плэйлиста: " + namePlaylist + "\n" + "Описание плайлиста: " + aboutPlaylist + "\n");
            EasySearchNew search = new EasySearchNew();
            do {
                System.out.println("Введите название песни, которую добавим в плэйлист (для выхода 'quit', для выбора сортировки по жанру 'genre', для выбора сортировки по настроению 'mood')");
                nameSong = console.nextLine();
                if (!(nameSong.equals("quit") || nameSong.equals("mood") || nameSong.equals("genre"))){
                        for (int i = 0; i < basePlaylist.getSongsInPlaylist().size(); i++) {
                            List<SongInPlaylist> songsInPlaylist = basePlaylist.getSongsInPlaylist();
                            SongInPlaylist songInPlaylist = songsInPlaylist.get(i);
                            count = search.search(songInPlaylist.getSong().getNameSong(), nameSong);
                            if (count >= 0){
                                playlistForUser.add(songInPlaylist.getSong());
                            }
                        }
                }
            }
            while (!(nameSong.equals("quit") || nameSong.equals("mood") || nameSong.equals("genre")));

            System.out.println("Введите название песни, которую добавим в плэйлист (для выхода 'quit', для выбора сортировки по жанру 'genre', для выбора сортировки по настроению 'mood')");

            if (nameSong.equals("genre")) {
                System.out.println("Введите жанр");
                String genre = console.nextLine();
                FilterGenre filter = new FilterGenre();
                for (SongInPlaylist songInBasePlaylist : basePlaylist.getSongsInPlaylist()) {
                    boolean thisGenre = filter.filterSong(songInBasePlaylist.getSong(), genre);
                    if (thisGenre){
                        playlistForUser.add(songInBasePlaylist.getSong());
                    }
               }
            } if (nameSong.equals("mood")){
                System.out.println("Введите настроение");
                String mood = console.nextLine();
                FilterMood filter = new FilterMood();
                for (SongInPlaylist songInBasePlaylist : basePlaylist.getSongsInPlaylist()) {
                    boolean thisMood = filter.filterSong(songInBasePlaylist.getSong(),mood);
                    if (thisMood){
                        playlistForUser.add(songInBasePlaylist.getSong());
                    }
                }
            }
            writer.write(playlistForUser.toString());

            writer.flush();

            System.out.println("Ваш плэйлист в фаиле Playlist.txt");
        } catch (FileNotFoundException e){
            System.out.println("Нет такого фаила");
        } catch (IOException e){
            System.out.println("Ошибка чтения фаила");
        }


    }

    public static Song madeSong (String line){
        int indexNameSong = line.indexOf("\"") + 1;
        String singer = line.substring(0, indexNameSong - 2);
        int indexTimeSong = line.indexOf(":");
        String timeSong = line.substring(indexTimeSong - 1);
        int indexStartGenre = line.indexOf("\"", indexNameSong + 1);
        int indexStopGenre = line.indexOf("-");
        String genre = line.substring(indexStartGenre + 2,indexStopGenre - 1);
        String mood = line.substring(indexStopGenre + 2, indexTimeSong-2);
        String nameSong = line.substring(indexNameSong, indexStartGenre);

        return new Song(singer, nameSong, genre, mood, timeSong);
    }

}
