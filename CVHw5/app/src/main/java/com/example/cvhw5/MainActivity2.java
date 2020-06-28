package com.example.cvhw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String gender ;
    boolean alien = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView pic = findViewById(R.id.profile_pic);

        Bundle bundle = getIntent().getExtras();
        boolean female = bundle.getBoolean("female");
        boolean male = bundle.getBoolean("male");
        String first = bundle.getString("firstName");
        String last = bundle.getString("lastName");
        String age = bundle.getString("age");
        String phone = bundle.getString("phoneNumber");
        String job = bundle.getString("job");
        String email = bundle.getString("email");
        final boolean exp = bundle.getBoolean("10");


        TextView name1 = findViewById(R.id.name1);
        TextView name2 = findViewById(R.id.name2);
        TextView Age = findViewById(R.id.age2);
        TextView number = findViewById(R.id.phone2);
        TextView Email = findViewById(R.id.email2);
        TextView Job = findViewById(R.id.job2);
        TextView description = findViewById(R.id.description);
        Button send = findViewById(R.id.sendButton);

        //setting the strings in the right place:

        name1.setText(first);
        name2.setText(last);
        Age.setText(age);
        number.setText(phone);
        Email.setText(email);
        Job.setText(job);

        if (female && male ) {
            pic.setImageDrawable(getResources().getDrawable(R.drawable.alien));
            gender = "alien";
            alien = true;

        } else if (female){
            pic.setImageDrawable(getResources().getDrawable(R.drawable.woman));
            gender = "woman";

        } else if (male){
            pic.setImageDrawable(getResources().getDrawable(R.drawable.man));
            gender = "man";

        } else {
            pic.setImageDrawable(getResources().getDrawable(R.drawable.alien));
            gender = "alien";
            alien = true;

        }

        if (exp) {
            description.setText("My name is " + first + " "+ last + ". I am a " + age +" year old " + gender +". I am also a " + job +". I have more than 5 years of experience. You'd be lucky to have me. Never mind, Apple just called, they want me to be their new CEO.");

        } else {
            description.setText("My name is " + first + " " + last + ". I am a " + age + " year old " + gender + ". I am a " + job + ". Please hire me!");
        }

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boat = new Intent(MainActivity2.this, MainActivity3.class);
                boat.putExtra("apple", exp);
                boat.putExtra("alien", alien);
                startActivity(boat);


            }
        });






    }
}