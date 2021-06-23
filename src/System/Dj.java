package System;

public class Dj extends Extra_Events_Provider{
    private String TypeOfMusic;
    private boolean CustomPlaylist;

    public Dj(String TypeOfMusic, boolean CustomPlaylist, boolean included, String PicsOfExtraEvents, String Duration) {
        super(included, PicsOfExtraEvents, Duration);
        this.TypeOfMusic = TypeOfMusic;
        this.CustomPlaylist = CustomPlaylist;
    }

    public String getTypeOfMusic() {
        return TypeOfMusic;
    }

    public void setTypeOfMusic(String TypeOfMusic) {
        this.TypeOfMusic = TypeOfMusic;
    }

    public boolean isCustomPlaylist() {
        return CustomPlaylist;
    }

    public void setCustomPlaylist(boolean CustomPlaylist) {
        this.CustomPlaylist = CustomPlaylist;
    }
    
}

