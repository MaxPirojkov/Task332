package com.example.task322;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner = findViewById(R.id.spinner);
                String checkLang = spinner.getSelectedItem().toString();
                System.out.println(checkLang);
                if ((checkLang).equals("Russian")){
                    Locale locale = new Locale("ru");
                    Configuration config = new Configuration();
                    config.setLocale(locale);
                    getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                    recreate();
                } else {
                    if ((checkLang).equals("Английский")){
                            Locale locale = new Locale("en");
                            Configuration config = new Configuration();
                            config.setLocale(locale);
                            getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                            recreate();
                        }
                }
            }


        });
    }



}
