package com.example.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView ans;
    Button ASK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=(TextView)findViewById(R.id.answer);
        ASK=(Button)findViewById(R.id.ask);
        ASK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] alpha= new String[21];
                alpha[0]="As I see it, yes";
                alpha[1]="Ask again later";
                alpha[2]="Better not tell you now";
                alpha[3]=" Cannot predict now";
                alpha[4]="Concentrate and ask again";
                alpha[5]=" Concentrate and ask again";
                alpha[6]="Don’t count on it";
                alpha[7]="It is certain";
                alpha[8]=" It is decidedly so";
                alpha[9]=" Most likely";
                alpha[10]=" My reply is no";
                alpha[11]=" My sources say no";
                alpha[12]=" Outlook not so good";
                alpha[13]="  Outlook good";
                alpha[14]="  Reply hazy, try again";
                alpha[15]=" Signs point to yes";
                alpha[16]=" Very doubtful";
                alpha[17]=" Without a doubt";
                alpha[18]=" Yes";
                alpha[19]=" Yes – definitely";
                alpha[20]=" You may rely on it";

                Random randomstring=new Random();
                char alphabets=(char)randomstring.nextInt(21);
                ans.setText(alpha[alphabets]);
            }
        });
    }
}
