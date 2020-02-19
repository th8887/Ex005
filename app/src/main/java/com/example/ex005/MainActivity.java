package com.example.ex005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv1;
    int p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btn);
        iv1=(ImageView) findViewById(R.id.iv1);

        p=0;
    }
public static Random rnd =new Random();
    public void press(View view) {
        p=rnd.nextInt(3)+1;
        btn.setText("Number:"+p);
        if(p==1)
            iv1.setImageResource(R.drawable.android001);
        if(p==2)
            iv1.setImageResource(R.drawable.android002);
        if(p==3)
            iv1.setImageResource(R.drawable.android003);
    }
}
