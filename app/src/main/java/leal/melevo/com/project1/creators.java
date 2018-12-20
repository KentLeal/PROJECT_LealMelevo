package leal.melevo.com.project1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class creators extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creators);

    }
    public void fbkent (View v)
    {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/keentleeal/"));
        startActivity(browserIntent);;
    }

    public void fbarvin (View v)
    {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.facebook.com/arvinrmelevo"));
        startActivity(browserIntent);;
    }

    public void twkent (View v)
    {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://twitter.com/KentLeal_"));
        startActivity(browserIntent);;
    }

    public void twarvin (View v)
    {
        Intent browserIntent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://twitter.com/arvinreyesd"));
        startActivity(browserIntent);;
    }


    public void backback(View v)
    {
        Intent i = new Intent (this, homepage.class);
        startActivity(i);
    }

}