package com.thailam.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_Click);

        EditText edtName = findViewById(R.id.edt_Name);
        EditText edtMsv = findViewById(R.id.edt_Msv);
        EditText edtAge =findViewById(R.id.edt_Tuoi);
        RadioButton rdoNam = findViewById(R.id.rdo_Nam);
        RadioButton rdoNu = findViewById(R.id.rdo_Nu);
        CheckBox chkDaBong = findViewById(R.id.chk_Da);
        CheckBox chkchoigame= findViewById(R.id.chk_game);
        TextView tvResult = findViewById(R.id.tv_result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoTen = edtName.getText().toString();
                String Msv = edtMsv.getText().toString();
                String Tuoi = edtAge.getText().toString();
                String gioitinh = rdoNam.isChecked()
                        ? rdoNam.getText().toString()
                        : (rdoNu.isChecked()
                        ? rdoNu.getText().toString()
                        : "chu chon gioi tinh");
                String soThich = (chkDaBong.isChecked() && chkchoigame.isChecked())
                        ? "da bong va bong ro"
                        : (chkDaBong.isChecked()
                        ? chkDaBong.getText().toString()
                        : (chkchoigame.isChecked()
                        ? chkchoigame.getText().toString()
                        : "khong thich gi ca"));
                tvResult.setText("Ho va ten: " + hoTen + "\n"
                        + "Ma sinh vien: " + Msv + "\n"
                        + "Tuoi: " + Tuoi + "\n"
                        + "Gioi tinh: " + gioitinh + "\n"
                        + "So thich: " + soThich);
            }
        });
    }
}