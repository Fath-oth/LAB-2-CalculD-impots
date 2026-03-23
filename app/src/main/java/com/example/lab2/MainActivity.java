package com.example.lab2;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab2.R;

public class MainActivity extends AppCompatActivity {


    private EditText surfaceInput, piecesInput;
    private CheckBox piscineCheckbox;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        surfaceInput = findViewById(R.id.input_surf);
        piecesInput = findViewById(R.id.input_pieces);
        piscineCheckbox = findViewById(R.id.checkbox_pisc);
        resultView = findViewById(R.id.result);


        findViewById(R.id.button_calcule).setOnClickListener(v -> calculer());
    }

    private void calculer() {

        double surface = Double.parseDouble(surfaceInput.getText().toString());
        int pieces = Integer.parseInt(piecesInput.getText().toString());
        boolean piscine = piscineCheckbox.isChecked();


        double impotBase = surface * 2;
        double supplement = pieces * 50 + (piscine ? 100 : 0);
        double total = impotBase + supplement;


        String texteResultat = "Impôt de base : " + impotBase +
                "\nimpôt supplémentaire : " + supplement +
                "\nimpôt Total : " + total;


        resultView.setText(texteResultat);
    }
}