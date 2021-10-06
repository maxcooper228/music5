package Music;

public class RockSong implements Song{
    String name;
    String artist;
    int duration;

    public RockSong(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getStyle() {
        return MusicStyles.ROCK.toString();
    }

    @Override
    public void sound() {

    }
}
