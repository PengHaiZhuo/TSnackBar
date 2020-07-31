package com.phz.tsnackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.phz.topsnackbar.TopSnackBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_normal;
    private Button btn_top;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_normal=findViewById(R.id.show_snack_bar);
        btn_top=findViewById(R.id.show_top_snack_bar);
        btn_top.setOnClickListener(this);
        btn_normal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.show_snack_bar:
                Snackbar.make(view,"我是正常Snackbar", Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.show_top_snack_bar:
                TopSnackBar.make(view,"我是顶部Snackbar", TopSnackBar.LENGTH_SHORT,TopSnackBar.STYLE_WARNING).show();
                break;
        }
    }
}
