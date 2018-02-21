package com.example.masoud.iscalculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by La on 2/20/2018.
 */

public class splashscreen extends AppCompatActivity {
    private  static int splashtimer=5000;

    private GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.splashscreen );


        gifImageView = (GifImageView) findViewById( R.id.Gifimage );

        try {
            InputStream inputStream = getAssets().open( "hesab.gif" );
            byte[] bytes = IOUtils.toByteArray( inputStream );
            gifImageView.setBytes( bytes );
            gifImageView.startAnimation();

        } catch (IOException e) {
            e.printStackTrace();
        }
        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent homeintent = new Intent( splashscreen.this, MainActivity.class );
                startActivity( homeintent );
                finish();

            }
        }, splashtimer );


    }
}
