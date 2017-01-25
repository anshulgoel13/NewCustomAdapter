package com.example.anshulgoel.tryyyy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anshul goel on 1/17/2017.
 */

 class customadapter extends ArrayAdapter<String> {
    public customadapter(Context context, String[]  food) {
        super(context,R.layout.custom_row, food);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater =LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.custom_row,parent,false);
        String fooditem = getItem(position);
        TextView textView = (TextView)customView.findViewById(R.id.textView_id)
                ;
        ImageView imageView = (ImageView)customView.findViewById(R.id.imageView3);
        textView.setText(fooditem);
        imageView.setImageResource(R.drawable.serpinski_square);
        return customView;
    }
}

