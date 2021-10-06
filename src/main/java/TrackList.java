import Music.Song;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrackList {
    List<Song> songs = new ArrayList<>();

    public void addSong(List<Song> songs){
        this.songs.addAll(songs);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }

    public int getDuration(){
        int listDuration = 0;
        for (Song s : songs) {
            listDuration += s.getDuration();
        }
        return listDuration;
    }

    public void sortByStyle(){
        songs.sort(Comparator.comparingInt(o -> o.getStyle().charAt(0)));

    }

    public void songsFromDiapason(int x, int y){
        for(Song s : songs){
            if((s.getDuration() >= x)&&(s.getDuration() <= y)){
                System.out.println(s.getStyle());
            }
        }
    }

    public void soundRecords(){
        songs.forEach(e-> System.out.println(e.getStyle()));
    }
}
