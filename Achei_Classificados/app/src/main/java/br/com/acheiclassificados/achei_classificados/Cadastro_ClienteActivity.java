package br.com.acheiclassificados.achei_classificados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro_ClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro__cliente);

        //Cadastro - Cliente
        EditText editNomeCadastroCliente = (EditText)findViewById(R.id.edit_Nome_Cadastro_Cliente);
        EditText editTelefoneCadastroCliente = (EditText)findViewById(R.id.edit_Telefone_Cadastro_Cliente);
        EditText editEmailCadastroCliente = (EditText)findViewById(R.id.edit_Email_Cadastro_Cliente);
        Button btnCadastroCliente = (Button)findViewById(R.id.btn_Cadastro_Cliente);

    }
}
