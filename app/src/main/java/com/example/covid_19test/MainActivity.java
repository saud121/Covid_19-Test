package com.example.covid_19test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app.infideap.stylishwidget.view.AMeter;
import com.github.anastr.speedviewlib.Speedometer;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    String [] textarray={"Do you have fever?","Do you feel any Trouble while breathing?","Do you have Pneumonia?","Do you Cough (DRY) ?","Travel history with COVID-19 out break Country?","Had any Contact with covid-19 patient?","Suffering Fatigue?","Feeling Muscle pain?","Have Sore throat?","Worsening Headache?","Shortness of breath?","Had Diarrhea?","Having Runny nose?","Screening completed wish procced to result?"};
    Context context=this;
    LinearLayout linearLayout ;
    NestedScrollView nestedScrollView;



    private static final String TAG = "";
    int i =0;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = new FloatingActionButton(this);

        fab=findViewById(R.id.FloatRefresh);
        linearLayout = new LinearLayout(this) ;
        nestedScrollView= new NestedScrollView(this);
        nestedScrollView=(NestedScrollView) findViewById(R.id.scroll);
        linearLayout=(LinearLayout) findViewById(R.id.lll);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        nestedScrollView.post(new Runnable() {
//            @Override
//            public void run() {
//                nestedScrollView.scrollTo(0,nestedScrollView.getBottom());
//            }
//        });
//        final Button button_Start=new Button(this);
//        button_Start.setText("Start");
//        button_Start.setTextSize(40);
//        button_Start.setLayoutParams(new LinearLayout.LayoutParams(50, 100));



//        linearLayout.addView(button_Start);




//button_Start.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        button_Start.setText("STARTED");
//        for (int i=0;i<textarray.length;i++){
//            TextView textView1 = new TextView(context);
//
//
//            Button l =new Button(context);
//            l.setText("yes");
//            l.setLayoutParams(new LinearLayout.LayoutParams(100,100));
//            LinearLayout.LayoutParams params= (LinearLayout.LayoutParams)l.getLayoutParams();
//            params.setMarginStart(500);
//            l.setLayoutParams(params);
//            textView1.setText(textarray[i]);
//
//            textView1.setTextColor(Color.rgb(255,255,255));
//            textView1.setTextSize(20);
//            textView1.setBackgroundResource(R.drawable.msg1);
//            linearLayout.addView(textView1);
//            linearLayout.addView(l);
//
//        }
//    }
//});

//        if (button_Start.isEnabled()){
            Log.d(TAG, "onCreate: pressed");

                TextView textView = new TextView(this);

                Button j =new Button(this);
                j.setText("yes");
                j.setBackgroundResource(R.drawable.reply);

        j.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            LinearLayout.LayoutParams params= (LinearLayout.LayoutParams)j.getLayoutParams();
        params.gravity= RelativeLayout.ALIGN_PARENT_END;
            params.setMarginEnd(15);
            j.setLayoutParams(params);
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView.setText("LETS START THE COVID-19 SCREENING?");
                textView.setTextColor(Color.rgb(255,255,255));
                textView.setTextSize(18);
                textView.setBackgroundResource(R.drawable.msg1);
            linearLayout.addView(textView);
            linearLayout.addView(j);

            j.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                newQuestion();

                }
            });

//        }
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.recreate();
            }
        });
    }

    private void newQuestion() {
        final TextView textView = new TextView(context);
//        final TextView x = new TextView(context);

        final Button button_yes =new Button(context);
        final Button button_no =new Button(context);


        button_no.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        button_yes.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//        x.setLayoutParams(new LinearLayout.LayoutParams(1000,10));

        LinearLayout.LayoutParams params= (LinearLayout.LayoutParams)button_yes.getLayoutParams();
        params.gravity= RelativeLayout.ALIGN_PARENT_END;

        params.setMargins(0,10,15,0);
        button_yes.setLayoutParams(params);
        LinearLayout.LayoutParams paramsy= (LinearLayout.LayoutParams)button_no.getLayoutParams();
        paramsy.gravity= RelativeLayout.ALIGN_PARENT_END;
        paramsy.setMargins(0,10,15,0);
        button_no.setLayoutParams(paramsy);
        LinearLayout.LayoutParams parmsz=(LinearLayout.LayoutParams)textView.getLayoutParams();
        parmsz.gravity=RelativeLayout.ALIGN_PARENT_START;
        parmsz.setMarginStart(20);
        parmsz.setMargins(0,10,0,0);
        textView.setLayoutParams(parmsz);
        button_no.setText("NO");
        button_yes.setText("YES");


        button_no.setBackgroundResource(R.drawable.reply);
        button_yes.setBackgroundResource(R.drawable.reply);
        textView.setText(textarray[i]);
        textView.setTextColor(Color.rgb(255,255,255));
        textView.setTextSize(25);
        textView.setBackgroundResource(R.drawable.msg1);
        linearLayout.addView(textView);
        linearLayout.addView(button_yes);
//        linearLayout.addView(x);
        linearLayout.addView(button_no);
        linearLayout.scrollTo(0,linearLayout.getBottom());
       // new linearlayout on every question
        button_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i==0||i<6){
                    i++;
                    score+=3;
                    newQuestion();

                }
                else if( i==6|| i<11 ){
                    i++;
                    score+=2;
                    newQuestion();

                }else if( i==11|| i==12 ){
                    i++;
                    score+=1;
                    newQuestion();

                }
                else if (i==13){
                    dialog();


                }
                button_yes.setEnabled(false);
            }

        });
        button_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i<12){
                    i++;
                    newQuestion();
                }
                else if (i==12){
                    dialog();


                }
                button_no.setEnabled(false);
            }
        });

    }

    private void dialog() {
        final Dialog dialog= new Dialog(context);


        dialog.setContentView(R.layout.testresult);
        dialog.setTitle("SCREENING RESULT");
        TextView textView2=dialog.findViewById(R.id.result);
        AMeter aMeter= dialog.findViewById(R.id.meter);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        aMeter.setMaxValue(100);
        aMeter.setBackgroundColor(Color.rgb(109,235,84));
        aMeter.setMeterColor(Color.rgb(255,255,255));
        aMeter.setShowText(true);
        aMeter.setValue(score);
        Log.d(TAG, "onClick: "+score);
if (score<=6) {
    textView2.setText("YOU HAVE LOW SYMPTOMS OF COVID-19");
    textView2.setTextColor(Color.rgb(255, 255, 255));
    textView2.setTextSize(15);
}
        else if (score>6&&score<8) {
            textView2.setText("YOU HAVE MEDIUM SYMPTOMS OF COVID-19");
            textView2.setTextColor(Color.rgb(255, 255, 0));
            textView2.setTextSize(15);
        }
        else if (score>8) {
            textView2.setText("YOU HAVE HIGH SYMPTOMS OF COVID-19");
            textView2.setTextColor(Color.rgb(255, 0, 0));
            textView2.setTextSize(15);
        }
        dialog.show();
    }


}
// floating button code
// MainActivity.this.recreate();