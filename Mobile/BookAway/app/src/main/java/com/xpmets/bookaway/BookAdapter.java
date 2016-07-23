package com.xpmets.bookaway;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.support.v7.widget.RecyclerView.ViewHolder;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    ArrayList<Book> boooksList;
    Context context;
    private View mView;

    public class MyViewHolder extends ViewHolder {
        public TextView titulo, autor;
        public boolean vender, trocar, doar, emprestar;
        public ImageView capa;

        public MyViewHolder(View view) {
            super(view);
            titulo = (TextView) view.findViewById(R.id.title);
            autor = (TextView) view.findViewById(R.id.autor);
            capa = (ImageView) view.findViewById(R.id.capa);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.book, parent, false);
        MyViewHolder x = new MyViewHolder(v);
        return x;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Book book = boooksList.get(position);
        holder.titulo.setText(book.getTitulo());
        holder.autor.setText(book.getAutor());
    }

    @Override
    public int getItemCount() {
        return boooksList.size();
    }
}

