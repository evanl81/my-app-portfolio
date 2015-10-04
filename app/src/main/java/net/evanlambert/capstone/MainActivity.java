package net.evanlambert.capstone;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonSpotify;
    private Button buttonScores;
    private Button buttonLibrary;
    private Button buttonBuild;
    private Button buttonxyz;
    private Button buttonCapstone;

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

    public void buttonOnClick(View view) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text;
        Toast toast;

        switch(view.getId()) {
            case R.id.spotifyButton:
                text = "This is where my Spotify app will launch.";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

            case R.id.scoresButton:
                text = "This is where my Scores app will launch.";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

            case R.id.libraryButton:
                text = "This is where my Library app will launch.";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

            case R.id.biggerButton:
                text = "This is where my Build It Bigger\napp will launch.";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

            case R.id.xyzButton:
                text = "This is where my XYZ Reader \napp will launch.";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;

            case R.id.capstoneButton:
                text = "This is where my Capstone\napp will launch.";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;


        }
    }
}
