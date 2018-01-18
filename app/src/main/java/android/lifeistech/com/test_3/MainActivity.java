package android.lifeistech.com.test_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView text;
    int test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView)findViewById(R.id.text);
    }

    public void click(View v){
        Random random = new Random();
        int rdm = random.nextInt(11);
        text.setText(rdm + "");
        text.setTextColor(Color.BLACK);
        if((rdm % 3 == 0) && (rdm > 0)){
            text.setTextColor(Color.RED);
        } //else if((rdm % 3 == 1) && (rdm % 3 == 2)){
            //text.setTextColor();
        //}
    }
}
