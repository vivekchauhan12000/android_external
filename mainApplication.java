package com.example.loginform;

import com.example.loginform.R;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity implements OnClickListener,TextWatcher{
           
            EditText name;
            EditText pass;
            Button login;
            Button cancel;
           
           
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText )findViewById(R.id.editText1);
        name.addTextChangedListener(this);
        pass=(EditText )findViewById(R.id.editText2);
        pass.addTextChangedListener(this);
        login=(Button )findViewById(R.id.button1);
        cancel=(Button )findViewById(R.id.button2);
        login.setOnClickListener(this);
        cancel.setOnClickListener(this);
        login.setEnabled(false);
        cancel.setEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

            @SuppressLint("ShowToast") @Override
            public void onClick(View v) {
                                                                                               
            }

            public void afterTextChanged(Editable arg0) {
                       
                       
            }

            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,int arg3) {
                       
                       
            }

            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                       
                        String na=name.getText().toString();
                        String pa=pass.getText().toString();
                       
                        if(na.equals("chaitu") && pa.equals("root")) 
                        {
                                    Button btn = (Button) findViewById(R.id.button1);
                                    btn.setEnabled(true)}}}
