package com.ogi.mynoteapp;

import com.ogi.mynoteapp.model.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
