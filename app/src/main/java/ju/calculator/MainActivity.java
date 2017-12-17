package ju.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView result;
    Button add, minus, multiply, devision;
    float resultHolder;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        result = (TextView)findViewById(R.id.result);
        add = (Button)findViewById(R.id.add);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        devision = (Button)findViewById(R.id.devision);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               num1 = Integer.parseInt(number1.getText().toString());
               num2 = Integer.parseInt(number2.getText().toString());
               resultHolder = num1 + num2;
               result.setText(String.valueOf(resultHolder));
           }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                resultHolder = num1 - num2;
                result.setText(String.valueOf(resultHolder));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                resultHolder = num1 * num2;
                result.setText(String.valueOf(resultHolder));
            }
        });

        devision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());
                resultHolder = num1 / num2;
                result.setText(String.valueOf(resultHolder));
            }
        });
    }
}
