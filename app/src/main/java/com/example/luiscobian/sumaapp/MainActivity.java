package com.example.luiscobian.sumaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // atributos de instancia de la clase
    EditText varTxtNum1;
    EditText var2TxtNum2;
    TextView varTxtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //utilizando findViewById para encontrar documentos

        varTxtNum1 = (EditText) findViewById(R.id.edtxtNum1);
        var2TxtNum2 = (EditText) findViewById(R.id.edtxtNum2);
        varTxtResultado = (TextView) findViewById(R.id.txtResultado);

    }

    /**
     * Metodo para que el boton actue
     * @param v siempre este tipo de metodos llevar un parametro View
     */
    public void doSum(View v){
        // convertimos lo que tienen los cuadros de texto
        int num1 = Integer.parseInt(varTxtNum1.getText().toString());
        int num2 = Integer.parseInt(var2TxtNum2.getText().toString());
        // hacemos la operacion
        int resultado = num1 + num2;
        // lo mandamos al texto
        varTxtResultado.setText("El resultado es " + resultado);
    }
}
