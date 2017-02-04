package com.lasemcode.contact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by lasemcode on 04/02/17.
 */

public class ContactActivity extends AppCompatActivity {

    private RecyclerView contactList;
    private ContactAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_activity);

        contactList = (RecyclerView) findViewById(R.id.contact_list);

        adapter = new ContactAdapter(this);

        contactList.setLayoutManager(new LinearLayoutManager(this));
        contactList.setItemAnimator(new DefaultItemAnimator());
        contactList.setAdapter(adapter);

        adapter.addItems(Contact.getContact());

    }
}
