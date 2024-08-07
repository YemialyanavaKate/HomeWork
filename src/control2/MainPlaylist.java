package control2;

import control2.music.FabricPlaylist;
import control2.music.FilterGanre;
import control2.music.SongInPlaylist;
/*import control2.music.fabricSong.PlayList;
import control2.music.fabricSong.songLines;*/
import control2.music.fabricSong.Playlist;
import control2.music.fabricSong.Song;
import control2.music.fabricSong.api.ISong;
import home_work_6.dto.EasySearchNew;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
// "Songs.txt"
public class MainPlaylist {
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
        String timeSong;
        long count = 0;
        long number = 1;

        try(FileWriter writer = new FileWriter("Playlist.txt")){
            writer.write("Название плэйлиста: " + namePlaylist + "\n" + "Описание плайлиста: " + aboutPlaylist + "\n");
            EasySearchNew search = new EasySearchNew();
            String text = Files.readString(Path.of(nameFile));
            String line;
            System.out.println(text);
            //FilterGanre filt = new FilterGanre();

            do {
                System.out.println("Какую песню добавим в плэйлист? (для выхода 'quit', для выбора другого фаила 'file')");
                nameSong = console.nextLine();
                BufferedReader reader = new BufferedReader(new FileReader(file));
                if (!(nameSong.equals("quit") || nameSong.equals("mood") || nameSong.equals("genre"))){
                while ((line = reader.readLine()) != null) {
                    count = search.search(line, nameSong);
                    if (count > 0) {
                        int x = line.indexOf(nameSong);
                        singer = line.substring(0, x - 2);
                        // timeSong - cитать знак ":" и записать одну цифру до и две после
                        int y = line.indexOf(":");
                        timeSong = line.substring(y-2);
                        writer.write(number + ". " + singer + " - " + nameSong +
                                timeSong + "\n");
                    }
                }
                }
                number++;

            }
            while (!(nameSong.equals("quit") || nameSong.equals("mood") || nameSong.equals("genre")));
            writer.flush();
            System.out.println("Ваш плэйлист в фаиле Playlist.txt");

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
