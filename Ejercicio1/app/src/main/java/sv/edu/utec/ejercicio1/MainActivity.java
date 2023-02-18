package sv.edu.utec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNombre=findViewById(R.id.txvNombre);

        String nombre = "Cristian Alvarez";
        tvNombre.setText(" Bienvenido "+ nombre);

    }
}
