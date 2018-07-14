package com.example.ero.week3homework1;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.fr_container, new ChatFragment()).commit();

    }
}
