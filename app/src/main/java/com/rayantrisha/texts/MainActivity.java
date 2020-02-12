package com.rayantrisha.texts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button submitButton;
    public Button Button2;
    int i=1;
    TextView text;
    TextView text2;
    EditText place;
    int intem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] planets = getResources().getStringArray(R.array.planets_array);

        submitButton=findViewById(R.id.clickButton);
        text = findViewById(R.id.responseTextView);
        text2 = findViewById(R.id.responseTextView2);
        place = findViewById(R.id.plain_text_input);
        Button2 = findViewById(R.id.clickButton2);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Log.i("test","hello");
                text.setText(planets[intem].toString());
                intem = intem +1;
                if(intem == 4) {
                    intem = 0;
                }
                //text.setText(""+ ++i); //text thing.getText




            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Log.i("test","hello");
                text2.setText(place.getText().toString());
                //text.setText(""+ ++i); //text thing.getText




            }
        });
    }
}