package com.example.cvhw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView what = findViewById(R.id.sike);
        TextView message = findViewById(R.id.results);

        Bundle bundle = getIntent().getExtras();
        boolean alien = bundle.getBoolean("alien");
        boolean apple = bundle.getBoolean("apple");
        ImageView boss = findViewById(R.id.fit);
        ImageView back = findViewById(R.id.backgroundss);


        Random num = new Random();
        int number = num.nextInt();


        boss.setImageDrawable(getResources().getDrawable(R.drawable.boss));
        back.setBackgroundResource(R.drawable.round_light_green);


        if (alien) {
            what.setText("Congratulations!");
            message.setText("You're hired alien! We'd love to have you on our team. Completely irrelevant, but could you step into this cage for a while?");

        } else if (apple) {
            what.setText("Congratulations");
            message.setText("Welcome, Boss. I hope you lead the Apple Company into it's new glory days. We're all glad you're replacing Tim Cook.");
        } else if (number % 2 == 0 ){
            what.setText("Congratulations!");
            message.setText("You start Monday. We picked you not because of your qualifications, but because I lost a bet.");
        } else {
            what.setText("Sorry");
            message.setText("Unfortunately, you're not hired. We decided not to hire you solely because of a coin flip.. if that makes you feel any better.");
        }
    }
}