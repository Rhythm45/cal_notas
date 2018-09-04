package com.example.rlcr.cal_notas;



        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class calculadora extends AppCompatActivity {



    EditText EPR1,EPE1,EPR2,EPE2,EVA1,EVA2,EVA3,EVA4,examen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        EPR1 = (EditText) findViewById(R.id.EPR1);
        EPE1 = (EditText) findViewById(R.id.EPE1);
        EPR2 = (EditText) findViewById(R.id.EPR2);
        EPE2 = (EditText) findViewById(R.id.EPE2);
        EVA1 = (EditText) findViewById(R.id.EVA1);
        EVA2 = (EditText) findViewById(R.id.EVA2);
        EVA3 = (EditText) findViewById(R.id.EVA3);
        EVA4 = (EditText) findViewById(R.id.EVA4);
        examen = (EditText) findViewById(R.id.examen);
    }



    public void abrirEstado(View v){

        String v1=EPR1.getText().toString();
        String v2=EPE1.getText().toString();
        String v3=EPR2.getText().toString();
        String v4=EPE2.getText().toString();
        String v5=EVA1.getText().toString();
        String v6=EVA2.getText().toString();
        String v7=EVA3.getText().toString();
        String v8=EVA4.getText().toString();


        float EPR1=Float.parseFloat(v1);
        float EPE1=Float.parseFloat(v2);
        float EPR2=Float.parseFloat(v3);
        float EPE2=Float.parseFloat(v4);
        float EVA1=Float.parseFloat(v5);
        float EVA2=Float.parseFloat(v6);
        float EVA3=Float.parseFloat(v7);
        float EVA4=Float.parseFloat(v8);



        float evas=(EVA1+EVA2+EVA3+EVA4)/4;
        double n_pres=(EPR1*0.1)+(EPE1*0.15)+(EPR2*0.2)+(EPE2*0.25)+(evas*0.3);
        double n_pres1=(n_pres*0.7);
        double n_pre2=  (n_pres1)-40;
        double n_pre3=  (n_pre2*10)/30;




        Toast.makeText(getApplicationContext(),
                "Su nota de presentación es:"+ n_pres, Toast.LENGTH_SHORT).show();


        if(n_pres>=55&&(EPR1>=40)&&(EPE1>=40)&&(EPR2>=40)&&(EPE2>=40)&&(evas>=40))
        {
            Toast.makeText(getApplicationContext(),
                    "Eximido:", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Debe rendir examen:", Toast.LENGTH_SHORT).show();

            Toast.makeText(getApplicationContext(),
                    "Nota minima para aprobar es:"+ n_pre3, Toast.LENGTH_SHORT).show();
        };















    }

    public void abrirEstado_examen(View v){

        String v1=EPR1.getText().toString();
        String v2=EPE1.getText().toString();
        String v3=EPR2.getText().toString();
        String v4=EPE2.getText().toString();
        String v5=EVA1.getText().toString();
        String v6=EVA2.getText().toString();
        String v7=EVA3.getText().toString();
        String v8=EVA4.getText().toString();
        String v9=examen.getText().toString();



        float EPR1=Float.parseFloat(v1);
        float EPE1=Float.parseFloat(v2);
        float EPR2=Float.parseFloat(v3);
        float EPE2=Float.parseFloat(v4);
        float EVA1=Float.parseFloat(v5);
        float EVA2=Float.parseFloat(v6);
        float EVA3=Float.parseFloat(v7);
        float EVA4=Float.parseFloat(v8);
        float examen=Float.parseFloat(v9);



        float evas=(EVA1+EVA2+EVA3+EVA4)/4;
        double n_pres=(EPR1*0.1)+(EPE1*0.15)+(EPR2*0.2)+(EPE2*0.25)+(evas*0.3);
        double n_examen=(n_pres*0.7)+(examen*0.3);







        if(n_examen>=40)
        {
            Toast.makeText(getApplicationContext(),
                    "Nota mas examen es:"+n_examen, Toast.LENGTH_SHORT).show();

            Toast.makeText(getApplicationContext(),
                    "APROBADO!!", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),
                    "Nota mas examen es:"+n_examen, Toast.LENGTH_SHORT).show();

            Toast.makeText(getApplicationContext(),
                    "Has reprobado el semestre:", Toast.LENGTH_SHORT).show();
        };















    }


}