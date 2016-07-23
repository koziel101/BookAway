package com.xpmets.bookaway;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hiago on 03/07/2016.
 */
public class MyBookshelfActivity extends Fragment {

    private Context context;
    private View mView;
    private boolean flagSell = true, flagBorrow = true, flagExchange = true, flagGive = true;
    private List<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BookAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_my_bookshelf, container, false);
        mView = v;
        context = getActivity().getApplicationContext();

        final ImageView livro1 = (ImageView) mView.findViewById(R.id.capa);
        livro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionarLivro();
            }
        });

        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) mView.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) getView().findViewById(R.id.recycler_view);

        mAdapter = new BookAdapter(bookList);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Book book = bookList.get(position);
                Toast.makeText(getActivity().getApplicationContext(), book.getTitulo() + " is selected!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();

    }

    private void prepareMovieData() {
//        String titulo, String autor, boolean vender, boolean trocar, boolean doar, boolean emprestar, ImageView capa
        Book book = new Book("Harry Potter", "J. K. Rownling", true, true, true, true);
        bookList.add(book);

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onResume() {

        super.onResume();
        livro();
    }

    public void livro() {
        TextView textSell = (TextView) getActivity().findViewById(R.id.tag_sell);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) getActivity().findViewById(R.id.tag_sell);
                if (flagSell == true) {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagSell = false;
                } else {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_sell));
                    flagSell = true;
                }
            }
        });

        TextView textExchange = (TextView) getActivity().findViewById(R.id.tag_exchange);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textExchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_exchange);
                if (flagExchange == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagExchange = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_exchange));
                    flagExchange = true;
                }
            }
        });


        TextView textGive = (TextView) getActivity().findViewById(R.id.tag_give);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textGive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_give);
                if (flagGive == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagGive = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_give_away));
                    flagGive = true;
                }
            }
        });

        TextView textBorrow = (TextView) getActivity().findViewById(R.id.tag_borrow);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_borrow);
                if (flagBorrow == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagBorrow = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_borrow));
                    flagBorrow = true;
                }
            }
        });
    }

    private void selecionarLivro() {
        Intent it = new Intent(context, SelectedBookActivity.class);
        startActivity(it);
    }
}
