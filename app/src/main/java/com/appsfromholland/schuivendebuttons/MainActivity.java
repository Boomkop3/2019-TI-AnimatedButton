package com.appsfromholland.schuivendebuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_a, btn_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn_a = (Button) findViewById(R.id.btn_a);
        this.btn_b = (Button) findViewById(R.id.btn_b);

        this.btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation = AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.out
                );
                animation.reset();
                btn_a.clearAnimation();
                btn_a.startAnimation(animation);

                Animation animation2 = AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.in
                );
                animation.reset();
                btn_b.clearAnimation();
                btn_b.startAnimation(animation2);
            }
        });
    }
}
