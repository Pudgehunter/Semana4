package co.domi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PingClass extends AppCompatActivity {

    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ping_class);

        regresar = findViewById(R.id.regresar);

        regresar.setOnClickListener(
                (v) -> {
                    Intent i = new Intent();
                    finish();
                }
        );

    }
}