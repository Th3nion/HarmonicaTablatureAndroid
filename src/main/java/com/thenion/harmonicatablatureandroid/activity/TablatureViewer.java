package com.thenion.harmonicatablatureandroid.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import com.example.thenion.harmonicatablatureandroid.R;

public class TablatureViewer extends AppCompatActivity {

    GridView partitionGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablature_viewer);
        this.partitionGridView = (GridView) findViewById(R.id.tablatureGridLayout);
        partitionGridView.setAdapter(new ImageAdapter(this));
    }
}
