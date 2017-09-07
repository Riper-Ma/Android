/*
    Created by Msb
    移动应用开发实践-登录对话框
    2017.9.6
 */
package com.example.riper_ma.apractice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class TestLoginActivity extends AppCompatActivity
        implements PopupMenu.OnMenuItemClickListener {
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login = (Button) findViewById(R.id.btn_login_dialog);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TestLoginActivity.this);
                LayoutInflater inflater = getLayoutInflater();
                final View dialogView = inflater.inflate(R.layout.dialog_login, null);
                builder.setView(dialogView);
                builder.setTitle("login");

                builder.setPositiveButton("登陆", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText text_username = (EditText) dialogView.findViewById(R.id.text_username);
                        EditText text_password = (EditText) dialogView.findViewById(R.id.text_password);
                        String username = text_username.getText() + "";
                        String password = text_password.getText() + "";
                        if (username.equals("abc") && password.equals("123")) {
                            Toast.makeText(TestLoginActivity.this, "登陆成功", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(TestLoginActivity.this, "登陆失败", Toast.LENGTH_SHORT).show();
                        }
                        dialogInterface.cancel();
                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(TestLoginActivity.this, "取消登陆", Toast.LENGTH_SHORT).show();
                        dialogInterface.cancel();
                    }
                });
                builder.show();

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {

        Toast.makeText(this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}