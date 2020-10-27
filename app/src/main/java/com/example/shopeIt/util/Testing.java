package com.example.shopeIt.util;

import android.util.Log;

import com.example.shopeIt.models.Item;

import java.util.List;

public class Testing {
    public static void printRecipes(List<Item> list , String tag){
        if (list != null){
            for (Item item:list){
                Log.d(tag, "onChanged: SUCCESS" + item.getTitle());
            }
        }
    }
}
