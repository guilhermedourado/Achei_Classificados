package br.com.acheiclassificados.achei_classificados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro_ProfissionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro__profissional);

        //Cadastro - Profissional
        EditText editNomeCadastroProfissional = (EditText)findViewById(R.id.edit_Nome_Cadastro_Profissional);
        EditText editTelefoneCadastroProfissional = (EditText)findViewById(R.id.edit_Telefone_Cadastro_Profissional);
        EditText editEnderecoCadastroProfissional = (EditText)findViewById(R.id.edit_Endereco_Cadastro_Profissional);
        EditText editEmailCadastroProfissional = (EditText)findViewById(R.id.edit_Email_Cadastro_Profissional);
        Button btnCadastroProfissional = (Button)findViewById(R.id.btn_Cadastro_Profissional);

    }
}
