package sv.edu.utec.calculadorapolacainversaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btCalculo;
    EditText edValor1;
    EditText edValor2;
    EditText edSigno;
    TextView tvResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalculo = findViewById(R.id.btnCalcular);
        edValor1 = findViewById(R.id.edtValor1);
        edValor2 = findViewById(R.id.edtValor2);
        edSigno= findViewById(R.id.edtSigno);
        tvResul = findViewById(R.id.txvResultado);

    }
     public void Calculos(View v){
        int dato1=0, dato2=0;
        double resultado = 0;
        String operaciones = "";

         dato1 = Integer.parseInt(edValor1.getText().toString());
         dato2 = Integer.parseInt(edValor2.getText().toString());
         operaciones = edSigno.getText().toString();

         switch(operaciones)
         {
             case "+" :
             resultado = dato1 + dato2;
             tvResul.setText("La Suma es: "+resultado);
             break;

             case "-":
             resultado = dato1 - dato2;
             tvResul.setText("La Resta es: "+String.valueOf(resultado));
             break;

             case "*":
             resultado = dato1 *  dato2;
             tvResul.setText("La Multiplicación es: "+String.valueOf(resultado));
             break;

             case "/":
             if (dato2 == 0){
                 tvResul.setText("¡ERROR! No se puede dividir entre "+String.valueOf(resultado));
             }else {
                 resultado = (double) dato1 / dato2;
                 tvResul.setText("La division es: "+String.valueOf(resultado));
             }
             break;

             default:
                 tvResul.setText("Signo aritmetico incorrecto "+String.valueOf(resultado));
                 break;
         }



     }
}