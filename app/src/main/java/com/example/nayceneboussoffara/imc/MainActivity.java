package com.example.nayceneboussoffara.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText poids;
    private EditText taille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        poids = (EditText) findViewById(R.id.editText);
        taille = (EditText) findViewById(R.id.editText2);

    } //Fonctin calculer

        public void calculer (View v){
        float taillevalue;
           final TextView result = (TextView) findViewById(R.id.textView);
         String height=taille.getText().toString();
         String weight=poids.getText().toString();
         RadioGroup rg=(RadioGroup) findViewById(R.id.radioGroup);
         int selectedId= rg.getCheckedRadioButtonId(); // le bouton selection
         RadioButton centimetre=(RadioButton) findViewById(R.id.radioButton2);
         RadioButton metre=(RadioButton) findViewById(R.id.radioButton1);
         if (centimetre.getId()==selectedId){
            taillevalue=Float.parseFloat(height)/100;
         } else {
            taillevalue = Float.parseFloat(height);
         }
         float poidsvalue= Float.parseFloat(weight);
         final int resultat= (int) (poidsvalue / taillevalue);
            Button C1 =(Button) findViewById(R.id.btn1);
            C1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    result.setText(resultat);
                }
            });
            Button C2=(Button) findViewById(R.id.btn2);
            C2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    poids.getText().clear();
                    taille.getText().clear();
                }
            });

}
}
