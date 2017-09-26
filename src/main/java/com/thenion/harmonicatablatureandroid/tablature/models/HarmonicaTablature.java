package com.thenion.harmonicatablatureandroid.tablature.models;

import java.util.ArrayList;

/**
 * Created by Thenion on 25/09/2017.
 */

public class HarmonicaTablature {

    private ArrayList<AbstractMusicNote> musicNotes;

    HarmonicaTablature() {
        musicNotes = new ArrayList();
    }

    public void addNote(AbstractMusicNote note) {
        this.musicNotes.add(note);
    }
}
