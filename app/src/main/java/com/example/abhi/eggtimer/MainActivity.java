package com.example.abhi.eggtimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar ts;
    TextView tm;
    public void updatett(int secs){
        int min =(int) secs/60;
        int sec=(int)secs-min*60;
        String ss=Integer.toString(sec);
        if(ss=="0")
        {
            ss="00";
        }
        tm.setText(Integer.toString(min)+":"+ss) ;
    }
    public void Control(View view){
        new CountDownTimer(ts.getProgress() * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ts=(SeekBar)findViewById(R.id.seekBar);
        tm=(TextView)findViewById(R.id.textView);
        ts.setMax(600);
        ts.setProgress(30);
        ts.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updatett(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
