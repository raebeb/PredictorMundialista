package com.magister.unab.predictormundialista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String texto = getIntent().getStringExtra("texto");
        setContentView(R.layout.activity_result);

        TextView campoTexto = (TextView)findViewById(R.id.texto);
        campoTexto.setText(texto);
    }
}
