package com.example.computer.firebasechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    private Button bTingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bTingresar = findViewById(R.id.bTingresar);

        bTingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PasarAlChat();
            }
        });
    }

    public void PasarAlChat(){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
