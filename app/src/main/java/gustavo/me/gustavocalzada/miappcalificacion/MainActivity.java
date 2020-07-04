package gustavo.me.gustavocalzada.miappcalificacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;
    private EditText et7;
    private EditText et8;
    private EditText et9;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.redes);
        et2 = (EditText)findViewById(R.id.compiladores);
        et3 = (EditText)findViewById(R.id.sistemas);
        et4 = (EditText)findViewById(R.id.sgbd);
        et5 = (EditText)findViewById(R.id.multimedia);
        et6 = (EditText)findViewById(R.id.operativos);
        et7 = (EditText)findViewById(R.id.tratamiento);
        et8 = (EditText)findViewById(R.id.algebra);
        et9 = (EditText)findViewById(R.id.electronica);
        tv1 = (TextView)findViewById(R.id.Status);

    }

    public void Promedio(View view){
        String red = et1.getText().toString();
        String com = et2.getText().toString();
        String sis = et3.getText().toString();
        String bd = et4.getText().toString();
        String multi = et5.getText().toString();
        String ope = et6.getText().toString();
        String img = et7.getText().toString();
        String alg = et8.getText().toString();
        String ele = et9.getText().toString();

        float modelos = Float.parseFloat(red);
        float compilado = Float.parseFloat(com);
        float teoria = Float.parseFloat(sis);
        float basedatos = Float.parseFloat(bd);
        float media = Float.parseFloat(multi);
        float sistemasop = Float.parseFloat(ope);
        float tratamientoimg = Float.parseFloat(img);
        float algebrali = Float.parseFloat(alg);
        float electronicadig = Float.parseFloat(ele);

        float prom = (modelos+compilado+teoria+basedatos+media+sistemasop+tratamientoimg+algebrali+electronicadig)/9;

        if(prom >= 8 ){
            String re = "Status: APROBADO con Promedio: "+ prom +", Eres la verga";
            tv1.setText(re);
        }else if(prom <= 7){
            String re = "Status: REPROBADO con Promedio: "+ prom +", Eres una basura";
            tv1.setText(re);
        }

    }

}