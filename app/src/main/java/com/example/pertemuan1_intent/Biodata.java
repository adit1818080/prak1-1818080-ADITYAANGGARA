package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    final EditText edtNama = (EditText)findViewById(R.id.input_nama);
    final EditText edtNim = (EditText)findViewById(R.id.input_nim);
    final EditText edtJurusan = (EditText)findViewById(R.id.input_jur);
    final EditText edtAngkatan = (EditText)findViewById(R.id.input_ang);
    final TextView tvNama = (EditText)findViewById(R.id.output_nama);
    final TextView tvNim = (EditText)findViewById(R.id.output_nim);
    final TextView tvJurusan = (EditText)findViewById(R.id.output_jur);
    final TextView tvAngkatan = (EditText)findViewById(R.id.output_ang);

   final Button btnTampil= root.findViewById(R.id.tampil);
 btnTampil.setOnClickListener(new View.OnClickListener()
    {
        @Override public void onClick (View v){
        tvNama.setText(edtNama.getText().toString());
        tvNim.setText(edtNim.getText().toString());
        tvJurusan.setText(edtJurusan.getText().toString());
        tvAngkatan.setText(edtAngkatan.getText().toString())
    }
    });
 return root;


}