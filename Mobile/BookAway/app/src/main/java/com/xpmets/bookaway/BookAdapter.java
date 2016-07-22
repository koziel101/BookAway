package com.xpmets.bookaway;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hiago on 22/07/2016.
 */

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.MyViewHolder> {

    private List<Book> boooksList;

    public BookAdapter(List<Book> booksList) {
        this.boooksList = boooksList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_book, parent, false);

        return new MyViewHolder(itemView);
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

    public class MyViewHolder extends RecyclerView.ViewHolder {
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
}

