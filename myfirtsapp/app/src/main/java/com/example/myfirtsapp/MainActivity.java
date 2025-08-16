package com.example.myfirtsapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnSaludo;
    TextView tvSaludo;
    EditText etUserInput; // Declaración del EditText

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnSaludo = findViewById(R.id.btnSaludo);
        tvSaludo = findViewById(R.id.tvSaludo);
        etUserInput = findViewById(R.id.etUserInput); // Inicialización del EditText

        btnSaludo.setOnClickListener(v -> {
            String inputText = etUserInput.getText().toString(); // Obtener texto del EditText
            Toast.makeText(this, inputText, Toast.LENGTH_LONG).show(); // Mostrar texto en el Toast
            tvSaludo.setText(inputText); // Mostrar texto del EditText en el TextView
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
