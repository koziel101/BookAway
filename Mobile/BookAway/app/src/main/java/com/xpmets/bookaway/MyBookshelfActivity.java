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

/**
 * Created by Matheus on 03/07/2016.
 */
public class MyBookshelfActivity extends Fragment {

    private Context context;
    private View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.content_my_bookshelf,container,false);
        mView = v;
        context = getActivity().getApplicationContext();

        final ImageView livro = (ImageView) mView.findViewById(R.id.imagemLivro);
        livro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionarLivro();
            }
        });

        return v;
    }

    private void selecionarLivro(){
        Intent it = new Intent(context, SelectedBookActivity.class);
        startActivity(it);
    }
}
