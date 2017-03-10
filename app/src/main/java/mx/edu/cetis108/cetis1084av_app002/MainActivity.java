package mx.edu.cetis108.cetis1084av_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText op1, op2;
    Button sum, res, mul, div;
    Integer num1, num2, operacion;
    TextView resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1=(EditText) findViewById(R.id.op_a);
        op2=(EditText) findViewById(R.id.op_b);
        sum=(Button) findViewById(R.id.sumar);
        res=(Button) findViewById(R.id.restar);
        mul=(Button) findViewById(R.id.multiplicar);
        div=(Button) findViewById(R.id.dividir);
        resul=(TextView) findViewById(R.id.resultado);
        sum.setOnClickListener(this);
        res.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
   }

    @Override
    public void onClick(View view) {
        num1=Integer.valueOf((op1.getText().toString()));
        num2=Integer.valueOf((op2.getText().toString()));
        switch (view.getId()) {
            case R.id.sumar:
                operacion=num1+num2;
                resul.setText(operacion.toString());
                break;
            case R.id.restar:
                operacion=num1-num2;
                resul.setText(operacion.toString());
                break;
            case R.id.multiplicar:
                operacion=num1*num2;
                resul.setText(operacion.toString());
                break;
            case R.id.dividir:
                operacion=num1/num2;
                resul.setText(operacion.toString());
                break;
        }
    }
}
