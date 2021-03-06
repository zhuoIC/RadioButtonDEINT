package com.example.radiobutton;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Clase de ejemplo de cómo funciona RadioButton
 * @author Nicolás Hernández Jiménez
 */

public class MainActivity extends AppCompatActivity{
    private View contraintParticular;
    private View contraintBussiness;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contraintParticular = findViewById(R.id.constraintParticular);
        contraintBussiness = findViewById(R.id.constraintBussiness);
        radioGroup = findViewById(R.id.rdgTypeClient);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbtBussiness:
                        viewParticular(false);
                        break;
                    case R.id.rbtParticular:
                        viewParticular(true);
                        break;
                }
            }
        });
    }

    /**
     * Método que gestiona el evento onClick en los componentes RadioButton de la Interface
     * @param view
     */
    /*public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.rbtParticular:
                viewParticular(true);
                break;
            case R.id.rbtBussiness:
                viewParticular(false);
                break;
        }
    }*/

    /**
     * Método que indica qué ConstraintLayout ha de estar visible según la opción seleccionada
     * @param b
     */
    private void viewParticular (boolean b){
        contraintParticular.setVisibility(b? View.VISIBLE:View.GONE);
        contraintBussiness.setVisibility(b? View.GONE:View.VISIBLE);
    }
}
