package com.haruntasci.recyclerviewgridproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PhysicsAdapter adapter;
    private List<Physicists> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        myList = new ArrayList<>();

        myList.add(new Physicists(R.drawable.einstein,"Albert Einstein"));
        myList.add(new Physicists(R.drawable.galileo,"Galileo"));
        myList.add(new Physicists(R.drawable.newton,"Isaac Newton"));
        myList.add(new Physicists(R.drawable.tesla,"Nikola Tesla"));
        myList.add(new Physicists(R.drawable.einstein,"Albert Einstein"));
        myList.add(new Physicists(R.drawable.galileo,"Galileo"));
        myList.add(new Physicists(R.drawable.newton,"Isaac Newton"));
        myList.add(new Physicists(R.drawable.tesla,"Nikola Tesla"));
        myList.add(new Physicists(R.drawable.einstein,"Albert Einstein"));
        myList.add(new Physicists(R.drawable.galileo,"Galileo"));
        myList.add(new Physicists(R.drawable.newton,"Isaac Newton"));
        myList.add(new Physicists(R.drawable.tesla,"Nikola Tesla"));



        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new PhysicsAdapter(myList);
        recyclerView.setAdapter(adapter);





    }
}