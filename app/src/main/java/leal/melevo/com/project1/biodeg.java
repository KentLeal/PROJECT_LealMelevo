package leal.melevo.com.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class biodeg extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodeg);

    }
    public void bioexamples(View v) {
        Intent i = new Intent (this, bioex.class);
        startActivity(i);
    }
    public void backback(View v) {
        Intent i = new Intent (this, homepage.class);
        startActivity(i);
    }
}