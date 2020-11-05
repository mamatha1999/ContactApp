package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        final List<ContactModel> work=new ArrayList<>();
        work.add(new ContactModel("AD","A@gamil.com", "9542110000"));
        work.add(new ContactModel("BT","B@gamil.com", "947520212021"));
        work.add(new ContactModel("CE","C@gamil.com", "997532105355"));
        work.add(new ContactModel("DE","D@gamil.com", "994478565663"));
        work.add(new ContactModel("EY","E@gamil.com", "99475252022"));
        work.add(new ContactModel("FE","F@gamil.com", "999255536533"));
        work.add(new ContactModel("GPP","G@gamil.com", "95474751532"));
        work.add(new ContactModel("HHYH","H@gamil.com", "77551365322" ));
        work.add(new ContactModel("ICFH","I@gamil.com", "47554322333"));
        work.add(new ContactModel("JDE5T","J@gamil.com", "755353633333"));

        RecyclerView work_recyclerView=findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        work_recyclerView.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter=new ContactAdapter(this,work,R.color.category_work);
        work_recyclerView.setAdapter(contactAdapter);
    }
}