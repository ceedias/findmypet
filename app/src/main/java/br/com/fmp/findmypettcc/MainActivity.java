package br.com.fmp.findmypettcc;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private Toolbar toolbar;

    private AppCompatEditText editTextEmail;
    private AppCompatEditText editTextPassword;

    private TextInputLayout editLayoutEmail;
    private TextInputLayout editLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editTextEmail = findViewById(R.id.et_email);
        editLayoutEmail = findViewById(R.id.txtlayout_email);

        editTextPassword = findViewById(R.id.et_password);
        editLayoutPassword = findViewById(R.id.txtlayout_password);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validaCampos();
            }
        });
    }

    public void validaCampos() {
        if (editTextEmail.getText().toString().isEmpty()) {
            editLayoutEmail.setErrorEnabled(true);
            editLayoutEmail.setError("Preenche o email");
        } else {
            editLayoutEmail.setErrorEnabled(false);
          }

        if (editTextPassword.getText().toString().isEmpty()) {
            editLayoutPassword.setErrorEnabled(true);
            editLayoutPassword.setError("Preencha a sua senha");
        }
        editLayoutPassword.setErrorEnabled(false);
    }
}
