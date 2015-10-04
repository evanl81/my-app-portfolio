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
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String appName = ((Button)view).getText().toString();
        CharSequence text = "This is where " + appName + "\nwill launch.";

        if(mAppToast !=null) {
            mAppToast.cancel();
        }

        switch(view.getId()) {
            case R.id.spotifyButton:
                mAppToast = Toast.makeText(context, text, duration);
                mAppToast.show();
                break;

            case R.id.scoresButton:
                mAppToast = Toast.makeText(context, text, duration);
                mAppToast.show();
                break;

            case R.id.libraryButton:
                mAppToast = Toast.makeText(context, text, duration);
                mAppToast.show();
                break;

            case R.id.biggerButton:
                mAppToast = Toast.makeText(context, text, duration);
                mAppToast.show();
                break;

            case R.id.xyzButton:
                mAppToast = Toast.makeText(context, text, duration);
                mAppToast.show();
                break;

            case R.id.capstoneButton:
                mAppToast = Toast.makeText(context, text, duration);
                mAppToast.show();
                break;


        }
    }
}
