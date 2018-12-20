package leal.melevo.com.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class homepage extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

    }

    public void biodegradable(View v) {
        Intent i = new Intent (this, biodeg.class);
        startActivity(i);
    }

    public void nonbio(View v) {
        Intent i = new Intent (this, nonbio.class);
        startActivity(i);
    }

    public void recyclable(View v) {
        Intent i = new Intent (this, recycle.class);
        startActivity(i);
    }

    public void creators(View v) {
        Intent i = new Intent (this, creators.class);
        startActivity(i);
    }

    public void exit(View v) {
        Intent i = new Intent (this, exit.class);
        startActivity(i);
    }

    public void oops(View v) {
        Intent i = new Intent (this, homepage.class);
        startActivity(i);
    }
}