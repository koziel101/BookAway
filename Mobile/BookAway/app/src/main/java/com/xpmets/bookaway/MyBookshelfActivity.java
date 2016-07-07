package com.xpmets.bookaway;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Hiago on 03/07/2016.
 */
public class MyBookshelfActivity extends Fragment {

    private Context context;
    private View mView;
    private boolean sell1 = true, borrow1 = true, exchange1 = true, give1 = true;
    private boolean sell2 = true, borrow2 = true, exchange2 = true, give2 = true;
    private boolean sell3 = true, borrow3 = true, exchange3 = true, give3 = true;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_my_bookshelf, container, false);
        mView = v;
        context = getActivity().getApplicationContext();

        final ImageView livro1 = (ImageView) mView.findViewById(R.id.imagemLivro1);
        livro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionarLivro();
            }
        });

        final ImageView livro2 = (ImageView) mView.findViewById(R.id.imagemLivro2);
        livro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionarLivro();
            }
        });

        final ImageView livro3 = (ImageView) mView.findViewById(R.id.imagemLivro3);
        livro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionarLivro();
            }
        });
        return v;
    }

    @Override
    public void onResume() {

        super.onResume();
        vender1();

    }

    public void vender1() {
        TextView text = (TextView) getActivity().findViewById(R.id.tag_sell_1);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) getActivity().findViewById(R.id.tag_sell_1);
                if (sell1 == true) {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    sell1 = false;
                } else {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_sell));
                    sell1 = true;
                }
            }
        });
    }

    private void selecionarLivro() {
        Intent it = new Intent(context, SelectedBookActivity.class);
        startActivity(it);
    }
}
