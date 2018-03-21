package com.example.vinayak.customradiobuttontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------------to start Scrolling from right end----------------
        final HorizontalScrollView s=(HorizontalScrollView)findViewById(R.id.horizontalScrollView);
        s.postDelayed(new Runnable() {
            public void run() {
                s.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
            }
        }, 100L);


    }
    //------------On Click Event For Radio Buttons----------------
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Radio Button 1 Clicked",Toast.LENGTH_LONG).show();
                    break;
            case R.id.radio2:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Radio Button 2 Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio3:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Radio Button 3 Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio4:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Radio Button 4 Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio5:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Radio Button 5 Clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.radio6:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Radio Button 6 Clicked",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
