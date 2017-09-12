package com.example.aidan.tilegame.levelEditor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LevelEditorScreen extends AppCompatActivity {

    private LevelEditor levelEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        levelEditor = new LevelEditor(this);

        setContentView(levelEditor);


    }

    @Override
    protected void onResume(){
        super.onResume();
        levelEditor.resume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        levelEditor.pause();
    }
}
