package com.thenion.harmonicatablatureandroid.tablature.models;
/**
 * Created by Thenion on 25/09/2017.
 */

public class AbstractMusicNote {

    private NoteDuration duration;

    public AbstractMusicNote() {
        this.duration = NoteDuration.BREVE;
    }

    public AbstractMusicNote(NoteDuration duration) {
        this.duration = duration;
    }

    public NoteDuration getDuration() {
        return duration;
    }

    public void setDuration(NoteDuration duration) {
        this.duration = duration;
    }
}
