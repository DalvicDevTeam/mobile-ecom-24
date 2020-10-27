package com.example.shopeIt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vendit.R;
import com.example.shopeIt.adapters.ItemRecyclerAdapter;
import com.example.shopeIt.adapters.OnRecipeListener;
import com.example.shopeIt.util.VerticalSpacingItemDecorator;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ItemRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recipe_list_recyclerView);

    }

    private void initSearchView(){
        final androidx.appcompat.widget.SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
               //...
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


    }
    private void initRecyclerView(){
        mAdapter = new ItemRecyclerAdapter((OnRecipeListener) this);

        VerticalSpacingItemDecorator itemDecorator = new  VerticalSpacingItemDecorator(30);
        mRecyclerView.addItemDecoration(itemDecorator);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
