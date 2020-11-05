package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        final List<ContactModel> friends=new ArrayList<>();
        friends.add(new ContactModel("RA", "R@gamil.com", "75454456653"));
        friends.add(new ContactModel("PA", "P@gamil.com", "63215153512"));
        friends.add(new ContactModel("OA", "O@gamil.com", "776541232233"));
        friends.add(new ContactModel("TA", "T@gamil.com", "366655575033"));
        friends.add(new ContactModel("UA", "U@gamil.com", "5564476324222"));
        friends.add(new ContactModel("VA", "V@gamil.com", "9900999905"));
        friends.add(new ContactModel("WA", "W@gamil.com", "98869414324"));
        friends.add(new ContactModel("XA", "X@gamil.com", "99785120333"));
        friends.add(new ContactModel("YA", "Y@gamil.com", "995525455225"));
        friends.add(new ContactModel("ZA", "Z@gamil.com", "990095563663"));

        RecyclerView friends_recyclerView=findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        friends_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,friends,R.color.category_friends);
        friends_recyclerView.setAdapter(contactAdapter);
    }
}