package Music;

public class PopSong implements Song{
    String name;
    String artist;
    int duration;

    public PopSong(String name, String artist, int duration) {
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
        return MusicStyles.POP.toString();
    }

    @Override
    public void sound() {

    }
}