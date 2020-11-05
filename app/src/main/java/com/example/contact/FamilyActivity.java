package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final List<ContactModel> family=new ArrayList<>();
        family.add(new ContactModel("MAMATHA", "AA@gmail.com", "8974242300"));
        family.add(new ContactModel("NEHA", "AB@gmail.com", "4554453255555"));
        family.add(new ContactModel("NIHARIKA", "AC@gmail.com", "87978946454"));
        family.add(new ContactModel("NAVYA", "AD@gmail.com", "454442431111"));
        family.add(new ContactModel("PAVANA", "AE@gmail.com", "9990009995"));
        family.add(new ContactModel("KUSUMA", "AF@gmail.com", "89784561212"));
        family.add(new ContactModel("KRISHNA", "AG@gmail.com", "79897574245"));
        family.add(new ContactModel("MOHAN", "AH@gmail.com", "798454564646"));
        family.add(new ContactModel("PRIYA", "AI@gmail.com", "754656312142614"));
        family.add(new ContactModel("SUHAS", "AJ@gmail.com", "5754522314244"));

        RecyclerView family_recyclerView=findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        family_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,family,R.color.category_family);
        family_recyclerView.setAdapter(contactAdapter);
    }
}