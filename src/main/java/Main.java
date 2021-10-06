import Music.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Song> newListSong = new ArrayList<>();
        newListSong.add(new RockSong("X", "SOAD", 90 ));
        newListSong.add(new PopSong("Happy", "ABBA", 63 ));
        newListSong.add(new ClassicSong("#65", "Bach", 120 ));
        newListSong.add(new RapSong("Game", "50 Cent", 40 ));
        newListSong.add(new RockSong("Toxicity", "SOAD", 85 ));

        TrackList sbornik = new TrackList();
        sbornik.addSong(newListSong);
        System.out.println("duration: " + sbornik.getDuration());
        System.out.println("--Before sort--");
        sbornik.soundRecords();
        sbornik.sortByStyle();
        System.out.println("--After sort--");
        sbornik.soundRecords();
        System.out.println("--Songs From Diapason--");
        sbornik.songsFromDiapason(88,121);

    }
}
