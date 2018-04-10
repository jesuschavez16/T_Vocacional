package com.example.jorda.t_vocacional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CheckBox rb;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.Enviar);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Enviar:
                int Res1 = 0,Res2 = 0,Res3 = 0,Res4 = 0,Res5 = 0;
                int r1 = 0,r2 = 0,r3 = 0,r4 = 0,r5= 0,r6=0,r7=0,r8=0,r9=0,r10=0,r11=0,r12=0,r13=0,r14=0,r15=0,r16=0,r17=0,r18=0,r19=0,r20=0,r21=0,r22=0,r23=0,r24=0,r25=0,r26=0,r27=0,r28=0,r29=0,r30=0,r31=0,r32=0,r33=0,r34=0,r35=0,r36=0,r37=0,r38=0,r39=0,r40=0,r41=0,r42=0,r43=0,r44=0,r45=0,r46=0,r48=0,r49=0,r51=0,r52 = 0;
                rb = (CheckBox) findViewById(R.id.R1);
                if(rb.isChecked()){r1=1;} else{r1=0;}
                rb = (CheckBox) findViewById(R.id.R2);
                if(rb.isChecked()){r2=1;} else{r2=0;}
                rb = (CheckBox) findViewById(R.id.R3);
                if(rb.isChecked()){r3=1;} else{r3=0;}
                rb = (CheckBox) findViewById(R.id.R4);
                if(rb.isChecked()){r4=1;} else{r4=0;}
                rb = (CheckBox) findViewById(R.id.R5);
                if(rb.isChecked()){r5=1;} else{r5=0;}
                rb = (CheckBox) findViewById(R.id.R6);
                if(rb.isChecked()){r6=1;} else{r6=0;}
                rb = (CheckBox) findViewById(R.id.R7);
                if(rb.isChecked()){r7=1;} else{r7=0;}
                rb = (CheckBox) findViewById(R.id.R8);
                if(rb.isChecked()){r8=1;} else{r8=0;}
                rb = (CheckBox) findViewById(R.id.R9);
                if(rb.isChecked()){r9=1;} else{r9=0;}
                rb = (CheckBox) findViewById(R.id.R10);
                if(rb.isChecked()){r10=1;} else{r10=0;}
                rb = (CheckBox) findViewById(R.id.R11);
                if(rb.isChecked()){r11=1;} else{r11=0;}
                rb = (CheckBox) findViewById(R.id.R12);
                if(rb.isChecked()){r12=1;} else{r12=0;}
                rb = (CheckBox) findViewById(R.id.R13);
                if(rb.isChecked()){r13=1;} else{r13=0;}
                rb = (CheckBox) findViewById(R.id.R14);
                if(rb.isChecked()){r14=1;} else{r14=0;}
                rb = (CheckBox) findViewById(R.id.R15);
                if(rb.isChecked()){r15=1;} else{r15=0;}
                rb = (CheckBox) findViewById(R.id.R16);
                if(rb.isChecked()){r16=1;} else{r16=0;}
                rb = (CheckBox) findViewById(R.id.R17);
                if(rb.isChecked()){r17=1;} else{r17=0;}
                rb = (CheckBox) findViewById(R.id.R18);
                if(rb.isChecked()){r18=1;} else{r18=0;}
                rb = (CheckBox) findViewById(R.id.R19);
                if(rb.isChecked()){r19=1;} else{r19=0;}
                rb = (CheckBox) findViewById(R.id.R20);
                if(rb.isChecked()){r20=1;} else{r20=0;}
                rb = (CheckBox) findViewById(R.id.R21);
                if(rb.isChecked()){r21=1;} else{r21=0;}
                rb = (CheckBox) findViewById(R.id.R22);
                if(rb.isChecked()){r22=1;} else{r22=0;}
                rb = (CheckBox) findViewById(R.id.R23);
                if(rb.isChecked()){r23=1;} else{r23=0;}
                rb = (CheckBox) findViewById(R.id.R24);
                if(rb.isChecked()){r24=1;} else{r24=0;}
                rb = (CheckBox) findViewById(R.id.R25);
                if(rb.isChecked()){r25=1;} else{r25=0;}
                rb = (CheckBox) findViewById(R.id.R26);
                if(rb.isChecked()){r26=1;} else{r26=0;}
                rb = (CheckBox) findViewById(R.id.R27);
                if(rb.isChecked()){r27=1;} else{r27=0;}
                rb = (CheckBox) findViewById(R.id.R28);
                if(rb.isChecked()){r28=1;} else{r28=0;}
                rb = (CheckBox) findViewById(R.id.R29);
                if(rb.isChecked()){r29=1;} else{r29=0;}
                rb = (CheckBox) findViewById(R.id.R30);
                if(rb.isChecked()){r30=1;} else{r30=0;}
                rb = (CheckBox) findViewById(R.id.R31);
                if(rb.isChecked()){r31=1;} else{r31=0;}
                rb = (CheckBox) findViewById(R.id.R32);
                if(rb.isChecked()){r32=1;} else{r32=0;}
                rb = (CheckBox) findViewById(R.id.R33);
                if(rb.isChecked()){r33=1;} else{r33=0;}
                rb = (CheckBox) findViewById(R.id.R34);
                if(rb.isChecked()){r34=1;} else{r34=0;}
                rb = (CheckBox) findViewById(R.id.R35);
                if(rb.isChecked()){r35=1;} else{r35=0;}
                rb = (CheckBox) findViewById(R.id.R36);
                if(rb.isChecked()){r36=1;} else{r36=0;}
                rb = (CheckBox) findViewById(R.id.R37);
                if(rb.isChecked()){r37=1;} else{r37=0;}
                rb = (CheckBox) findViewById(R.id.R38);
                if(rb.isChecked()){r38=1;} else{r38=0;}
                rb = (CheckBox) findViewById(R.id.R39);
                if(rb.isChecked()){r39=1;} else{r39=0;}
                rb = (CheckBox) findViewById(R.id.R40);
                if(rb.isChecked()){r40=1;} else{r40=0;}
                rb = (CheckBox) findViewById(R.id.R41);
                if(rb.isChecked()){r41=1;} else{r41=0;}
                rb = (CheckBox) findViewById(R.id.R42);
                if(rb.isChecked()){r42=1;} else{r42=0;}
                rb = (CheckBox) findViewById(R.id.R43);
                if(rb.isChecked()){r43=1;} else{r43=0;}
                rb = (CheckBox) findViewById(R.id.R44);
                if(rb.isChecked()){r44=1;} else{r44=0;}
                rb = (CheckBox) findViewById(R.id.R45);
                if(rb.isChecked()){r45=1;} else{r45=0;}
                rb = (CheckBox) findViewById(R.id.R46);
                if(rb.isChecked()){r46=1;} else{r46=0;}
                rb = (CheckBox) findViewById(R.id.R48);
                if(rb.isChecked()){r48=1;} else{r48=0;}
                rb = (CheckBox) findViewById(R.id.R49);
                if(rb.isChecked()){r49=1;} else{r49=0;}
                rb = (CheckBox) findViewById(R.id.R51);
                if(rb.isChecked()){r51=1;} else{r51=0;}
                rb = (CheckBox) findViewById(R.id.R52);
                if(rb.isChecked()){r52=1;} else{r52=0;}

                Res1= r4+r9+r12+r20+r28+r31+r35+r39+r43+r46;
                Res2= r6+r13+r23+r25+r34+r37+r38+r42+r49+r52;
                Res3= r5+r10+r15+r19+r21+r26+r29+r33+r36+r44;
                Res4= r1+r7+r11+r17+r18+r24+r30+r41+r48+r51;
                Res5= r2+r3+r8+r14+r16+r22+r27+r32+r40+r45;

                int max = 0;

                if(Res1+Res2+Res3+Res4+Res5 < 20){
                    Toast.makeText(getApplicationContext(),"Debe marcar almenos 20 actividades",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(max<Res1){
                        max = Res1;
                    }
                    if(max<Res2){
                        max = Res2;
                    }
                    if(max<Res3){
                        max = Res3;
                    }
                    if(max<Res4){
                        max = Res4;
                    }
                    if(max<Res5){
                        max = Res5;
                    }

                    if(max==Res1){
                        Toast.makeText(getApplicationContext(),"Artes y creatividad",Toast.LENGTH_LONG).show();
                    }else{
                        if(max==Res2){
                            Toast.makeText(getApplicationContext(),"Ciencias Sociales",Toast.LENGTH_LONG).show();
                        }else{
                            if(max==Res3){
                                Toast.makeText(getApplicationContext(),"Economica, Administrativa y Financiera",Toast.LENGTH_LONG).show();
                            }else{
                                if(max==Res4){
                                    Toast.makeText(getApplicationContext(),"Ciencia y Tecnologia",Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(getApplicationContext(),"Ciencias Ecologicas y ciencias de la salud",Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                }




                break;
        }
    }
}
