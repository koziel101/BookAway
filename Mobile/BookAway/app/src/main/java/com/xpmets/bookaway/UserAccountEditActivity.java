package com.xpmets.bookaway;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Matheus on 03/07/2016.
 */
public class UserAccountEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_user_account_edit);
        Button editar = (Button) findViewById(R.id.editar_perfil);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvar();
            }
        });
    }

    private void salvar() {
        Toast.makeText(getApplicationContext(), "Perfil Salvo", Toast.LENGTH_SHORT).show();
    }
}

