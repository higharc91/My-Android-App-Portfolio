package com.example.granitecityapps.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startSpotifyStreamer(View view) {
        //this method will launch my spotify streamer
        Toast.makeText(this,"Launching " + getResources().getString(R.string.spotify_streamer),
                Toast.LENGTH_SHORT).show();
    }

    public void startScoreApp(View view) {
        //this method will launch my score app
        Toast.makeText(this,"Launching " + getResources().getString(R.string.scores_app),
                Toast.LENGTH_SHORT).show();
    }

    public void startLibaryApp(View view) {
        //this method will launch my libary app
        Toast.makeText(this,"Launching " + getResources().getString(R.string.libary_app),
                Toast.LENGTH_SHORT).show();
    }

    public void startBuildItBiggerApp(View view) {
        //this method will launch my build it bigger app
        Toast.makeText(this,"Launching " + getResources().getString(R.string.build_it_bigger),
                Toast.LENGTH_SHORT).show();
    }

    public void startXYZReaderApp(View view) {
        //this method will launch my xyz reader app
        Toast.makeText(this,"Launching " + getResources().getString(R.string.xyz_reader),
                Toast.LENGTH_SHORT).show();
    }

    public void startCapstoneApp(View view) {
        //this method will launch my capstone app
        Toast.makeText(this,"Launching " + getResources().getString(R.string.capstone_app),
                Toast.LENGTH_SHORT).show();
    }

}
