package br.com.fmp.findmypettcc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class act_1 extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_1);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_do_menu_buscar: {
                Toast.makeText(this,"Busquei", Toast.LENGTH_SHORT).show();
            }
        }
        switch (item.getItemId()) {
            case R.id.item_do_menu_outro: {
                Toast.makeText(this,"Foi Outro", Toast.LENGTH_SHORT).show();
            }
        }
        switch (item.getItemId()) {
            case R.id.item_do_menu_outro2: {
                Toast.makeText(this,"Foi Outro 2", Toast.LENGTH_SHORT).show();
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
