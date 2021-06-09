package com.example.cafeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextName;
    private  EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextName = findViewById(R.id.editTextName);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    public void onClickCreateOrder(View view) {
        String name = editTextName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if(!name.isEmpty() && !password.isEmpty()){ //проверка что поля имя и пароль не пустые
        Intent intent = new Intent(this, CreateOrderActivity.class);
        intent.putExtra("name", name); //передаем знаения в интент
        intent.putExtra("password", password);
        startActivity(intent);
        }else{
            Toast.makeText(this, R.string.warning_fill_fields, Toast.LENGTH_SHORT).show();

        }

    }
}
