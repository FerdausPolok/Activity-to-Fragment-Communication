package com.example.activitytofragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtt;
    String input;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtt = findViewById(R.id.edt);
        bundle = new Bundle();
    }

    public void btn(View view) {
        input = edtt.getText().toString();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        BlankFragment a = new BlankFragment();
        bundle.putString("MSG",input);
        a.setArguments(bundle);
        ft.add(R.id.container,a);
        ft.commit();
    }
}
