package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleList extends RecyclerView.Adapter<SimpleList.innerclass> {
    Context c;
    String []name;

    public SimpleList(Context c, String[] name) {
        this.c = c;
        this.name = name;
    }

    @NonNull
    @Override
    public innerclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.layouthelper,parent,false);
        return new innerclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull innerclass holder, int position) {
        String title=name[position];
        holder.textView.setText(title);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class innerclass extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public innerclass(@NonNull View view) {
            super(view);
            textView= itemView.findViewById(R.id.txt);
            imageView=itemView.findViewById(R.id.img);
        }
    }
}
