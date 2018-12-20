package leal.melevo.com.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class nonbioex extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nonbio2);

    }
    public void glassopen(View v) {
        Intent i = new Intent (this, glass.class);
        startActivity(i);
    }
    public void metalopen(View v) {
        Intent i = new Intent (this, metal.class);
        startActivity(i);
    }
    public void plasticopen(View v) {
        Intent i = new Intent (this, plastic.class);
        startActivity(i);
    }
    public void elecopen(View v) {
        Intent i = new Intent (this, elec.class);
        startActivity(i);
    }
    public void  medopen(View v) {
        Intent i = new Intent (this, medical.class);
        startActivity(i);
    }


    public void backback(View v) {
        Intent i = new Intent (this, nonbio.class);
        startActivity(i);
    }
}