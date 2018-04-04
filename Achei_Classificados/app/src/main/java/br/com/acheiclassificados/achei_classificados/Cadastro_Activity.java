package br.com.acheiclassificados.achei_classificados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro_Activity extends AppCompatActivity {

    //Feito - Cacau
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_);

        //Cadastro
        Button btnSouProfissional = (Button)findViewById(R.id.btn_login_profissional);
        Button btnSouCliente = (Button)findViewById(R.id.btn_login_cliente);
        TextView txtJaSouCadastrado = (TextView)findViewById(R.id.txt_ja_sou_cadastrado);

        //Intent que vai para a tela de login
        txtJaSouCadastrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiParaLogin = new Intent(Cadastro_Activity.this, Login_Activity.class);
                startActivity(intentVaiParaLogin);
            }
        });

        //Intent que vai para tela de cadastro do profissional
        btnSouProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiParaCadastroProfissional = new Intent(Cadastro_Activity.this, Cadastro_ProfissionalActivity.class);
                startActivity(intentVaiParaCadastroProfissional);
            }
        });

        //Intent que vai para a tela de cadastro do cliente
        btnSouCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiParaCadastroCliente = new Intent(Cadastro_Activity.this, Cadastro_ClienteActivity.class);
                startActivity(intentVaiParaCadastroCliente);
            }
        });
    }

}
