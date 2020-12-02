package com.ulisesdiaz.miapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val btnSaludar = findViewById<Button>(R.id.btnSaludar);
        val etNombre = findViewById<EditText>(R.id.etNombre);
        val cbDeveloper = findViewById<CheckBox>(R.id.cbDeveloper);

        btnSaludar.setOnClickListener(View.OnClickListener {
            if (validarDato()){
                if (cbDeveloper.isChecked){
                    Toast.makeText(this, getString(R.string.msj_hola) + " " + etNombre.text +
                            " " + getString(R.string.msj_desarrollador), Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, getString(R.string.msj_hola) + " " + etNombre.text,Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(this, getString(R.string.msj_ingresa_nombre), Toast.LENGTH_LONG).show();
            }
        })
    }

    /**
     * Funcion que valida si el campo etNmbre esta nullo o vacio si es asi regresa un verdadero,
     * caso contrario regresa falso
     */
    fun validarDato(): Boolean{

        val etNombre = findViewById<EditText>(R.id.etNombre);
        val nombreUsuario = etNombre.text;

        if (nombreUsuario.isNullOrBlank()){
            return false;
        }

        return  true;
    }
}