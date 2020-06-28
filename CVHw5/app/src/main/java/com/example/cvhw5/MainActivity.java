package com.example.cvhw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    public static boolean woman ;
    public static boolean man ;
    public static boolean lvl = false ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstName = findViewById(R.id.firstName);
        final EditText lastName = findViewById(R.id.lastName);
        final EditText age = findViewById(R.id.age);
        final EditText phoneNumber = findViewById(R.id.phone_number);
        final EditText job = findViewById(R.id.job);
        final EditText email = findViewById(R.id.email);
        final RadioButton male = findViewById(R.id.male);
        final RadioButton female = findViewById(R.id.female);
        final Button nextButton = findViewById(R.id.next);
        final Switch exp = findViewById(R.id.ep);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent car = new Intent(MainActivity.this, MainActivity2.class);
                car.putExtra("firstName", firstName.getText().toString());
                car.putExtra("lastName", lastName.getText().toString());
                car.putExtra("age", age.getText().toString());
                car.putExtra("phoneNumber", phoneNumber.getText().toString());
                car.putExtra("job", job.getText().toString());
                car.putExtra("email", email.getText().toString());
                car.putExtra("female", woman);
                car.putExtra("male", man);
                car.putExtra("10", lvl);
                startActivity(car);

            }
        });



        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                man = true;
            }
        });
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                woman = true;
            }
        });
        exp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                lvl = true;
            }
        });





    }
}