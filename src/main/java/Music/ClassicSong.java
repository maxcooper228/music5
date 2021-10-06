package Music;

public class ClassicSong implements Song{
    String name;
    String artist;
    int duration;

    public ClassicSong(String name, String artist, int duration) {
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
        return MusicStyles.CLASSIC.toString();
    }

    @Override
    public void sound() {

    }
}