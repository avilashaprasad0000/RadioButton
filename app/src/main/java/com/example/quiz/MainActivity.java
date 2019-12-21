package com.example.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.lang.String;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {
RadioGroup rrg;
RadioButton rrb;
Button bb;
EditText eet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rrg= findViewById(R.id.RG1);
        bb= findViewById(R.id.button);
        eet= findViewById(R.id.et);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rrb=findViewById(rrg.getCheckedRadioButtonId());
               String name= rrb.getText().toString();

                if(name.equals("Small"))
                {
                    eet.setTextSize(TypedValue.COMPLEX_UNIT_DIP,8);
                }
                if (name.equals("Large"))
                {
                    eet.setTextSize(TypedValue.COMPLEX_UNIT_DIP,25);
                }
                if(name.equals("Extra Large"))
                {eet.setTextSize(TypedValue.COMPLEX_UNIT_DIP,35);
                }
            }
        });
    }

}
