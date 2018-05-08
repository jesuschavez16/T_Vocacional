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
                } else {
                    if (rb1.isChecked()) {
                        R1 = 1;
                    } else {
                        if (rb2.isChecked()) {
                            R1 = 2;
                        } else {
                            if (rb3.isChecked()) {
                                R1 = 3;
                            }
                        }
                    }
                }
                ;
                //1 FIN

                //2 INICIO
                rb0 = findViewById(R.id.RB2_0);
                rb1 = findViewById(R.id.RB2_1);
                rb2 = findViewById(R.id.RB2_2);
                rb3 = findViewById(R.id.RB2_3);
                if (rb0.isChecked()) {
                    R2 = 0;
                } else {
                    if (rb1.isChecked()) {
                        R2 = 1;
                    } else {
                        if (rb2.isChecked()) {
                            R2 = 2;
                        } else {
                            if (rb3.isChecked()) {
                                R2 = 3;
                            }
                        }
                    }
                }
                ;
                //2 FIN

                //3 INICIO
                rb0 = findViewById(R.id.RB3_0);
                rb1 = findViewById(R.id.RB3_1);
                rb2 = findViewById(R.id.RB3_2);
                rb3 = findViewById(R.id.RB3_3);
                if (rb0.isChecked()) {
                    R3 = 0;
                } else {
                    if (rb1.isChecked()) {
                        R3 = 1;
                    } else {
                        if (rb2.isChecked()) {
                            R3 = 2;
                        } else {
                            if (rb3.isChecked()) {
                                R3 = 3;
                            }
                        }
                    }
                }
                ;
                //3 FIN

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
        }

    }
}
