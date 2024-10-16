package com.tesji.bibliotecatesji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txTitulo;

    private TextInputEditText txAutor;

    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txAutor = findViewById(R.id.txtAutor);
        txTitulo = findViewById(R.id.txtTitulo);
        btnEnviar = findViewById(R.id.btnRegistrar);



        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validando cajas de texto vacias
                //debe ser por caja de texto
                if(txTitulo.getText().toString().trim().length()==0){
                    txTitulo.setText(null);
                    txTitulo.setError("Campo Obligatorio");
                    txTitulo.requestFocus();
                } else if (txAutor.getText().toString().trim().length()==0) {
                    txAutor.setText(null);
                    txAutor.setError("Campo Obligatorio");
                    txAutor.requestFocus();
                }else {
                    String nombre = txTitulo.getText().toString();
                    Toast.makeText(getApplicationContext(), "Registro correcto del libro  " + nombre, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}