package sv.edu.utec.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Button btCalculo;
TextView tvResul;
EditText etPrecio;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalculo = findViewById(R.id.btnCalcular);
        tvResul = findViewById(R.id.txvResultado);
        etPrecio = findViewById(R.id.edtPrecio);

    }
    public void Calcular(View view)
    {
        double precio, resultado;
        double resultadoF;
        double iva = 0.134;
        precio=Double.parseDouble(etPrecio.getText().toString());
        resultado = precio * iva;
        resultadoF = resultado + precio;
        tvResul.setText("El Precio Final es: $"+ String.valueOf(resultadoF));

    }
}