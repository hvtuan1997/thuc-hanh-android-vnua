package com.example.bai_tap_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDangNhap;
    EditText edtUsername, edtPassword;
    TextView txvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
    }

    private void addControl() {
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        txvKetQua = (TextView) findViewById(R.id.txvKetQua);
    }

    public void kiemTraDangNhap(View view) {
        // lay ra du lieu tu view
        String user = edtUsername.getText().toString();
        String pass = edtPassword.getText().toString();

        // kiem tra du lieu dang nhap
        if (user.equals("tuan") && pass.equals("1234")) {
            txvKetQua.setTextColor(Color.RED);
            txvKetQua.setAllCaps(true);
            txvKetQua.setText("Đăng nhập thành công!");
        }
    }
}