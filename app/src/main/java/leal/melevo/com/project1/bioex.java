package leal.melevo.com.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class bioex extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biodeg2);

    }

    public void wasteopen(View v) {
        Intent i = new Intent (this, waste.class);
        startActivity(i);
    }
    public void plantopen(View v) {
        Intent i = new Intent (this, plant.class);
        startActivity(i);
    }
    public void woodopen(View v) {
        Intent i = new Intent (this, wood.class);
        startActivity(i);
    }
    public void leavesopen(View v) {
        Intent i = new Intent (this, leaves.class);
        startActivity(i);
    }
    public void  remainsopen(View v) {
        Intent i = new Intent (this, remains.class);
        startActivity(i);
    }
    public void backback(View v) {
        Intent i = new Intent (this, biodeg.class);
        startActivity(i);
    }
}