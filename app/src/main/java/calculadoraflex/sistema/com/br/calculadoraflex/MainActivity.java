package calculadoraflex.sistema.com.br.calculadoraflex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultado,teste;
    EditText gasolina,alcool;
    Button verifica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.txtResultado);
        gasolina = findViewById(R.id.edtGasolina);
        alcool = findViewById(R.id.edtAlcool);
        verifica = findViewById(R.id.btnVerifica);
        teste = findViewById(R.id.teste);
    }

    public void verifica(View v){

        float r;

        String a = alcool.getText().toString();
        Float valAlc= Float.parseFloat(a);

        String g = gasolina.getText().toString();
        Float valGas= Float.parseFloat(g);



        r = (valAlc / valGas);

        teste.setText(String.valueOf(r));
        if ( r > 0.70){
            resultado.setText("Abasteça com Gasolina");
        } else if ( r < 0.70){
            resultado.setText("Abasteça com Alcool");
        }

    }

    public void resetResultado( View view){
        resultado.setText("Informe os Valores");
    }


}
