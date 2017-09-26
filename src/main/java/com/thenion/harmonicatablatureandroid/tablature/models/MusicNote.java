package com.thenion.harmonicatablatureandroid.tablature.models;

/**
 * Created by Thenion on 25/09/2017.
 */

public class MusicNote extends AbstractMusicNote{

    private NotePitch pitch;
    private Dynamic dynamic;

    public MusicNote(NoteDuration duration, NotePitch pitch) {
        super(duration);
        this.pitch = pitch;
        this.dynamic = Dynamic.P;
    }

    public MusicNote(NotePitch pitch, NoteDuration duration, Dynamic dynamic) {
        this(duration, pitch);
        this.dynamic = dynamic;
    }

    public NotePitch getPitch() {
        return pitch;
    }

    public void setPitch(NotePitch pitch) {
        this.pitch = pitch;
    }

    public Dynamic getDynamic() {
        return dynamic;
    }

    public void setDynamic(Dynamic dynamic) {
        this.dynamic = dynamic;
    }
}
