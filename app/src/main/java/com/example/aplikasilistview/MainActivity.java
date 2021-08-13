package com.example.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namanegara = new String[] {
            "Indonesia", "Malaysia", "Singapore",
            "Italia", "Inggris", "Belanda",
            "Argentina", "Chile", "Mesir",
            "Uganda"
    };
    private String[] ibunegara = new String[] {
            "Jakarta", "Kuala Lumpur", "Singapore",
            "Rome", "London", "Amsterdam",
            "Buenos Aires", "Santiago", "Cairo",
            "Kampala"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MainActivity.this, R.layout.activity_negara_view, R.id.txtNegara, namanegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Negara yang dipilih : " + namanegara[position] + ", ibukotanya " + ibunegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}