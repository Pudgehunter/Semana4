package co.domi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buscarHost, ping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscarHost = findViewById(R.id.buscarHost);
        ping = findViewById(R.id.ping);

        ping.setOnClickListener(
                (v) -> {
                    Intent i = new Intent(this,PingClass.class);
                    startActivity(i);
                }
        );

        buscarHost.setOnClickListener(
                (v) -> {
                    Intent a = new Intent(this,HostClass.class);
                    startActivity(a);
                }
        );

    }
}