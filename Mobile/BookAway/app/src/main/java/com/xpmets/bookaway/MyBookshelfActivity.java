package com.xpmets.bookaway;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MyBookshelfActivity extends Fragment {

    private Context context;
    private View mView;
    private boolean flagSell = true, flagBorrow = true, flagExchange = true, flagGive = true;
    private List<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BookAdapter mAdapter;
    private List<Book> livros;
    int id;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_my_bookshelf, container, false);
        mView = v;
        final LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView = (RecyclerView) mView.findViewById(R.id.recyclerview);
        context = getActivity().getApplicationContext();
        recyclerView.setLayoutManager(layoutManager);
        //initializeData();
        //BookAdapter mAdapter = new BookAdapter(this.livros);
        //recyclerView.setAdapter(mAdapter);
        //mAdapter.onCreateViewHolder(container, 1);
        return v;
    }

    private void initializeData() {
        livros = new ArrayList<>();
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
        livros.add(novoLivro());
    }

    private Book novoLivro() {
        Book livro = new Book("Livro", "Xpmets");
        return livro;
    }
}

