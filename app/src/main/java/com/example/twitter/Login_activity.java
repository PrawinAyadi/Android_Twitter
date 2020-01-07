package com.example.twitter;


import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class Login_activity extends AppCompatActivity {
    EditText et_email, et_password;
    ImageButton ib_show_P;
    TextView Tx_sp;
    Button btn_login;
    public static String Token="";
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        Tx_sp = findViewById(R.id.Tx_sp);
        et_email = findViewById(R.id.login_email);
        et_password = findViewById(R.id.login_password);
        ib_show_P = findViewById(R.id.btn_SP);
        btn_login = findViewById(R.id.btn_login);

    }
}