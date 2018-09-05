package br.com.fmp.findmypettcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;

public class MainActivity extends AppCompatActivity {

    private AppCompatActivity editTextEmail;
    private AppCompatActivity editTextPassword;

    private AppCompatActivity editLayoutEmail;
    private AppCompatActivity editLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = (AppCompatEditText) findViewById(R.id.et_email);
    }
}
