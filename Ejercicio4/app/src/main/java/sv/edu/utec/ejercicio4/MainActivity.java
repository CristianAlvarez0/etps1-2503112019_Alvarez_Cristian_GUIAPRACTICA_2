package sv.edu.utec.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResul = findViewById(R.id.txvResultados);


        int N = 100;
        //N =Integer.parseInt(edValor.getText().toString());

        int inc = 77, dec= 3;
        int resultadoINC = 0;
        int resultadoDEC = 0;
        int resultadoDUP = 0;

        resultadoINC = N + inc;
        resultadoDEC = resultadoINC - dec;
       resultadoDUP = resultadoDEC * 2;

    tvResul.setText("El Valor Inicial de N = "+N + "\n"+
            "N + 77 =   "+resultadoINC+"\n"+
            "N - 3    =    "+resultadoDEC+"\n"+
            "N * 2   =    "+resultadoDUP);

    }
}