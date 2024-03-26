package com.example.bai_tap_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtCanNang, edtChieuCao;
    Button btnTinhBMI;
    TextView txvBMI, txvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
    }

    private void addControl() {
        edtCanNang = (EditText) findViewById(R.id.edtCanNang);
        edtChieuCao = (EditText) findViewById(R.id.edtChieuCao);
        btnTinhBMI = (Button) findViewById(R.id.btnTinhBMI);
        txvBMI = (TextView) findViewById(R.id.txvBMI);
        txvKetQua = (TextView) findViewById(R.id.txvKetQua);
    }

    public void tinhBMI(View view) {
        // lay du lieu tu form
        String a = edtCanNang.getText().toString();
        String b = edtChieuCao.getText().toString();
        Double canNang = new Double(a);
        Double chieuCao = new Double(b);

        //Toast.makeText(MainActivity.this,canNang+" - "+chieuCao,Toast.LENGTH_SHORT).show();

        // Tinh toan chi so BMI
        Double BMI = canNang / (chieuCao * chieuCao);

        // hien thi ket qua ra man hinh
        txvBMI.setText(BMI.toString());
        if (BMI < 18) {
            txvKetQua.setText("Người gầy!");
        } else if (BMI >= 18 && BMI < 24.9) {
            txvKetQua.setText("Người bình thường!");
        } else if (BMI >= 25 && BMI < 29.9) {
            txvKetQua.setText("Người béo phì cấp độ 1!");
        } else if (BMI >= 30 && BMI < 34.9) {
            txvKetQua.setText("Người béo phì cấp độ 2!");
        } else {
            txvKetQua.setText("Người béo phì cấp độ 3!");
        }
    }
}