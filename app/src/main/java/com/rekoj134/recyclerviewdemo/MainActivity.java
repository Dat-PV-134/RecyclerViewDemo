package com.rekoj134.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvList;
    Contact contact01, contact02, contact03, contact04, contact05;
    List<Contact> contactList;
    ContactAdapter contactAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList = findViewById(R.id.rvContact);

        contact01 = new Contact("Android", "000000", false);
        contact02 = new Contact("IOS", "111111", false);
        contact03 = new Contact("PHP", "222222", false);
        contact04 = new Contact("React", "333333", false);
        contact05 = new Contact("Flutter", "444444", false);

        contactList = new ArrayList<>();
        contactList.add(contact01);
        contactList.add(contact02);
        contactList.add(contact03);
        contactList.add(contact04);
        contactList.add(contact05);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 2, RecyclerView.VERTICAL, false);
        contactAdapter = new ContactAdapter(contactList);

        rvList.setLayoutManager(layoutManager);
        rvList.setAdapter(contactAdapter);

        contactAdapter.setiOnClickContact(new IOnClickContact() {
            @Override
            public void onClickName(String name) {
                Toast.makeText(getBaseContext(), name, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickPhone(Contact contact) {
                Toast.makeText(getBaseContext(), contact.getPhoneNumber(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}