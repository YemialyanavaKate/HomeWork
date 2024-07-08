package control2;

/*import control2.music.fabricSong.PlayList;
import control2.music.fabricSong.songLines;*/

import control2.music.FilterGanre;
import control2.music.fabricSong.Playlist;
import control2.music.fabricSong.Song;
import control2.music.filter.FilterGenre;
import home_work_6.dto.EasySearchNew;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

// "Songs.txt"
public class MainPlaylistNew {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите название плэйлиста, который будем создавать");
        String namePlaylist = console.nextLine();
        System.out.println("Введите описание для плэйлиста");
        String aboutPlaylist = console.nextLine();
        String nameFile;
        do {
            System.out.println("Введите источник для загрузки списка песен (Songs.txt) (для выхода 'quit')");
            nameFile = console.nextLine();
        } while ((nameFile.equals("quit") || nameFile.equals(" ")));

        File file = new File(nameFile);
        String nameSong;
        String singer;
        String genre;
        String mood;
        String timeSong;
        long count;
        long number = 1;
        Playlist playlist = new Playlist(namePlaylist, aboutPlaylist);

        try(FileWriter writer = new FileWriter("Playlist.txt")){
            writer.write("Название плэйлиста: " + namePlaylist + "\n" + "Описание плайлиста: " + aboutPlaylist + "\n");
            EasySearchNew search = new EasySearchNew();
            String text = Files.readString(Path.of(nameFile));
            String line;
            System.out.println(text);
            Song song = null;
            do {
                System.out.println("Какую песню добавим в плэйлист? (для выхода 'quit', для выбора сортировки по жанру 'genre', для выбора сортировки по настроению 'mood')");
                nameSong = console.nextLine();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                if (!(nameSong.equals("quit") || nameSong.equals("mood") || nameSong.equals("genre"))){
                while ((line = reader.readLine()) != null) {
                    count = search.search(line, nameSong);
                    if (count > 0) {
                        int indexNameSong = line.indexOf("\"") + 1;
                        singer = line.substring(0, indexNameSong - 2);
                        int indexTimeSong = line.indexOf(":");
                        timeSong = line.substring(indexTimeSong - 1);
                        int indexStartGenre = line.indexOf("\"", indexNameSong + 1);
                        int indexStopGenre = line.indexOf("-");
                        genre = line.substring(indexStartGenre + 1,indexStopGenre - 1);
                        mood = line.substring(indexStopGenre + 2, indexTimeSong);
                        nameSong = line.substring(indexNameSong, indexStartGenre);

                        song = new Song(singer, nameSong, genre, mood, timeSong);

                        writer.write(number + ". " + song + "\n");
                    }
                }
                }
                if (song != null) {
                    playlist.add(song);
                }
                number++;
            }
            while (!(nameSong.equals("quit") || nameSong.equals("mood") || nameSong.equals("genre")));
            writer.flush();
            System.out.println("Ваш плэйлист в фаиле Playlist.txt");

            //FilterGanre filt = new FilterGanre(playList);
          //  FilterGenre filt = new FilterGenre();
           // filt.filterGenre(playlist.getSongsInPlaylist(), "pop");
            System.out.println(playlist);

        } catch (FileNotFoundException e){
            System.out.println("Нет такого фаила");
        } catch (IOException e){
            System.out.println("Ошибка чтения фаила");
        }
        /*FabricPlaylist fabricPlaylist = new FabricPlaylist();
        fabricPlaylist.add(song1);
        fabricPlaylist.add(song2);
        fabricPlaylist.add(song3);
        List<ISong> songs = fabricPlaylist.getSongs();


        SongInPlaylist songInPlaylist = new SongInPlaylist(song1);


        Playlist playlist = new Playlist("BestDay", "defferent music");

        playlist.add(songs.get(0));

        System.out.println(playlist.getSongsInPlaylist().get(0).getSong());*/

    }

}
