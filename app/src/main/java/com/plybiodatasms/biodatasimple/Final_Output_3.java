package com.plybiodatasms.biodatasimple;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Final_Output_2 extends AppCompatActivity {
    TextView p1, p2, p3, p4, p5, p6, p7, q7, q2, q3, q4, q5, q6, E2, E3, E4, E5, E6, s2, s3, s4, s5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_2);

        p1 = findViewById(R.id.p1);
        p1.setText("" + MainActivity.name1);

        p2 = findViewById(R.id.p2);
        p2.setText("" + MainActivity.name2);

        p3 = findViewById(R.id.p3);
        p3.setText("" + MainActivity.name3);

        p4 = findViewById(R.id.p4);
        p4.setText("" + MainActivity.name4);

        p5 = findViewById(R.id.p5);
        p5.setText("" + MainActivity.name5);

        p6 = findViewById(R.id.p6);
        p6.setText("" + MainActivity.name6);

        p7 = findViewById(R.id.p7);
        p7.setText(""+MainActivity.radioBtn);

        q7 = findViewById(R.id.q7);
        q7.setText("" + Qualification_Information.q1);

        q2 = findViewById(R.id.q2);
        q2.setText("" + Qualification_Information.q2);

        q3 = findViewById(R.id.q3);
        q3.setText("" + Qualification_Information.q3);

        q4 = findViewById(R.id.q4);
        q4.setText("" + Qualification_Information.q4);

        q5 = findViewById(R.id.q5);
        q5.setText("" + Qualification_Information.q5);

        q6 = findViewById(R.id.q6);
        q6.setText("" + Qualification_Information.q6);


        E2 = findViewById(R.id.E2);
        E2.setText("" + Company_Experience.E2);

        E3 = findViewById(R.id.E3);
        E3.setText("" + Company_Experience.E3);

        E4 = findViewById(R.id.E4);
        E4.setText("" + Company_Experience.E4);

        E5 = findViewById(R.id.E5);
        E5.setText("" + Company_Experience.E5);

        E6 = findViewById(R.id.E6);
        E6.setText("" + Company_Experience.E6);

        s2 =findViewById(R.id.s2);
        s2.setText(""+ Other_Skill.s1);

        s3 =findViewById(R.id.s3);
        s3.setText(""+ Other_Skill.s2);

        s4 =findViewById(R.id.s4);
        s4.setText(""+ Other_Skill.s3);

        s5 =findViewById(R.id.s5);
        s5.setText(""+ Other_Skill.s4);

    }
}