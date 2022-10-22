package com.example.graphview2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double y=-1,x=-1;

        GraphView graph =findViewById(R.id.graph1);
        series = new LineGraphSeries<>();
        for(int i =0; i<7; i++) {
            x = x + 1;

            y = y+1;
            series.appendData(new DataPoint(x, y), true, 100);
        }
        graph.addSeries(series);
    }


}
