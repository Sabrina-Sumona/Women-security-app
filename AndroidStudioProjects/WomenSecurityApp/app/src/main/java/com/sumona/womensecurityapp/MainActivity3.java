package com.sumona.womensecurityapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText name_editText,no_editText;
    Button back_button,save_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        name_editText = findViewById(R.id.editTextTextPersonName);
        no_editText = findViewById(R.id.editTextPhone3);

        save_button = findViewById(R.id.button3);
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contact_name = name_editText.getText().toString();
                String contact_no = no_editText.getText().toString();

                if(contact_name.equals("")||contact_no.equals("")){
                    Toast.makeText(MainActivity3.this,"Profile is not updated", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity3.this, contact_name+"("+contact_no+")"+" is set as the updated profile", Toast.LENGTH_SHORT).show();
                }
            }
        });

        back_button = findViewById(R.id.button4);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}