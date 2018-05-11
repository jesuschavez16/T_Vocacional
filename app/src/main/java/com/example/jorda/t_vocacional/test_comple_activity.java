package com.example.jorda.t_vocacional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class test_comple_activity extends AppCompatActivity implements View.OnClickListener {
    RadioButton rb0, rb1, rb2, rb3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_comple);
        btn = (Button) findViewById(R.id.enviar_comp);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enviar_comp:
                int Res1 = 0, Res2 = 0, Res3 = 0, Res4 = 0, Res5 = 0, Res6 = 0, Res7 = 0, Res8 = 0, Res9 = 0, Res10 = 0, Res11 = 0, Res12 = 0, Res13 = 0, Res14 = 0, Res15 = 0;
                int R1 = 0, R2 = 0, R3 = 0, R4 = 0, R5 = 0, R6 = 0, R7 = 0, R8 = 0, R9 = 0, R10 = 0, R11 = 0, R12 = 0, R13 = 0, R14 = 0, R15 = 0, R16 = 0, R17 = 0, R18 = 0, R19 = 0, R20 = 0, R21 = 0, R22 = 0, R23 = 0, R24 = 0, R25 = 0, R26 = 0, R27 = 0, R28 = 0, R29 = 0, R30 = 0, R31 = 0, R32 = 0, R33 = 0, R34 = 0, R35 = 0, R36 = 0, R37 = 0, R38 = 0, R39 = 0, R40 = 0, R41 = 0, R42 = 0, R43 = 0, R44 = 0, R45 = 0, R46 = 0, R47 = 0, R48 = 0, R49 = 0, R50 = 0, R51 = 0, R52 = 0, R53 = 0, R54 = 0, R55 = 0, R56 = 0, R57 = 0, R58 = 0, R59 = 0, R60 = 0, R61 = 0, R62 = 0, R63 = 0, R64 = 0, R65 = 0, R66 = 0, R67 = 0, R68 = 0, R69 = 0, R70 = 0, R71 = 0, R72 = 0, R73 = 0, R74 = 0, R75 = 0, R76 = 0, R77 = 0, R78 = 0, R79 = 0, R80 = 0, R81 = 0, R82 = 0, R83 = 0, R84 = 0, R85 = 0, R86 = 0, R87 = 0, R88 = 0, R89 = 0, R90 = 0, R91 = 0, R92 = 0, R93 = 0, R94 = 0, R95 = 0, R96 = 0, R97 = 0, R98 = 0, R99 = 0, R100 = 0, R101 = 0, R102 = 0, R103 = 0, R104 = 0, R105 = 0, R106 = 0, R107 = 0, R108 = 0, R109 = 0, R110 = 0, R111 = 0, R112 = 0, R113 = 0, R114 = 0, R115 = 0, R116 = 0, R117 = 0, R118 = 0, R119 = 0, R120 = 0, R121 = 0, R122 = 0, R123 = 0, R124 = 0, R125 = 0, R126 = 0, R127 = 0, R128 = 0, R129 = 0, R130 = 0, R131 = 0, R132 = 0, R133 = 0, R134 = 0, R135 = 0, R136 = 0, R137 = 0, R138 = 0, R139 = 0, R140 = 0, R141 = 0, R142 = 0, R143 = 0, R144 = 0, R145 = 0, R146 = 0, R147 = 0, R148 = 0, R149 = 0, R150 = 0, R151 = 0, R152 = 0, R153 = 0, R154 = 0, R155 = 0, R156 = 0, R157 = 0, R158 = 0, R159 = 0, R160 = 0, R161 = 0, R162 = 0, R163 = 0, R164 = 0, R165 = 0, R166 = 0, R167 = 0, R168 = 0, R169 = 0, R170 = 0, R171 = 0, R172 = 0, R173 = 0, R174 = 0, R175 = 0, R176 = 0, R177 = 0, R178 = 0, R179 = 0, R180 = 0;

                //1 INICIO
                rb0 = findViewById(R.id.RB1_0);
                rb1 = findViewById(R.id.RB1_1);
                rb2 = findViewById(R.id.RB1_2);
                rb3 = findViewById(R.id.RB1_3);
                if (rb0.isChecked()) {
                    R1 = 0;
                }
                if (rb1.isChecked()) {
                    R1 = 1;
                }
                if (rb2.isChecked()) {
                    R1 = 2;
                }
                if (rb3.isChecked()) {
                    R1 = 3;
                }
                //1 FIN

                //Prueba
                rb0 = findViewById(R.id.RB2_0);
                rb1 = findViewById(R.id.RB2_1);
                rb2 = findViewById(R.id.RB2_2);
                rb3 = findViewById(R.id.RB2_3);
                if (rb0.isChecked()) {
                    R2 = 0;
                }
                if (rb1.isChecked()) {
                    R2 = 1;
                }
                if (rb2.isChecked()) {
                    R2 = 2;
                }
                if (rb3.isChecked()) {
                    R2 = 3;
                }
                rb0 = findViewById(R.id.RB3_0);
                rb1 = findViewById(R.id.RB3_1);
                rb2 = findViewById(R.id.RB3_2);
                rb3 = findViewById(R.id.RB3_3);
                if (rb0.isChecked()) {
                    R3 = 0;
                }
                if (rb1.isChecked()) {
                    R3 = 1;
                }
                if (rb2.isChecked()) {
                    R3 = 2;
                }
                if (rb3.isChecked()) {
                    R3 = 3;
                }
                rb0 = findViewById(R.id.RB4_0);
                rb1 = findViewById(R.id.RB4_1);
                rb2 = findViewById(R.id.RB4_2);
                rb3 = findViewById(R.id.RB4_3);
                if (rb0.isChecked()) {
                    R4 = 0;
                }
                if (rb1.isChecked()) {
                    R4 = 1;
                }
                if (rb2.isChecked()) {
                    R4 = 2;
                }
                if (rb3.isChecked()) {
                    R4 = 3;
                }
                rb0 = findViewById(R.id.RB5_0);
                rb1 = findViewById(R.id.RB5_1);
                rb2 = findViewById(R.id.RB5_2);
                rb3 = findViewById(R.id.RB5_3);
                if (rb0.isChecked()) {
                    R5 = 0;
                }
                if (rb1.isChecked()) {
                    R5 = 1;
                }
                if (rb2.isChecked()) {
                    R5 = 2;
                }
                if (rb3.isChecked()) {
                    R5 = 3;
                }
                rb0 = findViewById(R.id.RB6_0);
                rb1 = findViewById(R.id.RB6_1);
                rb2 = findViewById(R.id.RB6_2);
                rb3 = findViewById(R.id.RB6_3);
                if (rb0.isChecked()) {
                    R6 = 0;
                }
                if (rb1.isChecked()) {
                    R6 = 1;
                }
                if (rb2.isChecked()) {
                    R6 = 2;
                }
                if (rb3.isChecked()) {
                    R6 = 3;
                }
                rb0 = findViewById(R.id.RB7_0);
                rb1 = findViewById(R.id.RB7_1);
                rb2 = findViewById(R.id.RB7_2);
                rb3 = findViewById(R.id.RB7_3);
                if (rb0.isChecked()) {
                    R7 = 0;
                }
                if (rb1.isChecked()) {
                    R7 = 1;
                }
                if (rb2.isChecked()) {
                    R7 = 2;
                }
                if (rb3.isChecked()) {
                    R7 = 3;
                }
                rb0 = findViewById(R.id.RB8_0);
                rb1 = findViewById(R.id.RB8_1);
                rb2 = findViewById(R.id.RB8_2);
                rb3 = findViewById(R.id.RB8_3);
                if (rb0.isChecked()) {
                    R8 = 0;
                }
                if (rb1.isChecked()) {
                    R8 = 1;
                }
                if (rb2.isChecked()) {
                    R8 = 2;
                }
                if (rb3.isChecked()) {
                    R8 = 3;
                }
                rb0 = findViewById(R.id.RB9_0);
                rb1 = findViewById(R.id.RB9_1);
                rb2 = findViewById(R.id.RB9_2);
                rb3 = findViewById(R.id.RB9_3);
                if (rb0.isChecked()) {
                    R9 = 0;
                }
                if (rb1.isChecked()) {
                    R9 = 1;
                }
                if (rb2.isChecked()) {
                    R9 = 2;
                }
                if (rb3.isChecked()) {
                    R9 = 3;
                }
                rb0 = findViewById(R.id.RB10_0);
                rb1 = findViewById(R.id.RB10_1);
                rb2 = findViewById(R.id.RB10_2);
                rb3 = findViewById(R.id.RB10_3);
                if (rb0.isChecked()) {
                    R10 = 0;
                }
                if (rb1.isChecked()) {
                    R10 = 1;
                }
                if (rb2.isChecked()) {
                    R10 = 2;
                }
                if (rb3.isChecked()) {
                    R10 = 3;
                }
                rb0 = findViewById(R.id.RB11_0);
                rb1 = findViewById(R.id.RB11_1);
                rb2 = findViewById(R.id.RB11_2);
                rb3 = findViewById(R.id.RB11_3);
                if (rb0.isChecked()) {
                    R11 = 0;
                }
                if (rb1.isChecked()) {
                    R11 = 1;
                }
                if (rb2.isChecked()) {
                    R11 = 2;
                }
                if (rb3.isChecked()) {
                    R11 = 3;
                }
                rb0 = findViewById(R.id.RB12_0);
                rb1 = findViewById(R.id.RB12_1);
                rb2 = findViewById(R.id.RB12_2);
                rb3 = findViewById(R.id.RB12_3);
                if (rb0.isChecked()) {
                    R12 = 0;
                }
                if (rb1.isChecked()) {
                    R12 = 1;
                }
                if (rb2.isChecked()) {
                    R12 = 2;
                }
                if (rb3.isChecked()) {
                    R12 = 3;
                }
                rb0 = findViewById(R.id.RB13_0);
                rb1 = findViewById(R.id.RB13_1);
                rb2 = findViewById(R.id.RB13_2);
                rb3 = findViewById(R.id.RB13_3);
                if (rb0.isChecked()) {
                    R13 = 0;
                }
                if (rb1.isChecked()) {
                    R13 = 1;
                }
                if (rb2.isChecked()) {
                    R13 = 2;
                }
                if (rb3.isChecked()) {
                    R13 = 3;
                }
                rb0 = findViewById(R.id.RB14_0);
                rb1 = findViewById(R.id.RB14_1);
                rb2 = findViewById(R.id.RB14_2);
                rb3 = findViewById(R.id.RB14_3);
                if (rb0.isChecked()) {
                    R14 = 0;
                }
                if (rb1.isChecked()) {
                    R14 = 1;
                }
                if (rb2.isChecked()) {
                    R14 = 2;
                }
                if (rb3.isChecked()) {
                    R14 = 3;
                }
                rb0 = findViewById(R.id.RB15_0);
                rb1 = findViewById(R.id.RB15_1);
                rb2 = findViewById(R.id.RB15_2);
                rb3 = findViewById(R.id.RB15_3);
                if (rb0.isChecked()) {
                    R15 = 0;
                }
                if (rb1.isChecked()) {
                    R15 = 1;
                }
                if (rb2.isChecked()) {
                    R15 = 2;
                }
                if (rb3.isChecked()) {
                    R15 = 3;
                }
                rb0 = findViewById(R.id.RB16_0);
                rb1 = findViewById(R.id.RB16_1);
                rb2 = findViewById(R.id.RB16_2);
                rb3 = findViewById(R.id.RB16_3);
                if (rb0.isChecked()) {
                    R16 = 0;
                }
                if (rb1.isChecked()) {
                    R16 = 1;
                }
                if (rb2.isChecked()) {
                    R16 = 2;
                }
                if (rb3.isChecked()) {
                    R16 = 3;
                }
                rb0 = findViewById(R.id.RB17_0);
                rb1 = findViewById(R.id.RB17_1);
                rb2 = findViewById(R.id.RB17_2);
                rb3 = findViewById(R.id.RB17_3);
                if (rb0.isChecked()) {
                    R17 = 0;
                }
                if (rb1.isChecked()) {
                    R17 = 1;
                }
                if (rb2.isChecked()) {
                    R17 = 2;
                }
                if (rb3.isChecked()) {
                    R17 = 3;
                }
                rb0 = findViewById(R.id.RB18_0);
                rb1 = findViewById(R.id.RB18_1);
                rb2 = findViewById(R.id.RB18_2);
                rb3 = findViewById(R.id.RB18_3);
                if (rb0.isChecked()) {
                    R18 = 0;
                }
                if (rb1.isChecked()) {
                    R18 = 1;
                }
                if (rb2.isChecked()) {
                    R18 = 2;
                }
                if (rb3.isChecked()) {
                    R18 = 3;
                }
                rb0 = findViewById(R.id.RB19_0);
                rb1 = findViewById(R.id.RB19_1);
                rb2 = findViewById(R.id.RB19_2);
                rb3 = findViewById(R.id.RB19_3);
                if (rb0.isChecked()) {
                    R19 = 0;
                }
                if (rb1.isChecked()) {
                    R19 = 1;
                }
                if (rb2.isChecked()) {
                    R19 = 2;
                }
                if (rb3.isChecked()) {
                    R19 = 3;
                }
                rb0 = findViewById(R.id.RB20_0);
                rb1 = findViewById(R.id.RB20_1);
                rb2 = findViewById(R.id.RB20_2);
                rb3 = findViewById(R.id.RB20_3);
                if (rb0.isChecked()) {
                    R20 = 0;
                }
                if (rb1.isChecked()) {
                    R20 = 1;
                }
                if (rb2.isChecked()) {
                    R20 = 2;
                }
                if (rb3.isChecked()) {
                    R20 = 3;
                }
                rb0 = findViewById(R.id.RB21_0);
                rb1 = findViewById(R.id.RB21_1);
                rb2 = findViewById(R.id.RB21_2);
                rb3 = findViewById(R.id.RB21_3);
                if (rb0.isChecked()) {
                    R21 = 0;
                }
                if (rb1.isChecked()) {
                    R21 = 1;
                }
                if (rb2.isChecked()) {
                    R21 = 2;
                }
                if (rb3.isChecked()) {
                    R21 = 3;
                }
                rb0 = findViewById(R.id.RB22_0);
                rb1 = findViewById(R.id.RB22_1);
                rb2 = findViewById(R.id.RB22_2);
                rb3 = findViewById(R.id.RB22_3);
                if (rb0.isChecked()) {
                    R22 = 0;
                }
                if (rb1.isChecked()) {
                    R22 = 1;
                }
                if (rb2.isChecked()) {
                    R22 = 2;
                }
                if (rb3.isChecked()) {
                    R22 = 3;
                }
                rb0 = findViewById(R.id.RB23_0);
                rb1 = findViewById(R.id.RB23_1);
                rb2 = findViewById(R.id.RB23_2);
                rb3 = findViewById(R.id.RB23_3);
                if (rb0.isChecked()) {
                    R23 = 0;
                }
                if (rb1.isChecked()) {
                    R23 = 1;
                }
                if (rb2.isChecked()) {
                    R23 = 2;
                }
                if (rb3.isChecked()) {
                    R23 = 3;
                }
                rb0 = findViewById(R.id.RB24_0);
                rb1 = findViewById(R.id.RB24_1);
                rb2 = findViewById(R.id.RB24_2);
                rb3 = findViewById(R.id.RB24_3);
                if (rb0.isChecked()) {
                    R24 = 0;
                }
                if (rb1.isChecked()) {
                    R24 = 1;
                }
                if (rb2.isChecked()) {
                    R24 = 2;
                }
                if (rb3.isChecked()) {
                    R24 = 3;
                }
                rb0 = findViewById(R.id.RB25_0);
                rb1 = findViewById(R.id.RB25_1);
                rb2 = findViewById(R.id.RB25_2);
                rb3 = findViewById(R.id.RB25_3);
                if (rb0.isChecked()) {
                    R25 = 0;
                }
                if (rb1.isChecked()) {
                    R25 = 1;
                }
                if (rb2.isChecked()) {
                    R25 = 2;
                }
                if (rb3.isChecked()) {
                    R25 = 3;
                }
                rb0 = findViewById(R.id.RB26_0);
                rb1 = findViewById(R.id.RB26_1);
                rb2 = findViewById(R.id.RB26_2);
                rb3 = findViewById(R.id.RB26_3);
                if (rb0.isChecked()) {
                    R26 = 0;
                }
                if (rb1.isChecked()) {
                    R26 = 1;
                }
                if (rb2.isChecked()) {
                    R26 = 2;
                }
                if (rb3.isChecked()) {
                    R26 = 3;
                }
                rb0 = findViewById(R.id.RB27_0);
                rb1 = findViewById(R.id.RB27_1);
                rb2 = findViewById(R.id.RB27_2);
                rb3 = findViewById(R.id.RB27_3);
                if (rb0.isChecked()) {
                    R27 = 0;
                }
                if (rb1.isChecked()) {
                    R27 = 1;
                }
                if (rb2.isChecked()) {
                    R27 = 2;
                }
                if (rb3.isChecked()) {
                    R27 = 3;
                }
                rb0 = findViewById(R.id.RB28_0);
                rb1 = findViewById(R.id.RB28_1);
                rb2 = findViewById(R.id.RB28_2);
                rb3 = findViewById(R.id.RB28_3);
                if (rb0.isChecked()) {
                    R28 = 0;
                }
                if (rb1.isChecked()) {
                    R28 = 1;
                }
                if (rb2.isChecked()) {
                    R28 = 2;
                }
                if (rb3.isChecked()) {
                    R28 = 3;
                }
                rb0 = findViewById(R.id.RB29_0);
                rb1 = findViewById(R.id.RB29_1);
                rb2 = findViewById(R.id.RB29_2);
                rb3 = findViewById(R.id.RB29_3);
                if (rb0.isChecked()) {
                    R29 = 0;
                }
                if (rb1.isChecked()) {
                    R29 = 1;
                }
                if (rb2.isChecked()) {
                    R29 = 2;
                }
                if (rb3.isChecked()) {
                    R29 = 3;
                }
                rb0 = findViewById(R.id.RB30_0);
                rb1 = findViewById(R.id.RB30_1);
                rb2 = findViewById(R.id.RB30_2);
                rb3 = findViewById(R.id.RB30_3);
                if (rb0.isChecked()) {
                    R30 = 0;
                }
                if (rb1.isChecked()) {
                    R30 = 1;
                }
                if (rb2.isChecked()) {
                    R30 = 2;
                }
                if (rb3.isChecked()) {
                    R30 = 3;
                }
                rb0 = findViewById(R.id.RB31_0);
                rb1 = findViewById(R.id.RB31_1);
                rb2 = findViewById(R.id.RB31_2);
                rb3 = findViewById(R.id.RB31_3);
                if (rb0.isChecked()) {
                    R31 = 0;
                }
                if (rb1.isChecked()) {
                    R31 = 1;
                }
                if (rb2.isChecked()) {
                    R31 = 2;
                }
                if (rb3.isChecked()) {
                    R31 = 3;
                }
                rb0 = findViewById(R.id.RB32_0);
                rb1 = findViewById(R.id.RB32_1);
                rb2 = findViewById(R.id.RB32_2);
                rb3 = findViewById(R.id.RB32_3);
                if (rb0.isChecked()) {
                    R32 = 0;
                }
                if (rb1.isChecked()) {
                    R32 = 1;
                }
                if (rb2.isChecked()) {
                    R32 = 2;
                }
                if (rb3.isChecked()) {
                    R32 = 3;
                }
                rb0 = findViewById(R.id.RB33_0);
                rb1 = findViewById(R.id.RB33_1);
                rb2 = findViewById(R.id.RB33_2);
                rb3 = findViewById(R.id.RB33_3);
                if (rb0.isChecked()) {
                    R33 = 0;
                }
                if (rb1.isChecked()) {
                    R33 = 1;
                }
                if (rb2.isChecked()) {
                    R33 = 2;
                }
                if (rb3.isChecked()) {
                    R33 = 3;
                }
                rb0 = findViewById(R.id.RB34_0);
                rb1 = findViewById(R.id.RB34_1);
                rb2 = findViewById(R.id.RB34_2);
                rb3 = findViewById(R.id.RB34_3);
                if (rb0.isChecked()) {
                    R34 = 0;
                }
                if (rb1.isChecked()) {
                    R34 = 1;
                }
                if (rb2.isChecked()) {
                    R34 = 2;
                }
                if (rb3.isChecked()) {
                    R34 = 3;
                }
                rb0 = findViewById(R.id.RB35_0);
                rb1 = findViewById(R.id.RB35_1);
                rb2 = findViewById(R.id.RB35_2);
                rb3 = findViewById(R.id.RB35_3);
                if (rb0.isChecked()) {
                    R35 = 0;
                }
                if (rb1.isChecked()) {
                    R35 = 1;
                }
                if (rb2.isChecked()) {
                    R35 = 2;
                }
                if (rb3.isChecked()) {
                    R35 = 3;
                }
                rb0 = findViewById(R.id.RB36_0);
                rb1 = findViewById(R.id.RB36_1);
                rb2 = findViewById(R.id.RB36_2);
                rb3 = findViewById(R.id.RB36_3);
                if (rb0.isChecked()) {
                    R36 = 0;
                }
                if (rb1.isChecked()) {
                    R36 = 1;
                }
                if (rb2.isChecked()) {
                    R36 = 2;
                }
                if (rb3.isChecked()) {
                    R36 = 3;
                }
                rb0 = findViewById(R.id.RB37_0);
                rb1 = findViewById(R.id.RB37_1);
                rb2 = findViewById(R.id.RB37_2);
                rb3 = findViewById(R.id.RB37_3);
                if (rb0.isChecked()) {
                    R37 = 0;
                }
                if (rb1.isChecked()) {
                    R37 = 1;
                }
                if (rb2.isChecked()) {
                    R37 = 2;
                }
                if (rb3.isChecked()) {
                    R37 = 3;
                }
                rb0 = findViewById(R.id.RB38_0);
                rb1 = findViewById(R.id.RB38_1);
                rb2 = findViewById(R.id.RB38_2);
                rb3 = findViewById(R.id.RB38_3);
                if (rb0.isChecked()) {
                    R38 = 0;
                }
                if (rb1.isChecked()) {
                    R38 = 1;
                }
                if (rb2.isChecked()) {
                    R38 = 2;
                }
                if (rb3.isChecked()) {
                    R38 = 3;
                }
                rb0 = findViewById(R.id.RB39_0);
                rb1 = findViewById(R.id.RB39_1);
                rb2 = findViewById(R.id.RB39_2);
                rb3 = findViewById(R.id.RB39_3);
                if (rb0.isChecked()) {
                    R39 = 0;
                }
                if (rb1.isChecked()) {
                    R39 = 1;
                }
                if (rb2.isChecked()) {
                    R39 = 2;
                }
                if (rb3.isChecked()) {
                    R39 = 3;
                }
                rb0 = findViewById(R.id.RB40_0);
                rb1 = findViewById(R.id.RB40_1);
                rb2 = findViewById(R.id.RB40_2);
                rb3 = findViewById(R.id.RB40_3);
                if (rb0.isChecked()) {
                    R40 = 0;
                }
                if (rb1.isChecked()) {
                    R40 = 1;
                }
                if (rb2.isChecked()) {
                    R40 = 2;
                }
                if (rb3.isChecked()) {
                    R40 = 3;
                }
                rb0 = findViewById(R.id.RB41_0);
                rb1 = findViewById(R.id.RB41_1);
                rb2 = findViewById(R.id.RB41_2);
                rb3 = findViewById(R.id.RB41_3);
                if (rb0.isChecked()) {
                    R41 = 0;
                }
                if (rb1.isChecked()) {
                    R41 = 1;
                }
                if (rb2.isChecked()) {
                    R41 = 2;
                }
                if (rb3.isChecked()) {
                    R41 = 3;
                }
                rb0 = findViewById(R.id.RB42_0);
                rb1 = findViewById(R.id.RB42_1);
                rb2 = findViewById(R.id.RB42_2);
                rb3 = findViewById(R.id.RB42_3);
                if (rb0.isChecked()) {
                    R42 = 0;
                }
                if (rb1.isChecked()) {
                    R42 = 1;
                }
                if (rb2.isChecked()) {
                    R42 = 2;
                }
                if (rb3.isChecked()) {
                    R42 = 3;
                }
                rb0 = findViewById(R.id.RB43_0);
                rb1 = findViewById(R.id.RB43_1);
                rb2 = findViewById(R.id.RB43_2);
                rb3 = findViewById(R.id.RB43_3);
                if (rb0.isChecked()) {
                    R43 = 0;
                }
                if (rb1.isChecked()) {
                    R43 = 1;
                }
                if (rb2.isChecked()) {
                    R43 = 2;
                }
                if (rb3.isChecked()) {
                    R43 = 3;
                }
                rb0 = findViewById(R.id.RB44_0);
                rb1 = findViewById(R.id.RB44_1);
                rb2 = findViewById(R.id.RB44_2);
                rb3 = findViewById(R.id.RB44_3);
                if (rb0.isChecked()) {
                    R44 = 0;
                }
                if (rb1.isChecked()) {
                    R44 = 1;
                }
                if (rb2.isChecked()) {
                    R44 = 2;
                }
                if (rb3.isChecked()) {
                    R44 = 3;
                }
                rb0 = findViewById(R.id.RB45_0);
                rb1 = findViewById(R.id.RB45_1);
                rb2 = findViewById(R.id.RB45_2);
                rb3 = findViewById(R.id.RB45_3);
                if (rb0.isChecked()) {
                    R45 = 0;
                }
                if (rb1.isChecked()) {
                    R45 = 1;
                }
                if (rb2.isChecked()) {
                    R45 = 2;
                }
                if (rb3.isChecked()) {
                    R45 = 3;
                }
                rb0 = findViewById(R.id.RB46_0);
                rb1 = findViewById(R.id.RB46_1);
                rb2 = findViewById(R.id.RB46_2);
                rb3 = findViewById(R.id.RB46_3);
                if (rb0.isChecked()) {
                    R46 = 0;
                }
                if (rb1.isChecked()) {
                    R46 = 1;
                }
                if (rb2.isChecked()) {
                    R46 = 2;
                }
                if (rb3.isChecked()) {
                    R46 = 3;
                }
                rb0 = findViewById(R.id.RB47_0);
                rb1 = findViewById(R.id.RB47_1);
                rb2 = findViewById(R.id.RB47_2);
                rb3 = findViewById(R.id.RB47_3);
                if (rb0.isChecked()) {
                    R47 = 0;
                }
                if (rb1.isChecked()) {
                    R47 = 1;
                }
                if (rb2.isChecked()) {
                    R47 = 2;
                }
                if (rb3.isChecked()) {
                    R47 = 3;
                }
                rb0 = findViewById(R.id.RB48_0);
                rb1 = findViewById(R.id.RB48_1);
                rb2 = findViewById(R.id.RB48_2);
                rb3 = findViewById(R.id.RB48_3);
                if (rb0.isChecked()) {
                    R48 = 0;
                }
                if (rb1.isChecked()) {
                    R48 = 1;
                }
                if (rb2.isChecked()) {
                    R48 = 2;
                }
                if (rb3.isChecked()) {
                    R48 = 3;
                }
                rb0 = findViewById(R.id.RB49_0);
                rb1 = findViewById(R.id.RB49_1);
                rb2 = findViewById(R.id.RB49_2);
                rb3 = findViewById(R.id.RB49_3);
                if (rb0.isChecked()) {
                    R49 = 0;
                }
                if (rb1.isChecked()) {
                    R49 = 1;
                }
                if (rb2.isChecked()) {
                    R49 = 2;
                }
                if (rb3.isChecked()) {
                    R49 = 3;
                }
                rb0 = findViewById(R.id.RB50_0);
                rb1 = findViewById(R.id.RB50_1);
                rb2 = findViewById(R.id.RB50_2);
                rb3 = findViewById(R.id.RB50_3);
                if (rb0.isChecked()) {
                    R50 = 0;
                }
                if (rb1.isChecked()) {
                    R50 = 1;
                }
                if (rb2.isChecked()) {
                    R50 = 2;
                }
                if (rb3.isChecked()) {
                    R50 = 3;
                }
                rb0 = findViewById(R.id.RB51_0);
                rb1 = findViewById(R.id.RB51_1);
                rb2 = findViewById(R.id.RB51_2);
                rb3 = findViewById(R.id.RB51_3);
                if (rb0.isChecked()) {
                    R51 = 0;
                }
                if (rb1.isChecked()) {
                    R51 = 1;
                }
                if (rb2.isChecked()) {
                    R51 = 2;
                }
                if (rb3.isChecked()) {
                    R51 = 3;
                }
                rb0 = findViewById(R.id.RB52_0);
                rb1 = findViewById(R.id.RB52_1);
                rb2 = findViewById(R.id.RB52_2);
                rb3 = findViewById(R.id.RB52_3);
                if (rb0.isChecked()) {
                    R52 = 0;
                }
                if (rb1.isChecked()) {
                    R52 = 1;
                }
                if (rb2.isChecked()) {
                    R52 = 2;
                }
                if (rb3.isChecked()) {
                    R52 = 3;
                }
                rb0 = findViewById(R.id.RB53_0);
                rb1 = findViewById(R.id.RB53_1);
                rb2 = findViewById(R.id.RB53_2);
                rb3 = findViewById(R.id.RB53_3);
                if (rb0.isChecked()) {
                    R53 = 0;
                }
                if (rb1.isChecked()) {
                    R53 = 1;
                }
                if (rb2.isChecked()) {
                    R53 = 2;
                }
                if (rb3.isChecked()) {
                    R53 = 3;
                }
                rb0 = findViewById(R.id.RB54_0);
                rb1 = findViewById(R.id.RB54_1);
                rb2 = findViewById(R.id.RB54_2);
                rb3 = findViewById(R.id.RB54_3);
                if (rb0.isChecked()) {
                    R54 = 0;
                }
                if (rb1.isChecked()) {
                    R54 = 1;
                }
                if (rb2.isChecked()) {
                    R54 = 2;
                }
                if (rb3.isChecked()) {
                    R54 = 3;
                }
                rb0 = findViewById(R.id.RB55_0);
                rb1 = findViewById(R.id.RB55_1);
                rb2 = findViewById(R.id.RB55_2);
                rb3 = findViewById(R.id.RB55_3);
                if (rb0.isChecked()) {
                    R55 = 0;
                }
                if (rb1.isChecked()) {
                    R55 = 1;
                }
                if (rb2.isChecked()) {
                    R55 = 2;
                }
                if (rb3.isChecked()) {
                    R55 = 3;
                }
                rb0 = findViewById(R.id.RB56_0);
                rb1 = findViewById(R.id.RB56_1);
                rb2 = findViewById(R.id.RB56_2);
                rb3 = findViewById(R.id.RB56_3);
                if (rb0.isChecked()) {
                    R56 = 0;
                }
                if (rb1.isChecked()) {
                    R56 = 1;
                }
                if (rb2.isChecked()) {
                    R56 = 2;
                }
                if (rb3.isChecked()) {
                    R56 = 3;
                }
                rb0 = findViewById(R.id.RB57_0);
                rb1 = findViewById(R.id.RB57_1);
                rb2 = findViewById(R.id.RB57_2);
                rb3 = findViewById(R.id.RB57_3);
                if (rb0.isChecked()) {
                    R57 = 0;
                }
                if (rb1.isChecked()) {
                    R57 = 1;
                }
                if (rb2.isChecked()) {
                    R57 = 2;
                }
                if (rb3.isChecked()) {
                    R57 = 3;
                }
                rb0 = findViewById(R.id.RB58_0);
                rb1 = findViewById(R.id.RB58_1);
                rb2 = findViewById(R.id.RB58_2);
                rb3 = findViewById(R.id.RB58_3);
                if (rb0.isChecked()) {
                    R58 = 0;
                }
                if (rb1.isChecked()) {
                    R58 = 1;
                }
                if (rb2.isChecked()) {
                    R58 = 2;
                }
                if (rb3.isChecked()) {
                    R58 = 3;
                }
                rb0 = findViewById(R.id.RB59_0);
                rb1 = findViewById(R.id.RB59_1);
                rb2 = findViewById(R.id.RB59_2);
                rb3 = findViewById(R.id.RB59_3);
                if (rb0.isChecked()) {
                    R59 = 0;
                }
                if (rb1.isChecked()) {
                    R59 = 1;
                }
                if (rb2.isChecked()) {
                    R59 = 2;
                }
                if (rb3.isChecked()) {
                    R59 = 3;
                }
                rb0 = findViewById(R.id.RB60_0);
                rb1 = findViewById(R.id.RB60_1);
                rb2 = findViewById(R.id.RB60_2);
                rb3 = findViewById(R.id.RB60_3);
                if (rb0.isChecked()) {
                    R60 = 0;
                }
                if (rb1.isChecked()) {
                    R60 = 1;
                }
                if (rb2.isChecked()) {
                    R60 = 2;
                }
                if (rb3.isChecked()) {
                    R60 = 3;
                }
                rb0 = findViewById(R.id.RB61_0);
                rb1 = findViewById(R.id.RB61_1);
                rb2 = findViewById(R.id.RB61_2);
                rb3 = findViewById(R.id.RB61_3);
                if (rb0.isChecked()) {
                    R61 = 0;
                }
                if (rb1.isChecked()) {
                    R61 = 1;
                }
                if (rb2.isChecked()) {
                    R61 = 2;
                }
                if (rb3.isChecked()) {
                    R61 = 3;
                }
                rb0 = findViewById(R.id.RB62_0);
                rb1 = findViewById(R.id.RB62_1);
                rb2 = findViewById(R.id.RB62_2);
                rb3 = findViewById(R.id.RB62_3);
                if (rb0.isChecked()) {
                    R62 = 0;
                }
                if (rb1.isChecked()) {
                    R62 = 1;
                }
                if (rb2.isChecked()) {
                    R62 = 2;
                }
                if (rb3.isChecked()) {
                    R62 = 3;
                }
                rb0 = findViewById(R.id.RB63_0);
                rb1 = findViewById(R.id.RB63_1);
                rb2 = findViewById(R.id.RB63_2);
                rb3 = findViewById(R.id.RB63_3);
                if (rb0.isChecked()) {
                    R63 = 0;
                }
                if (rb1.isChecked()) {
                    R63 = 1;
                }
                if (rb2.isChecked()) {
                    R63 = 2;
                }
                if (rb3.isChecked()) {
                    R63 = 3;
                }
                rb0 = findViewById(R.id.RB64_0);
                rb1 = findViewById(R.id.RB64_1);
                rb2 = findViewById(R.id.RB64_2);
                rb3 = findViewById(R.id.RB64_3);
                if (rb0.isChecked()) {
                    R64 = 0;
                }
                if (rb1.isChecked()) {
                    R64 = 1;
                }
                if (rb2.isChecked()) {
                    R64 = 2;
                }
                if (rb3.isChecked()) {
                    R64 = 3;
                }
                rb0 = findViewById(R.id.RB65_0);
                rb1 = findViewById(R.id.RB65_1);
                rb2 = findViewById(R.id.RB65_2);
                rb3 = findViewById(R.id.RB65_3);
                if (rb0.isChecked()) {
                    R65 = 0;
                }
                if (rb1.isChecked()) {
                    R65 = 1;
                }
                if (rb2.isChecked()) {
                    R65 = 2;
                }
                if (rb3.isChecked()) {
                    R65 = 3;
                }
                rb0 = findViewById(R.id.RB66_0);
                rb1 = findViewById(R.id.RB66_1);
                rb2 = findViewById(R.id.RB66_2);
                rb3 = findViewById(R.id.RB66_3);
                if (rb0.isChecked()) {
                    R66 = 0;
                }
                if (rb1.isChecked()) {
                    R66 = 1;
                }
                if (rb2.isChecked()) {
                    R66 = 2;
                }
                if (rb3.isChecked()) {
                    R66 = 3;
                }
                rb0 = findViewById(R.id.RB67_0);
                rb1 = findViewById(R.id.RB67_1);
                rb2 = findViewById(R.id.RB67_2);
                rb3 = findViewById(R.id.RB67_3);
                if (rb0.isChecked()) {
                    R67 = 0;
                }
                if (rb1.isChecked()) {
                    R67 = 1;
                }
                if (rb2.isChecked()) {
                    R67 = 2;
                }
                if (rb3.isChecked()) {
                    R67 = 3;
                }
                rb0 = findViewById(R.id.RB68_0);
                rb1 = findViewById(R.id.RB68_1);
                rb2 = findViewById(R.id.RB68_2);
                rb3 = findViewById(R.id.RB68_3);
                if (rb0.isChecked()) {
                    R68 = 0;
                }
                if (rb1.isChecked()) {
                    R68 = 1;
                }
                if (rb2.isChecked()) {
                    R68 = 2;
                }
                if (rb3.isChecked()) {
                    R68 = 3;
                }
                rb0 = findViewById(R.id.RB69_0);
                rb1 = findViewById(R.id.RB69_1);
                rb2 = findViewById(R.id.RB69_2);
                rb3 = findViewById(R.id.RB69_3);
                if (rb0.isChecked()) {
                    R69 = 0;
                }
                if (rb1.isChecked()) {
                    R69 = 1;
                }
                if (rb2.isChecked()) {
                    R69 = 2;
                }
                if (rb3.isChecked()) {
                    R69 = 3;
                }
                rb0 = findViewById(R.id.RB70_0);
                rb1 = findViewById(R.id.RB70_1);
                rb2 = findViewById(R.id.RB70_2);
                rb3 = findViewById(R.id.RB70_3);
                if (rb0.isChecked()) {
                    R70 = 0;
                }
                if (rb1.isChecked()) {
                    R70 = 1;
                }
                if (rb2.isChecked()) {
                    R70 = 2;
                }
                if (rb3.isChecked()) {
                    R70 = 3;
                }
                rb0 = findViewById(R.id.RB71_0);
                rb1 = findViewById(R.id.RB71_1);
                rb2 = findViewById(R.id.RB71_2);
                rb3 = findViewById(R.id.RB71_3);
                if (rb0.isChecked()) {
                    R71 = 0;
                }
                if (rb1.isChecked()) {
                    R71 = 1;
                }
                if (rb2.isChecked()) {
                    R71 = 2;
                }
                if (rb3.isChecked()) {
                    R71 = 3;
                }
                rb0 = findViewById(R.id.RB72_0);
                rb1 = findViewById(R.id.RB72_1);
                rb2 = findViewById(R.id.RB72_2);
                rb3 = findViewById(R.id.RB72_3);
                if (rb0.isChecked()) {
                    R72 = 0;
                }
                if (rb1.isChecked()) {
                    R72 = 1;
                }
                if (rb2.isChecked()) {
                    R72 = 2;
                }
                if (rb3.isChecked()) {
                    R72 = 3;
                }
                rb0 = findViewById(R.id.RB73_0);
                rb1 = findViewById(R.id.RB73_1);
                rb2 = findViewById(R.id.RB73_2);
                rb3 = findViewById(R.id.RB73_3);
                if (rb0.isChecked()) {
                    R73 = 0;
                }
                if (rb1.isChecked()) {
                    R73 = 1;
                }
                if (rb2.isChecked()) {
                    R73 = 2;
                }
                if (rb3.isChecked()) {
                    R73 = 3;
                }
                rb0 = findViewById(R.id.RB74_0);
                rb1 = findViewById(R.id.RB74_1);
                rb2 = findViewById(R.id.RB74_2);
                rb3 = findViewById(R.id.RB74_3);
                if (rb0.isChecked()) {
                    R74 = 0;
                }
                if (rb1.isChecked()) {
                    R74 = 1;
                }
                if (rb2.isChecked()) {
                    R74 = 2;
                }
                if (rb3.isChecked()) {
                    R74 = 3;
                }
                rb0 = findViewById(R.id.RB75_0);
                rb1 = findViewById(R.id.RB75_1);
                rb2 = findViewById(R.id.RB75_2);
                rb3 = findViewById(R.id.RB75_3);
                if (rb0.isChecked()) {
                    R75 = 0;
                }
                if (rb1.isChecked()) {
                    R75 = 1;
                }
                if (rb2.isChecked()) {
                    R75 = 2;
                }
                if (rb3.isChecked()) {
                    R75 = 3;
                }
                rb0 = findViewById(R.id.RB76_0);
                rb1 = findViewById(R.id.RB76_1);
                rb2 = findViewById(R.id.RB76_2);
                rb3 = findViewById(R.id.RB76_3);
                if (rb0.isChecked()) {
                    R76 = 0;
                }
                if (rb1.isChecked()) {
                    R76 = 1;
                }
                if (rb2.isChecked()) {
                    R76 = 2;
                }
                if (rb3.isChecked()) {
                    R76 = 3;
                }
                rb0 = findViewById(R.id.RB77_0);
                rb1 = findViewById(R.id.RB77_1);
                rb2 = findViewById(R.id.RB77_2);
                rb3 = findViewById(R.id.RB77_3);
                if (rb0.isChecked()) {
                    R77 = 0;
                }
                if (rb1.isChecked()) {
                    R77 = 1;
                }
                if (rb2.isChecked()) {
                    R77 = 2;
                }
                if (rb3.isChecked()) {
                    R77 = 3;
                }
                rb0 = findViewById(R.id.RB78_0);
                rb1 = findViewById(R.id.RB78_1);
                rb2 = findViewById(R.id.RB78_2);
                rb3 = findViewById(R.id.RB78_3);
                if (rb0.isChecked()) {
                    R78 = 0;
                }
                if (rb1.isChecked()) {
                    R78 = 1;
                }
                if (rb2.isChecked()) {
                    R78 = 2;
                }
                if (rb3.isChecked()) {
                    R78 = 3;
                }
                rb0 = findViewById(R.id.RB79_0);
                rb1 = findViewById(R.id.RB79_1);
                rb2 = findViewById(R.id.RB79_2);
                rb3 = findViewById(R.id.RB79_3);
                if (rb0.isChecked()) {
                    R79 = 0;
                }
                if (rb1.isChecked()) {
                    R79 = 1;
                }
                if (rb2.isChecked()) {
                    R79 = 2;
                }
                if (rb3.isChecked()) {
                    R79 = 3;
                }
                rb0 = findViewById(R.id.RB80_0);
                rb1 = findViewById(R.id.RB80_1);
                rb2 = findViewById(R.id.RB80_2);
                rb3 = findViewById(R.id.RB80_3);
                if (rb0.isChecked()) {
                    R80 = 0;
                }
                if (rb1.isChecked()) {
                    R80 = 1;
                }
                if (rb2.isChecked()) {
                    R80 = 2;
                }
                if (rb3.isChecked()) {
                    R80 = 3;
                }
                rb0 = findViewById(R.id.RB81_0);
                rb1 = findViewById(R.id.RB81_1);
                rb2 = findViewById(R.id.RB81_2);
                rb3 = findViewById(R.id.RB81_3);
                if (rb0.isChecked()) {
                    R81 = 0;
                }
                if (rb1.isChecked()) {
                    R81 = 1;
                }
                if (rb2.isChecked()) {
                    R81 = 2;
                }
                if (rb3.isChecked()) {
                    R81 = 3;
                }
                rb0 = findViewById(R.id.RB82_0);
                rb1 = findViewById(R.id.RB82_1);
                rb2 = findViewById(R.id.RB82_2);
                rb3 = findViewById(R.id.RB82_3);
                if (rb0.isChecked()) {
                    R82 = 0;
                }
                if (rb1.isChecked()) {
                    R82 = 1;
                }
                if (rb2.isChecked()) {
                    R82 = 2;
                }
                if (rb3.isChecked()) {
                    R82 = 3;
                }
                rb0 = findViewById(R.id.RB83_0);
                rb1 = findViewById(R.id.RB83_1);
                rb2 = findViewById(R.id.RB83_2);
                rb3 = findViewById(R.id.RB83_3);
                if (rb0.isChecked()) {
                    R83 = 0;
                }
                if (rb1.isChecked()) {
                    R83 = 1;
                }
                if (rb2.isChecked()) {
                    R83 = 2;
                }
                if (rb3.isChecked()) {
                    R83 = 3;
                }
                rb0 = findViewById(R.id.RB84_0);
                rb1 = findViewById(R.id.RB84_1);
                rb2 = findViewById(R.id.RB84_2);
                rb3 = findViewById(R.id.RB84_3);
                if (rb0.isChecked()) {
                    R84 = 0;
                }
                if (rb1.isChecked()) {
                    R84 = 1;
                }
                if (rb2.isChecked()) {
                    R84 = 2;
                }
                if (rb3.isChecked()) {
                    R84 = 3;
                }
                rb0 = findViewById(R.id.RB85_0);
                rb1 = findViewById(R.id.RB85_1);
                rb2 = findViewById(R.id.RB85_2);
                rb3 = findViewById(R.id.RB85_3);
                if (rb0.isChecked()) {
                    R85 = 0;
                }
                if (rb1.isChecked()) {
                    R85 = 1;
                }
                if (rb2.isChecked()) {
                    R85 = 2;
                }
                if (rb3.isChecked()) {
                    R85 = 3;
                }
                rb0 = findViewById(R.id.RB86_0);
                rb1 = findViewById(R.id.RB86_1);
                rb2 = findViewById(R.id.RB86_2);
                rb3 = findViewById(R.id.RB86_3);
                if (rb0.isChecked()) {
                    R86 = 0;
                }
                if (rb1.isChecked()) {
                    R86 = 1;
                }
                if (rb2.isChecked()) {
                    R86 = 2;
                }
                if (rb3.isChecked()) {
                    R86 = 3;
                }
                rb0 = findViewById(R.id.RB87_0);
                rb1 = findViewById(R.id.RB87_1);
                rb2 = findViewById(R.id.RB87_2);
                rb3 = findViewById(R.id.RB87_3);
                if (rb0.isChecked()) {
                    R87 = 0;
                }
                if (rb1.isChecked()) {
                    R87 = 1;
                }
                if (rb2.isChecked()) {
                    R87 = 2;
                }
                if (rb3.isChecked()) {
                    R87 = 3;
                }
                rb0 = findViewById(R.id.RB88_0);
                rb1 = findViewById(R.id.RB88_1);
                rb2 = findViewById(R.id.RB88_2);
                rb3 = findViewById(R.id.RB88_3);
                if (rb0.isChecked()) {
                    R88 = 0;
                }
                if (rb1.isChecked()) {
                    R88 = 1;
                }
                if (rb2.isChecked()) {
                    R88 = 2;
                }
                if (rb3.isChecked()) {
                    R88 = 3;
                }
                rb0 = findViewById(R.id.RB89_0);
                rb1 = findViewById(R.id.RB89_1);
                rb2 = findViewById(R.id.RB89_2);
                rb3 = findViewById(R.id.RB89_3);
                if (rb0.isChecked()) {
                    R89 = 0;
                }
                if (rb1.isChecked()) {
                    R89 = 1;
                }
                if (rb2.isChecked()) {
                    R89 = 2;
                }
                if (rb3.isChecked()) {
                    R89 = 3;
                }
                rb0 = findViewById(R.id.RB90_0);
                rb1 = findViewById(R.id.RB90_1);
                rb2 = findViewById(R.id.RB90_2);
                rb3 = findViewById(R.id.RB90_3);
                if (rb0.isChecked()) {
                    R90 = 0;
                }
                if (rb1.isChecked()) {
                    R90 = 1;
                }
                if (rb2.isChecked()) {
                    R90 = 2;
                }
                if (rb3.isChecked()) {
                    R90 = 3;
                }
                rb0 = findViewById(R.id.RB91_0);
                rb1 = findViewById(R.id.RB91_1);
                rb2 = findViewById(R.id.RB91_2);
                rb3 = findViewById(R.id.RB91_3);
                if (rb0.isChecked()) {
                    R91 = 0;
                }
                if (rb1.isChecked()) {
                    R91 = 1;
                }
                if (rb2.isChecked()) {
                    R91 = 2;
                }
                if (rb3.isChecked()) {
                    R91 = 3;
                }
                rb0 = findViewById(R.id.RB92_0);
                rb1 = findViewById(R.id.RB92_1);
                rb2 = findViewById(R.id.RB92_2);
                rb3 = findViewById(R.id.RB92_3);
                if (rb0.isChecked()) {
                    R92 = 0;
                }
                if (rb1.isChecked()) {
                    R92 = 1;
                }
                if (rb2.isChecked()) {
                    R92 = 2;
                }
                if (rb3.isChecked()) {
                    R92 = 3;
                }
                rb0 = findViewById(R.id.RB93_0);
                rb1 = findViewById(R.id.RB93_1);
                rb2 = findViewById(R.id.RB93_2);
                rb3 = findViewById(R.id.RB93_3);
                if (rb0.isChecked()) {
                    R93 = 0;
                }
                if (rb1.isChecked()) {
                    R93 = 1;
                }
                if (rb2.isChecked()) {
                    R93 = 2;
                }
                if (rb3.isChecked()) {
                    R93 = 3;
                }
                rb0 = findViewById(R.id.RB94_0);
                rb1 = findViewById(R.id.RB94_1);
                rb2 = findViewById(R.id.RB94_2);
                rb3 = findViewById(R.id.RB94_3);
                if (rb0.isChecked()) {
                    R94 = 0;
                }
                if (rb1.isChecked()) {
                    R94 = 1;
                }
                if (rb2.isChecked()) {
                    R94 = 2;
                }
                if (rb3.isChecked()) {
                    R94 = 3;
                }
                rb0 = findViewById(R.id.RB95_0);
                rb1 = findViewById(R.id.RB95_1);
                rb2 = findViewById(R.id.RB95_2);
                rb3 = findViewById(R.id.RB95_3);
                if (rb0.isChecked()) {
                    R95 = 0;
                }
                if (rb1.isChecked()) {
                    R95 = 1;
                }
                if (rb2.isChecked()) {
                    R95 = 2;
                }
                if (rb3.isChecked()) {
                    R95 = 3;
                }
                rb0 = findViewById(R.id.RB96_0);
                rb1 = findViewById(R.id.RB96_1);
                rb2 = findViewById(R.id.RB96_2);
                rb3 = findViewById(R.id.RB96_3);
                if (rb0.isChecked()) {
                    R96 = 0;
                }
                if (rb1.isChecked()) {
                    R96 = 1;
                }
                if (rb2.isChecked()) {
                    R96 = 2;
                }
                if (rb3.isChecked()) {
                    R96 = 3;
                }
                rb0 = findViewById(R.id.RB97_0);
                rb1 = findViewById(R.id.RB97_1);
                rb2 = findViewById(R.id.RB97_2);
                rb3 = findViewById(R.id.RB97_3);
                if (rb0.isChecked()) {
                    R97 = 0;
                }
                if (rb1.isChecked()) {
                    R97 = 1;
                }
                if (rb2.isChecked()) {
                    R97 = 2;
                }
                if (rb3.isChecked()) {
                    R97 = 3;
                }
                rb0 = findViewById(R.id.RB98_0);
                rb1 = findViewById(R.id.RB98_1);
                rb2 = findViewById(R.id.RB98_2);
                rb3 = findViewById(R.id.RB98_3);
                if (rb0.isChecked()) {
                    R98 = 0;
                }
                if (rb1.isChecked()) {
                    R98 = 1;
                }
                if (rb2.isChecked()) {
                    R98 = 2;
                }
                if (rb3.isChecked()) {
                    R98 = 3;
                }
                rb0 = findViewById(R.id.RB99_0);
                rb1 = findViewById(R.id.RB99_1);
                rb2 = findViewById(R.id.RB99_2);
                rb3 = findViewById(R.id.RB99_3);
                if (rb0.isChecked()) {
                    R99 = 0;
                }
                if (rb1.isChecked()) {
                    R99 = 1;
                }
                if (rb2.isChecked()) {
                    R99 = 2;
                }
                if (rb3.isChecked()) {
                    R99 = 3;
                }
                rb0 = findViewById(R.id.RB100_0);
                rb1 = findViewById(R.id.RB100_1);
                rb2 = findViewById(R.id.RB100_2);
                rb3 = findViewById(R.id.RB100_3);
                if (rb0.isChecked()) {
                    R100 = 0;
                }
                if (rb1.isChecked()) {
                    R100 = 1;
                }
                if (rb2.isChecked()) {
                    R100 = 2;
                }
                if (rb3.isChecked()) {
                    R100 = 3;
                }
                rb0 = findViewById(R.id.RB101_0);
                rb1 = findViewById(R.id.RB101_1);
                rb2 = findViewById(R.id.RB101_2);
                rb3 = findViewById(R.id.RB101_3);
                if (rb0.isChecked()) {
                    R101 = 0;
                }
                if (rb1.isChecked()) {
                    R101 = 1;
                }
                if (rb2.isChecked()) {
                    R101 = 2;
                }
                if (rb3.isChecked()) {
                    R101 = 3;
                }
                rb0 = findViewById(R.id.RB102_0);
                rb1 = findViewById(R.id.RB102_1);
                rb2 = findViewById(R.id.RB102_2);
                rb3 = findViewById(R.id.RB102_3);
                if (rb0.isChecked()) {
                    R102 = 0;
                }
                if (rb1.isChecked()) {
                    R102 = 1;
                }
                if (rb2.isChecked()) {
                    R102 = 2;
                }
                if (rb3.isChecked()) {
                    R102 = 3;
                }
                rb0 = findViewById(R.id.RB103_0);
                rb1 = findViewById(R.id.RB103_1);
                rb2 = findViewById(R.id.RB103_2);
                rb3 = findViewById(R.id.RB103_3);
                if (rb0.isChecked()) {
                    R103 = 0;
                }
                if (rb1.isChecked()) {
                    R103 = 1;
                }
                if (rb2.isChecked()) {
                    R103 = 2;
                }
                if (rb3.isChecked()) {
                    R103 = 3;
                }
                rb0 = findViewById(R.id.RB104_0);
                rb1 = findViewById(R.id.RB104_1);
                rb2 = findViewById(R.id.RB104_2);
                rb3 = findViewById(R.id.RB104_3);
                if (rb0.isChecked()) {
                    R104 = 0;
                }
                if (rb1.isChecked()) {
                    R104 = 1;
                }
                if (rb2.isChecked()) {
                    R104 = 2;
                }
                if (rb3.isChecked()) {
                    R104 = 3;
                }
                rb0 = findViewById(R.id.RB105_0);
                rb1 = findViewById(R.id.RB105_1);
                rb2 = findViewById(R.id.RB105_2);
                rb3 = findViewById(R.id.RB105_3);
                if (rb0.isChecked()) {
                    R105 = 0;
                }
                if (rb1.isChecked()) {
                    R105 = 1;
                }
                if (rb2.isChecked()) {
                    R105 = 2;
                }
                if (rb3.isChecked()) {
                    R105 = 3;
                }
                rb0 = findViewById(R.id.RB106_0);
                rb1 = findViewById(R.id.RB106_1);
                rb2 = findViewById(R.id.RB106_2);
                rb3 = findViewById(R.id.RB106_3);
                if (rb0.isChecked()) {
                    R106 = 0;
                }
                if (rb1.isChecked()) {
                    R106 = 1;
                }
                if (rb2.isChecked()) {
                    R106 = 2;
                }
                if (rb3.isChecked()) {
                    R106 = 3;
                }
                rb0 = findViewById(R.id.RB107_0);
                rb1 = findViewById(R.id.RB107_1);
                rb2 = findViewById(R.id.RB107_2);
                rb3 = findViewById(R.id.RB107_3);
                if (rb0.isChecked()) {
                    R107 = 0;
                }
                if (rb1.isChecked()) {
                    R107 = 1;
                }
                if (rb2.isChecked()) {
                    R107 = 2;
                }
                if (rb3.isChecked()) {
                    R107 = 3;
                }
                rb0 = findViewById(R.id.RB108_0);
                rb1 = findViewById(R.id.RB108_1);
                rb2 = findViewById(R.id.RB108_2);
                rb3 = findViewById(R.id.RB108_3);
                if (rb0.isChecked()) {
                    R108 = 0;
                }
                if (rb1.isChecked()) {
                    R108 = 1;
                }
                if (rb2.isChecked()) {
                    R108 = 2;
                }
                if (rb3.isChecked()) {
                    R108 = 3;
                }
                rb0 = findViewById(R.id.RB109_0);
                rb1 = findViewById(R.id.RB109_1);
                rb2 = findViewById(R.id.RB109_2);
                rb3 = findViewById(R.id.RB109_3);
                if (rb0.isChecked()) {
                    R109 = 0;
                }
                if (rb1.isChecked()) {
                    R109 = 1;
                }
                if (rb2.isChecked()) {
                    R109 = 2;
                }
                if (rb3.isChecked()) {
                    R109 = 3;
                }
                rb0 = findViewById(R.id.RB110_0);
                rb1 = findViewById(R.id.RB110_1);
                rb2 = findViewById(R.id.RB110_2);
                rb3 = findViewById(R.id.RB110_3);
                if (rb0.isChecked()) {
                    R110 = 0;
                }
                if (rb1.isChecked()) {
                    R110 = 1;
                }
                if (rb2.isChecked()) {
                    R110 = 2;
                }
                if (rb3.isChecked()) {
                    R110 = 3;
                }
                rb0 = findViewById(R.id.RB111_0);
                rb1 = findViewById(R.id.RB111_1);
                rb2 = findViewById(R.id.RB111_2);
                rb3 = findViewById(R.id.RB111_3);
                if (rb0.isChecked()) {
                    R111 = 0;
                }
                if (rb1.isChecked()) {
                    R111 = 1;
                }
                if (rb2.isChecked()) {
                    R111 = 2;
                }
                if (rb3.isChecked()) {
                    R111 = 3;
                }
                rb0 = findViewById(R.id.RB112_0);
                rb1 = findViewById(R.id.RB112_1);
                rb2 = findViewById(R.id.RB112_2);
                rb3 = findViewById(R.id.RB112_3);
                if (rb0.isChecked()) {
                    R112 = 0;
                }
                if (rb1.isChecked()) {
                    R112 = 1;
                }
                if (rb2.isChecked()) {
                    R112 = 2;
                }
                if (rb3.isChecked()) {
                    R112 = 3;
                }
                rb0 = findViewById(R.id.RB113_0);
                rb1 = findViewById(R.id.RB113_1);
                rb2 = findViewById(R.id.RB113_2);
                rb3 = findViewById(R.id.RB113_3);
                if (rb0.isChecked()) {
                    R113 = 0;
                }
                if (rb1.isChecked()) {
                    R113 = 1;
                }
                if (rb2.isChecked()) {
                    R113 = 2;
                }
                if (rb3.isChecked()) {
                    R113 = 3;
                }
                rb0 = findViewById(R.id.RB114_0);
                rb1 = findViewById(R.id.RB114_1);
                rb2 = findViewById(R.id.RB114_2);
                rb3 = findViewById(R.id.RB114_3);
                if (rb0.isChecked()) {
                    R114 = 0;
                }
                if (rb1.isChecked()) {
                    R114 = 1;
                }
                if (rb2.isChecked()) {
                    R114 = 2;
                }
                if (rb3.isChecked()) {
                    R114 = 3;
                }
                rb0 = findViewById(R.id.RB115_0);
                rb1 = findViewById(R.id.RB115_1);
                rb2 = findViewById(R.id.RB115_2);
                rb3 = findViewById(R.id.RB115_3);
                if (rb0.isChecked()) {
                    R115 = 0;
                }
                if (rb1.isChecked()) {
                    R115 = 1;
                }
                if (rb2.isChecked()) {
                    R115 = 2;
                }
                if (rb3.isChecked()) {
                    R115 = 3;
                }
                rb0 = findViewById(R.id.RB116_0);
                rb1 = findViewById(R.id.RB116_1);
                rb2 = findViewById(R.id.RB116_2);
                rb3 = findViewById(R.id.RB116_3);
                if (rb0.isChecked()) {
                    R116 = 0;
                }
                if (rb1.isChecked()) {
                    R116 = 1;
                }
                if (rb2.isChecked()) {
                    R116 = 2;
                }
                if (rb3.isChecked()) {
                    R116 = 3;
                }
                rb0 = findViewById(R.id.RB117_0);
                rb1 = findViewById(R.id.RB117_1);
                rb2 = findViewById(R.id.RB117_2);
                rb3 = findViewById(R.id.RB117_3);
                if (rb0.isChecked()) {
                    R117 = 0;
                }
                if (rb1.isChecked()) {
                    R117 = 1;
                }
                if (rb2.isChecked()) {
                    R117 = 2;
                }
                if (rb3.isChecked()) {
                    R117 = 3;
                }
                rb0 = findViewById(R.id.RB118_0);
                rb1 = findViewById(R.id.RB118_1);
                rb2 = findViewById(R.id.RB118_2);
                rb3 = findViewById(R.id.RB118_3);
                if (rb0.isChecked()) {
                    R118 = 0;
                }
                if (rb1.isChecked()) {
                    R118 = 1;
                }
                if (rb2.isChecked()) {
                    R118 = 2;
                }
                if (rb3.isChecked()) {
                    R118 = 3;
                }
                rb0 = findViewById(R.id.RB119_0);
                rb1 = findViewById(R.id.RB119_1);
                rb2 = findViewById(R.id.RB119_2);
                rb3 = findViewById(R.id.RB119_3);
                if (rb0.isChecked()) {
                    R119 = 0;
                }
                if (rb1.isChecked()) {
                    R119 = 1;
                }
                if (rb2.isChecked()) {
                    R119 = 2;
                }
                if (rb3.isChecked()) {
                    R119 = 3;
                }
                rb0 = findViewById(R.id.RB120_0);
                rb1 = findViewById(R.id.RB120_1);
                rb2 = findViewById(R.id.RB120_2);
                rb3 = findViewById(R.id.RB120_3);
                if (rb0.isChecked()) {
                    R120 = 0;
                }
                if (rb1.isChecked()) {
                    R120 = 1;
                }
                if (rb2.isChecked()) {
                    R120 = 2;
                }
                if (rb3.isChecked()) {
                    R120 = 3;
                }
                rb0 = findViewById(R.id.RB121_0);
                rb1 = findViewById(R.id.RB121_1);
                rb2 = findViewById(R.id.RB121_2);
                rb3 = findViewById(R.id.RB121_3);
                if (rb0.isChecked()) {
                    R121 = 0;
                }
                if (rb1.isChecked()) {
                    R121 = 1;
                }
                if (rb2.isChecked()) {
                    R121 = 2;
                }
                if (rb3.isChecked()) {
                    R121 = 3;
                }
                rb0 = findViewById(R.id.RB122_0);
                rb1 = findViewById(R.id.RB122_1);
                rb2 = findViewById(R.id.RB122_2);
                rb3 = findViewById(R.id.RB122_3);
                if (rb0.isChecked()) {
                    R122 = 0;
                }
                if (rb1.isChecked()) {
                    R122 = 1;
                }
                if (rb2.isChecked()) {
                    R122 = 2;
                }
                if (rb3.isChecked()) {
                    R122 = 3;
                }
                rb0 = findViewById(R.id.RB123_0);
                rb1 = findViewById(R.id.RB123_1);
                rb2 = findViewById(R.id.RB123_2);
                rb3 = findViewById(R.id.RB123_3);
                if (rb0.isChecked()) {
                    R123 = 0;
                }
                if (rb1.isChecked()) {
                    R123 = 1;
                }
                if (rb2.isChecked()) {
                    R123 = 2;
                }
                if (rb3.isChecked()) {
                    R123 = 3;
                }
                rb0 = findViewById(R.id.RB124_0);
                rb1 = findViewById(R.id.RB124_1);
                rb2 = findViewById(R.id.RB124_2);
                rb3 = findViewById(R.id.RB124_3);
                if (rb0.isChecked()) {
                    R124 = 0;
                }
                if (rb1.isChecked()) {
                    R124 = 1;
                }
                if (rb2.isChecked()) {
                    R124 = 2;
                }
                if (rb3.isChecked()) {
                    R124 = 3;
                }
                rb0 = findViewById(R.id.RB125_0);
                rb1 = findViewById(R.id.RB125_1);
                rb2 = findViewById(R.id.RB125_2);
                rb3 = findViewById(R.id.RB125_3);
                if (rb0.isChecked()) {
                    R125 = 0;
                }
                if (rb1.isChecked()) {
                    R125 = 1;
                }
                if (rb2.isChecked()) {
                    R125 = 2;
                }
                if (rb3.isChecked()) {
                    R125 = 3;
                }
                rb0 = findViewById(R.id.RB126_0);
                rb1 = findViewById(R.id.RB126_1);
                rb2 = findViewById(R.id.RB126_2);
                rb3 = findViewById(R.id.RB126_3);
                if (rb0.isChecked()) {
                    R126 = 0;
                }
                if (rb1.isChecked()) {
                    R126 = 1;
                }
                if (rb2.isChecked()) {
                    R126 = 2;
                }
                if (rb3.isChecked()) {
                    R126 = 3;
                }
                rb0 = findViewById(R.id.RB127_0);
                rb1 = findViewById(R.id.RB127_1);
                rb2 = findViewById(R.id.RB127_2);
                rb3 = findViewById(R.id.RB127_3);
                if (rb0.isChecked()) {
                    R127 = 0;
                }
                if (rb1.isChecked()) {
                    R127 = 1;
                }
                if (rb2.isChecked()) {
                    R127 = 2;
                }
                if (rb3.isChecked()) {
                    R127 = 3;
                }
                rb0 = findViewById(R.id.RB128_0);
                rb1 = findViewById(R.id.RB128_1);
                rb2 = findViewById(R.id.RB128_2);
                rb3 = findViewById(R.id.RB128_3);
                if (rb0.isChecked()) {
                    R128 = 0;
                }
                if (rb1.isChecked()) {
                    R128 = 1;
                }
                if (rb2.isChecked()) {
                    R128 = 2;
                }
                if (rb3.isChecked()) {
                    R128 = 3;
                }
                rb0 = findViewById(R.id.RB129_0);
                rb1 = findViewById(R.id.RB129_1);
                rb2 = findViewById(R.id.RB129_2);
                rb3 = findViewById(R.id.RB129_3);
                if (rb0.isChecked()) {
                    R129 = 0;
                }
                if (rb1.isChecked()) {
                    R129 = 1;
                }
                if (rb2.isChecked()) {
                    R129 = 2;
                }
                if (rb3.isChecked()) {
                    R129 = 3;
                }
                rb0 = findViewById(R.id.RB130_0);
                rb1 = findViewById(R.id.RB130_1);
                rb2 = findViewById(R.id.RB130_2);
                rb3 = findViewById(R.id.RB130_3);
                if (rb0.isChecked()) {
                    R130 = 0;
                }
                if (rb1.isChecked()) {
                    R130 = 1;
                }
                if (rb2.isChecked()) {
                    R130 = 2;
                }
                if (rb3.isChecked()) {
                    R130 = 3;
                }
                rb0 = findViewById(R.id.RB131_0);
                rb1 = findViewById(R.id.RB131_1);
                rb2 = findViewById(R.id.RB131_2);
                rb3 = findViewById(R.id.RB131_3);
                if (rb0.isChecked()) {
                    R131 = 0;
                }
                if (rb1.isChecked()) {
                    R131 = 1;
                }
                if (rb2.isChecked()) {
                    R131 = 2;
                }
                if (rb3.isChecked()) {
                    R131 = 3;
                }
                rb0 = findViewById(R.id.RB132_0);
                rb1 = findViewById(R.id.RB132_1);
                rb2 = findViewById(R.id.RB132_2);
                rb3 = findViewById(R.id.RB132_3);
                if (rb0.isChecked()) {
                    R132 = 0;
                }
                if (rb1.isChecked()) {
                    R132 = 1;
                }
                if (rb2.isChecked()) {
                    R132 = 2;
                }
                if (rb3.isChecked()) {
                    R132 = 3;
                }
                rb0 = findViewById(R.id.RB133_0);
                rb1 = findViewById(R.id.RB133_1);
                rb2 = findViewById(R.id.RB133_2);
                rb3 = findViewById(R.id.RB133_3);
                if (rb0.isChecked()) {
                    R133 = 0;
                }
                if (rb1.isChecked()) {
                    R133 = 1;
                }
                if (rb2.isChecked()) {
                    R133 = 2;
                }
                if (rb3.isChecked()) {
                    R133 = 3;
                }
                rb0 = findViewById(R.id.RB134_0);
                rb1 = findViewById(R.id.RB134_1);
                rb2 = findViewById(R.id.RB134_2);
                rb3 = findViewById(R.id.RB134_3);
                if (rb0.isChecked()) {
                    R134 = 0;
                }
                if (rb1.isChecked()) {
                    R134 = 1;
                }
                if (rb2.isChecked()) {
                    R134 = 2;
                }
                if (rb3.isChecked()) {
                    R134 = 3;
                }
                rb0 = findViewById(R.id.RB135_0);
                rb1 = findViewById(R.id.RB135_1);
                rb2 = findViewById(R.id.RB135_2);
                rb3 = findViewById(R.id.RB135_3);
                if (rb0.isChecked()) {
                    R135 = 0;
                }
                if (rb1.isChecked()) {
                    R135 = 1;
                }
                if (rb2.isChecked()) {
                    R135 = 2;
                }
                if (rb3.isChecked()) {
                    R135 = 3;
                }
                rb0 = findViewById(R.id.RB136_0);
                rb1 = findViewById(R.id.RB136_1);
                rb2 = findViewById(R.id.RB136_2);
                rb3 = findViewById(R.id.RB136_3);
                if (rb0.isChecked()) {
                    R136 = 0;
                }
                if (rb1.isChecked()) {
                    R136 = 1;
                }
                if (rb2.isChecked()) {
                    R136 = 2;
                }
                if (rb3.isChecked()) {
                    R136 = 3;
                }
                rb0 = findViewById(R.id.RB137_0);
                rb1 = findViewById(R.id.RB137_1);
                rb2 = findViewById(R.id.RB137_2);
                rb3 = findViewById(R.id.RB137_3);
                if (rb0.isChecked()) {
                    R137 = 0;
                }
                if (rb1.isChecked()) {
                    R137 = 1;
                }
                if (rb2.isChecked()) {
                    R137 = 2;
                }
                if (rb3.isChecked()) {
                    R137 = 3;
                }
                rb0 = findViewById(R.id.RB138_0);
                rb1 = findViewById(R.id.RB138_1);
                rb2 = findViewById(R.id.RB138_2);
                rb3 = findViewById(R.id.RB138_3);
                if (rb0.isChecked()) {
                    R138 = 0;
                }
                if (rb1.isChecked()) {
                    R138 = 1;
                }
                if (rb2.isChecked()) {
                    R138 = 2;
                }
                if (rb3.isChecked()) {
                    R138 = 3;
                }
                rb0 = findViewById(R.id.RB139_0);
                rb1 = findViewById(R.id.RB139_1);
                rb2 = findViewById(R.id.RB139_2);
                rb3 = findViewById(R.id.RB139_3);
                if (rb0.isChecked()) {
                    R139 = 0;
                }
                if (rb1.isChecked()) {
                    R139 = 1;
                }
                if (rb2.isChecked()) {
                    R139 = 2;
                }
                if (rb3.isChecked()) {
                    R139 = 3;
                }
                rb0 = findViewById(R.id.RB140_0);
                rb1 = findViewById(R.id.RB140_1);
                rb2 = findViewById(R.id.RB140_2);
                rb3 = findViewById(R.id.RB140_3);
                if (rb0.isChecked()) {
                    R140 = 0;
                }
                if (rb1.isChecked()) {
                    R140 = 1;
                }
                if (rb2.isChecked()) {
                    R140 = 2;
                }
                if (rb3.isChecked()) {
                    R140 = 3;
                }
                rb0 = findViewById(R.id.RB141_0);
                rb1 = findViewById(R.id.RB141_1);
                rb2 = findViewById(R.id.RB141_2);
                rb3 = findViewById(R.id.RB141_3);
                if (rb0.isChecked()) {
                    R141 = 0;
                }
                if (rb1.isChecked()) {
                    R141 = 1;
                }
                if (rb2.isChecked()) {
                    R141 = 2;
                }
                if (rb3.isChecked()) {
                    R141 = 3;
                }
                rb0 = findViewById(R.id.RB142_0);
                rb1 = findViewById(R.id.RB142_1);
                rb2 = findViewById(R.id.RB142_2);
                rb3 = findViewById(R.id.RB142_3);
                if (rb0.isChecked()) {
                    R142 = 0;
                }
                if (rb1.isChecked()) {
                    R142 = 1;
                }
                if (rb2.isChecked()) {
                    R142 = 2;
                }
                if (rb3.isChecked()) {
                    R142 = 3;
                }
                rb0 = findViewById(R.id.RB143_0);
                rb1 = findViewById(R.id.RB143_1);
                rb2 = findViewById(R.id.RB143_2);
                rb3 = findViewById(R.id.RB143_3);
                if (rb0.isChecked()) {
                    R143 = 0;
                }
                if (rb1.isChecked()) {
                    R143 = 1;
                }
                if (rb2.isChecked()) {
                    R143 = 2;
                }
                if (rb3.isChecked()) {
                    R143 = 3;
                }
                rb0 = findViewById(R.id.RB144_0);
                rb1 = findViewById(R.id.RB144_1);
                rb2 = findViewById(R.id.RB144_2);
                rb3 = findViewById(R.id.RB144_3);
                if (rb0.isChecked()) {
                    R144 = 0;
                }
                if (rb1.isChecked()) {
                    R144 = 1;
                }
                if (rb2.isChecked()) {
                    R144 = 2;
                }
                if (rb3.isChecked()) {
                    R144 = 3;
                }
                rb0 = findViewById(R.id.RB145_0);
                rb1 = findViewById(R.id.RB145_1);
                rb2 = findViewById(R.id.RB145_2);
                rb3 = findViewById(R.id.RB145_3);
                if (rb0.isChecked()) {
                    R145 = 0;
                }
                if (rb1.isChecked()) {
                    R145 = 1;
                }
                if (rb2.isChecked()) {
                    R145 = 2;
                }
                if (rb3.isChecked()) {
                    R145 = 3;
                }
                rb0 = findViewById(R.id.RB146_0);
                rb1 = findViewById(R.id.RB146_1);
                rb2 = findViewById(R.id.RB146_2);
                rb3 = findViewById(R.id.RB146_3);
                if (rb0.isChecked()) {
                    R146 = 0;
                }
                if (rb1.isChecked()) {
                    R146 = 1;
                }
                if (rb2.isChecked()) {
                    R146 = 2;
                }
                if (rb3.isChecked()) {
                    R146 = 3;
                }
                rb0 = findViewById(R.id.RB147_0);
                rb1 = findViewById(R.id.RB147_1);
                rb2 = findViewById(R.id.RB147_2);
                rb3 = findViewById(R.id.RB147_3);
                if (rb0.isChecked()) {
                    R147 = 0;
                }
                if (rb1.isChecked()) {
                    R147 = 1;
                }
                if (rb2.isChecked()) {
                    R147 = 2;
                }
                if (rb3.isChecked()) {
                    R147 = 3;
                }
                rb0 = findViewById(R.id.RB148_0);
                rb1 = findViewById(R.id.RB148_1);
                rb2 = findViewById(R.id.RB148_2);
                rb3 = findViewById(R.id.RB148_3);
                if (rb0.isChecked()) {
                    R148 = 0;
                }
                if (rb1.isChecked()) {
                    R148 = 1;
                }
                if (rb2.isChecked()) {
                    R148 = 2;
                }
                if (rb3.isChecked()) {
                    R148 = 3;
                }
                rb0 = findViewById(R.id.RB149_0);
                rb1 = findViewById(R.id.RB149_1);
                rb2 = findViewById(R.id.RB149_2);
                rb3 = findViewById(R.id.RB149_3);
                if (rb0.isChecked()) {
                    R149 = 0;
                }
                if (rb1.isChecked()) {
                    R149 = 1;
                }
                if (rb2.isChecked()) {
                    R149 = 2;
                }
                if (rb3.isChecked()) {
                    R149 = 3;
                }
                rb0 = findViewById(R.id.RB150_0);
                rb1 = findViewById(R.id.RB150_1);
                rb2 = findViewById(R.id.RB150_2);
                rb3 = findViewById(R.id.RB150_3);
                if (rb0.isChecked()) {
                    R150 = 0;
                }
                if (rb1.isChecked()) {
                    R150 = 1;
                }
                if (rb2.isChecked()) {
                    R150 = 2;
                }
                if (rb3.isChecked()) {
                    R150 = 3;
                }
                rb0 = findViewById(R.id.RB151_0);
                rb1 = findViewById(R.id.RB151_1);
                rb2 = findViewById(R.id.RB151_2);
                rb3 = findViewById(R.id.RB151_3);
                if (rb0.isChecked()) {
                    R151 = 0;
                }
                if (rb1.isChecked()) {
                    R151 = 1;
                }
                if (rb2.isChecked()) {
                    R151 = 2;
                }
                if (rb3.isChecked()) {
                    R151 = 3;
                }
                rb0 = findViewById(R.id.RB152_0);
                rb1 = findViewById(R.id.RB152_1);
                rb2 = findViewById(R.id.RB152_2);
                rb3 = findViewById(R.id.RB152_3);
                if (rb0.isChecked()) {
                    R152 = 0;
                }
                if (rb1.isChecked()) {
                    R152 = 1;
                }
                if (rb2.isChecked()) {
                    R152 = 2;
                }
                if (rb3.isChecked()) {
                    R152 = 3;
                }
                rb0 = findViewById(R.id.RB153_0);
                rb1 = findViewById(R.id.RB153_1);
                rb2 = findViewById(R.id.RB153_2);
                rb3 = findViewById(R.id.RB153_3);
                if (rb0.isChecked()) {
                    R153 = 0;
                }
                if (rb1.isChecked()) {
                    R153 = 1;
                }
                if (rb2.isChecked()) {
                    R153 = 2;
                }
                if (rb3.isChecked()) {
                    R153 = 3;
                }
                rb0 = findViewById(R.id.RB154_0);
                rb1 = findViewById(R.id.RB154_1);
                rb2 = findViewById(R.id.RB154_2);
                rb3 = findViewById(R.id.RB154_3);
                if (rb0.isChecked()) {
                    R154 = 0;
                }
                if (rb1.isChecked()) {
                    R154 = 1;
                }
                if (rb2.isChecked()) {
                    R154 = 2;
                }
                if (rb3.isChecked()) {
                    R154 = 3;
                }
                rb0 = findViewById(R.id.RB155_0);
                rb1 = findViewById(R.id.RB155_1);
                rb2 = findViewById(R.id.RB155_2);
                rb3 = findViewById(R.id.RB155_3);
                if (rb0.isChecked()) {
                    R155 = 0;
                }
                if (rb1.isChecked()) {
                    R155 = 1;
                }
                if (rb2.isChecked()) {
                    R155 = 2;
                }
                if (rb3.isChecked()) {
                    R155 = 3;
                }
                rb0 = findViewById(R.id.RB156_0);
                rb1 = findViewById(R.id.RB156_1);
                rb2 = findViewById(R.id.RB156_2);
                rb3 = findViewById(R.id.RB156_3);
                if (rb0.isChecked()) {
                    R156 = 0;
                }
                if (rb1.isChecked()) {
                    R156 = 1;
                }
                if (rb2.isChecked()) {
                    R156 = 2;
                }
                if (rb3.isChecked()) {
                    R156 = 3;
                }
                rb0 = findViewById(R.id.RB157_0);
                rb1 = findViewById(R.id.RB157_1);
                rb2 = findViewById(R.id.RB157_2);
                rb3 = findViewById(R.id.RB157_3);
                if (rb0.isChecked()) {
                    R157 = 0;
                }
                if (rb1.isChecked()) {
                    R157 = 1;
                }
                if (rb2.isChecked()) {
                    R157 = 2;
                }
                if (rb3.isChecked()) {
                    R157 = 3;
                }
                rb0 = findViewById(R.id.RB158_0);
                rb1 = findViewById(R.id.RB158_1);
                rb2 = findViewById(R.id.RB158_2);
                rb3 = findViewById(R.id.RB158_3);
                if (rb0.isChecked()) {
                    R158 = 0;
                }
                if (rb1.isChecked()) {
                    R158 = 1;
                }
                if (rb2.isChecked()) {
                    R158 = 2;
                }
                if (rb3.isChecked()) {
                    R158 = 3;
                }
                rb0 = findViewById(R.id.RB159_0);
                rb1 = findViewById(R.id.RB159_1);
                rb2 = findViewById(R.id.RB159_2);
                rb3 = findViewById(R.id.RB159_3);
                if (rb0.isChecked()) {
                    R159 = 0;
                }
                if (rb1.isChecked()) {
                    R159 = 1;
                }
                if (rb2.isChecked()) {
                    R159 = 2;
                }
                if (rb3.isChecked()) {
                    R159 = 3;
                }
                rb0 = findViewById(R.id.RB160_0);
                rb1 = findViewById(R.id.RB160_1);
                rb2 = findViewById(R.id.RB160_2);
                rb3 = findViewById(R.id.RB160_3);
                if (rb0.isChecked()) {
                    R160 = 0;
                }
                if (rb1.isChecked()) {
                    R160 = 1;
                }
                if (rb2.isChecked()) {
                    R160 = 2;
                }
                if (rb3.isChecked()) {
                    R160 = 3;
                }
                rb0 = findViewById(R.id.RB161_0);
                rb1 = findViewById(R.id.RB161_1);
                rb2 = findViewById(R.id.RB161_2);
                rb3 = findViewById(R.id.RB161_3);
                if (rb0.isChecked()) {
                    R161 = 0;
                }
                if (rb1.isChecked()) {
                    R161 = 1;
                }
                if (rb2.isChecked()) {
                    R161 = 2;
                }
                if (rb3.isChecked()) {
                    R161 = 3;
                }
                rb0 = findViewById(R.id.RB162_0);
                rb1 = findViewById(R.id.RB162_1);
                rb2 = findViewById(R.id.RB162_2);
                rb3 = findViewById(R.id.RB162_3);
                if (rb0.isChecked()) {
                    R162 = 0;
                }
                if (rb1.isChecked()) {
                    R162 = 1;
                }
                if (rb2.isChecked()) {
                    R162 = 2;
                }
                if (rb3.isChecked()) {
                    R162 = 3;
                }
                rb0 = findViewById(R.id.RB163_0);
                rb1 = findViewById(R.id.RB163_1);
                rb2 = findViewById(R.id.RB163_2);
                rb3 = findViewById(R.id.RB163_3);
                if (rb0.isChecked()) {
                    R163 = 0;
                }
                if (rb1.isChecked()) {
                    R163 = 1;
                }
                if (rb2.isChecked()) {
                    R163 = 2;
                }
                if (rb3.isChecked()) {
                    R163 = 3;
                }
                rb0 = findViewById(R.id.RB164_0);
                rb1 = findViewById(R.id.RB164_1);
                rb2 = findViewById(R.id.RB164_2);
                rb3 = findViewById(R.id.RB164_3);
                if (rb0.isChecked()) {
                    R164 = 0;
                }
                if (rb1.isChecked()) {
                    R164 = 1;
                }
                if (rb2.isChecked()) {
                    R164 = 2;
                }
                if (rb3.isChecked()) {
                    R164 = 3;
                }
                rb0 = findViewById(R.id.RB165_0);
                rb1 = findViewById(R.id.RB165_1);
                rb2 = findViewById(R.id.RB165_2);
                rb3 = findViewById(R.id.RB165_3);
                if (rb0.isChecked()) {
                    R165 = 0;
                }
                if (rb1.isChecked()) {
                    R165 = 1;
                }
                if (rb2.isChecked()) {
                    R165 = 2;
                }
                if (rb3.isChecked()) {
                    R165 = 3;
                }
                rb0 = findViewById(R.id.RB166_0);
                rb1 = findViewById(R.id.RB166_1);
                rb2 = findViewById(R.id.RB166_2);
                rb3 = findViewById(R.id.RB166_3);
                if (rb0.isChecked()) {
                    R166 = 0;
                }
                if (rb1.isChecked()) {
                    R166 = 1;
                }
                if (rb2.isChecked()) {
                    R166 = 2;
                }
                if (rb3.isChecked()) {
                    R166 = 3;
                }
                rb0 = findViewById(R.id.RB167_0);
                rb1 = findViewById(R.id.RB167_1);
                rb2 = findViewById(R.id.RB167_2);
                rb3 = findViewById(R.id.RB167_3);
                if (rb0.isChecked()) {
                    R167 = 0;
                }
                if (rb1.isChecked()) {
                    R167 = 1;
                }
                if (rb2.isChecked()) {
                    R167 = 2;
                }
                if (rb3.isChecked()) {
                    R167 = 3;
                }
                rb0 = findViewById(R.id.RB168_0);
                rb1 = findViewById(R.id.RB168_1);
                rb2 = findViewById(R.id.RB168_2);
                rb3 = findViewById(R.id.RB168_3);
                if (rb0.isChecked()) {
                    R168 = 0;
                }
                if (rb1.isChecked()) {
                    R168 = 1;
                }
                if (rb2.isChecked()) {
                    R168 = 2;
                }
                if (rb3.isChecked()) {
                    R168 = 3;
                }
                rb0 = findViewById(R.id.RB169_0);
                rb1 = findViewById(R.id.RB169_1);
                rb2 = findViewById(R.id.RB169_2);
                rb3 = findViewById(R.id.RB169_3);
                if (rb0.isChecked()) {
                    R169 = 0;
                }
                if (rb1.isChecked()) {
                    R169 = 1;
                }
                if (rb2.isChecked()) {
                    R169 = 2;
                }
                if (rb3.isChecked()) {
                    R169 = 3;
                }
                rb0 = findViewById(R.id.RB170_0);
                rb1 = findViewById(R.id.RB170_1);
                rb2 = findViewById(R.id.RB170_2);
                rb3 = findViewById(R.id.RB170_3);
                if (rb0.isChecked()) {
                    R170 = 0;
                }
                if (rb1.isChecked()) {
                    R170 = 1;
                }
                if (rb2.isChecked()) {
                    R170 = 2;
                }
                if (rb3.isChecked()) {
                    R170 = 3;
                }
                rb0 = findViewById(R.id.RB171_0);
                rb1 = findViewById(R.id.RB171_1);
                rb2 = findViewById(R.id.RB171_2);
                rb3 = findViewById(R.id.RB171_3);
                if (rb0.isChecked()) {
                    R171 = 0;
                }
                if (rb1.isChecked()) {
                    R171 = 1;
                }
                if (rb2.isChecked()) {
                    R171 = 2;
                }
                if (rb3.isChecked()) {
                    R171 = 3;
                }
                rb0 = findViewById(R.id.RB172_0);
                rb1 = findViewById(R.id.RB172_1);
                rb2 = findViewById(R.id.RB172_2);
                rb3 = findViewById(R.id.RB172_3);
                if (rb0.isChecked()) {
                    R172 = 0;
                }
                if (rb1.isChecked()) {
                    R172 = 1;
                }
                if (rb2.isChecked()) {
                    R172 = 2;
                }
                if (rb3.isChecked()) {
                    R172 = 3;
                }
                rb0 = findViewById(R.id.RB173_0);
                rb1 = findViewById(R.id.RB173_1);
                rb2 = findViewById(R.id.RB173_2);
                rb3 = findViewById(R.id.RB173_3);
                if (rb0.isChecked()) {
                    R173 = 0;
                }
                if (rb1.isChecked()) {
                    R173 = 1;
                }
                if (rb2.isChecked()) {
                    R173 = 2;
                }
                if (rb3.isChecked()) {
                    R173 = 3;
                }
                rb0 = findViewById(R.id.RB174_0);
                rb1 = findViewById(R.id.RB174_1);
                rb2 = findViewById(R.id.RB174_2);
                rb3 = findViewById(R.id.RB174_3);
                if (rb0.isChecked()) {
                    R174 = 0;
                }
                if (rb1.isChecked()) {
                    R174 = 1;
                }
                if (rb2.isChecked()) {
                    R174 = 2;
                }
                if (rb3.isChecked()) {
                    R174 = 3;
                }
                rb0 = findViewById(R.id.RB175_0);
                rb1 = findViewById(R.id.RB175_1);
                rb2 = findViewById(R.id.RB175_2);
                rb3 = findViewById(R.id.RB175_3);
                if (rb0.isChecked()) {
                    R175 = 0;
                }
                if (rb1.isChecked()) {
                    R175 = 1;
                }
                if (rb2.isChecked()) {
                    R175 = 2;
                }
                if (rb3.isChecked()) {
                    R175 = 3;
                }
                rb0 = findViewById(R.id.RB176_0);
                rb1 = findViewById(R.id.RB176_1);
                rb2 = findViewById(R.id.RB176_2);
                rb3 = findViewById(R.id.RB176_3);
                if (rb0.isChecked()) {
                    R176 = 0;
                }
                if (rb1.isChecked()) {
                    R176 = 1;
                }
                if (rb2.isChecked()) {
                    R176 = 2;
                }
                if (rb3.isChecked()) {
                    R176 = 3;
                }
                rb0 = findViewById(R.id.RB177_0);
                rb1 = findViewById(R.id.RB177_1);
                rb2 = findViewById(R.id.RB177_2);
                rb3 = findViewById(R.id.RB177_3);
                if (rb0.isChecked()) {
                    R177 = 0;
                }
                if (rb1.isChecked()) {
                    R177 = 1;
                }
                if (rb2.isChecked()) {
                    R177 = 2;
                }
                if (rb3.isChecked()) {
                    R177 = 3;
                }
                rb0 = findViewById(R.id.RB178_0);
                rb1 = findViewById(R.id.RB178_1);
                rb2 = findViewById(R.id.RB178_2);
                rb3 = findViewById(R.id.RB178_3);
                if (rb0.isChecked()) {
                    R178 = 0;
                }
                if (rb1.isChecked()) {
                    R178 = 1;
                }
                if (rb2.isChecked()) {
                    R178 = 2;
                }
                if (rb3.isChecked()) {
                    R178 = 3;
                }
                rb0 = findViewById(R.id.RB179_0);
                rb1 = findViewById(R.id.RB179_1);
                rb2 = findViewById(R.id.RB179_2);
                rb3 = findViewById(R.id.RB179_3);
                if (rb0.isChecked()) {
                    R179 = 0;
                }
                if (rb1.isChecked()) {
                    R179 = 1;
                }
                if (rb2.isChecked()) {
                    R179 = 2;
                }
                if (rb3.isChecked()) {
                    R179 = 3;
                }
                rb0 = findViewById(R.id.RB180_0);
                rb1 = findViewById(R.id.RB180_1);
                rb2 = findViewById(R.id.RB180_2);
                rb3 = findViewById(R.id.RB180_3);
                if (rb0.isChecked()) {
                    R180 = 0;
                }
                if (rb1.isChecked()) {
                    R180 = 1;
                }
                if (rb2.isChecked()) {
                    R180 = 2;
                }
                if (rb3.isChecked()) {
                    R180 = 3;
                }
                //Prueba

                //Analisis de datos
                Res1 = R1 + R2 + R3 + R4 + R5 + R6 + R7 + R8 + R9 + R10 + R11 + R12;
                Res2 = R13 + R14 + R15 + R16 + R17 + R18 + R19 + R20 + R21 + R22 + R23 + R24;
                Res3 = R25 + R26 + R27 + R28 + R29 + R30 + R31 + R32 + R33 + R34 + R35 + R36;
                Res4 = R37 + R38 + R39 + R40 + R41 + R42 + R43 + R44 + R45 + R46 + R47 + R48;
                Res5 = R49 + R50 + R51 + R52 + R53 + R54 + R55 + R56 + R57 + R58 + R59 + R60;
                Res6 = R61 + R62 + R63 + R64 + R65 + R66 + R67 + R68 + R69 + R70 + R71 + R72;
                Res7 = R73 + R74 + R75 + R76 + R77 + R78 + R79 + R80 + R81 + R82 + R83 + R84;
                Res8 = R85 + R86 + R87 + R88 + R89 + R90 + R91 + R92 + R93 + R94 + R95 + R96;
                Res9 = R97 + R98 + R99 + R100 + R101 + R102 + R103 + R104 + R105 + R106 + R107 + R108;
                Res10 = R109 + R110 + R111 + R112 + R113 + R114 + R115 + R116 + R117 + R118 + R119 + R120;
                Res11 = R121 + R122 + R123 + R124 + R125 + R126 + R127 + R128 + R129 + R130 + R131 + R132;
                Res12 = R133 + R134 + R135 + R136 + R137 + R138 + R139 + R140 + R141 + R142 + R143 + R144;
                Res13 = R145 + R146 + R147 + R148 + R149 + R150 + R151 + R152 + R153 + R154 + R155 + R156;
                Res14 = R157 + R158 + R159 + R160 + R161 + R162 + R163 + R164 + R165 + R166 + R167 + R168;
                Res15 = R169 + R170 + R171 + R172 + R173 + R174 + R175 + R176 + R177 + R178 + R179 + R180;

                int mayor = 0;
                if (mayor < Res1) {
                    mayor = Res1;
                }
                if (mayor < Res2) {
                    mayor = Res2;
                }
                if (mayor < Res3) {
                    mayor = Res3;
                }
                if (mayor < Res4) {
                    mayor = Res4;
                }
                if (mayor < Res5) {
                    mayor = Res5;
                }
                if (mayor < Res6) {
                    mayor = Res6;
                }
                if (mayor < Res7) {
                    mayor = Res7;
                }
                if (mayor < Res8) {
                    mayor = Res8;
                }
                if (mayor < Res9) {
                    mayor = Res9;
                }
                if (mayor < Res10) {
                    mayor = Res10;
                }
                if (mayor < Res11) {
                    mayor = Res11;
                }
                if (mayor < Res12) {
                    mayor = Res12;
                }
                if (mayor < Res13) {
                    mayor = Res13;
                }
                if (mayor < Res14) {
                    mayor = Res14;
                }
                if (mayor < Res15) {
                    mayor = Res15;
                }


                //Resultados
                if (mayor == Res1) {
                    Toast.makeText(getApplicationContext(), "C1- Cientifico", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res2) {
                    Toast.makeText(getApplicationContext(), "C2- Tecnológico", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res3) {
                    Toast.makeText(getApplicationContext(), "C3 - Sanitario", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res4) {
                    Toast.makeText(getApplicationContext(), "C4 - Cientifico Social", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res5) {
                    Toast.makeText(getApplicationContext(), "C5 - Juridico Social", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res6) {
                    Toast.makeText(getApplicationContext(), "C6 - Comunicación Informacion", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res7) {
                    Toast.makeText(getApplicationContext(), "C7 - Psicopedagógico", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res8) {
                    Toast.makeText(getApplicationContext(), "C8 - Empresarial", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res9) {
                    Toast.makeText(getApplicationContext(), "C9 - Informatica", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res10) {
                    Toast.makeText(getApplicationContext(), "C10 - Agrario", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res11) {
                    Toast.makeText(getApplicationContext(), "C11 - Art. Plástico", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res12) {
                    Toast.makeText(getApplicationContext(), "C12 - Art. Musical", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res13) {
                    Toast.makeText(getApplicationContext(), "C13 - Fuerzas Armadas", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res14) {
                    Toast.makeText(getApplicationContext(), "C14 - Deportivo", Toast.LENGTH_LONG).show();
                }
                if (mayor == Res15) {
                    Toast.makeText(getApplicationContext(), "C15 - Turismo", Toast.LENGTH_LONG).show();
                }
                break;
        }

    }
}
