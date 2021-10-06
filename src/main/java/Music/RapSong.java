package Music;

public class RapSong implements Song{
    String name;
    String artist;
    int duration;

    public RapSong(String name, String artist, int duration) {
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
        return MusicStyles.RAP.toString();
    }

    @Override
    public void sound() {

    }
}