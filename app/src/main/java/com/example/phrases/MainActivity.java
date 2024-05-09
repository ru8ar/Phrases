package com.example.phrases;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn, btn1, btn2, btn3, btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.ademain);
        btn1= (Button) findViewById(R.id.bonnenuit);
        btn2 = (Button) findViewById(R.id.comment);
        btn3 = (Button) findViewById(R.id.jenesaispas);
        btn4 = (Button) findViewById(R.id.pouvezvousmaider);
        btn5 = (Button) findViewById(R.id.mesdamesetmessieurs);

    }

    public void MyClick(View v) {

        int id = v.getId();
        String ourId="";
        ourId = v.getResources().getResourceEntryName(id);

        Log.d("Tapped", "Pressed to" +ourId);

        int resId = getResources().getIdentifier(ourId, "raw", "com.example.phrases");
        MediaPlayer mp = MediaPlayer.create(this, resId);
        mp.start();
    }

    public void Clickk(View v){
        AlertDialog ald = new AlertDialog.Builder(this)
                .setTitle("Emin misin?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Bence çıkmamalısın, çıkacak mısın?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Of yaaa", Toast.LENGTH_LONG).show();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Ha ha haa", Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }
}