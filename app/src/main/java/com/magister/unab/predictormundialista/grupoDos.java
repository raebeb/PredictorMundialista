package com.magister.unab.predictormundialista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class grupoDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_dos);
    }

    public void porcentajeA (View view) {
        Intent I = new Intent(this, porcentaje_a.class);
        startActivity(I);
    }

    public void porcentajeB (View view) {
        Intent I = new Intent(this, porcentaje_b.class);
        startActivity(I);
    }

    public void porcentajeC (View view) {
        Intent I = new Intent(this, porcentaje_c.class);
        startActivity(I);
    }

    public void porcentajeD (View view) {
        Intent I = new Intent(this, porcentaje_d.class);
        startActivity(I);
    }

    public void porcentajeE (View view) {
        Intent I = new Intent(this, porcentaje_e.class);
        startActivity(I);
    }

    public void porcentajeF (View view) {
        Intent I = new Intent(this, porcentaje_f.class);
        startActivity(I);
    }

    public void porcentajeG (View view) {
        Intent I = new Intent(this, porcentaje_g.class);
        startActivity(I);
    }

    public void porcentajeH (View view) {
        Intent I = new Intent(this, porcentaje_h.class);
        startActivity(I);
    }
}
