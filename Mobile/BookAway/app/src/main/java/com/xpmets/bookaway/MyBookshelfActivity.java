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
    private boolean flagSell1 = true, flagBorrow1 = true, flagExchange1 = true, flagGive1 = true;
    private boolean flagSell2 = true, flagBorrow2 = true, flagExchange2 = true, flagGive2 = true;
    private boolean flagSell3 = true, flagBorrow3 = true, flagExchange3 = true, flagGive3 = true;

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
        livro1();
        livro2();
        livro3();

    }

    public void livro1() {
        TextView textSell1 = (TextView) getActivity().findViewById(R.id.tag_sell_1);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textSell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) getActivity().findViewById(R.id.tag_sell_1);
                if (flagSell1 == true) {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagSell1 = false;
                } else {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_sell));
                    flagSell1 = true;
                }
            }
        });

        TextView textExchange1 = (TextView) getActivity().findViewById(R.id.tag_exchange_1);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textExchange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_exchange_1);
                if (flagExchange1 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagExchange1 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_exchange));
                    flagExchange1 = true;
                }
            }
        });


        TextView textGive1 = (TextView) getActivity().findViewById(R.id.tag_give_1);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textGive1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_give_1);
                if (flagGive1 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagGive1 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_give_away));
                    flagGive1 = true;
                }
            }
        });

        TextView textBorrow = (TextView) getActivity().findViewById(R.id.tag_borrow_1);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_borrow_1);
                if (flagBorrow1 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagBorrow1 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_borrow));
                    flagBorrow1 = true;
                }
            }
        });
    }

    public void livro2() {
        TextView textSell2 = (TextView) getActivity().findViewById(R.id.tag_sell_2);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textSell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) getActivity().findViewById(R.id.tag_sell_2);
                if (flagSell2 == true) {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagSell2 = false;
                } else {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_sell));
                    flagSell2 = true;
                }
            }
        });

        TextView textExchange2 = (TextView) getActivity().findViewById(R.id.tag_exchange_2);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textExchange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_exchange_2);
                if (flagExchange2 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagExchange2 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_exchange));
                    flagExchange2 = true;
                }
            }
        });


        TextView textGive2 = (TextView) getActivity().findViewById(R.id.tag_give_2);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textGive2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_give_2);
                if (flagGive2 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagGive2 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_give_away));
                    flagGive2 = true;
                }
            }
        });

        TextView textBorrow = (TextView) getActivity().findViewById(R.id.tag_borrow_2);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_borrow_2);
                if (flagBorrow2 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagBorrow2 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_borrow));
                    flagBorrow2 = true;
                }
            }
        });
    }

    public void livro3() {
        TextView textSell3 = (TextView) getActivity().findViewById(R.id.tag_sell_3);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textSell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) getActivity().findViewById(R.id.tag_sell_3);
                if (flagSell3 == true) {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagSell3 = false;
                } else {
                    text.setBackground(getResources().getDrawable(R.drawable.tag_sell));
                    flagSell3 = true;
                }
            }
        });

        TextView textExchange3 = (TextView) getActivity().findViewById(R.id.tag_exchange_3);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textExchange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_exchange_3);
                if (flagExchange3 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagExchange3 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_exchange));
                    flagExchange3 = true;
                }
            }
        });


        TextView textGive3 = (TextView) getActivity().findViewById(R.id.tag_give_3);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textGive3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_give_3);
                if (flagGive3 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagGive3 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_give_away));
                    flagGive3 = true;
                }
            }
        });

        TextView textBorrow = (TextView) getActivity().findViewById(R.id.tag_borrow_3);
        //Cria um listener para um botao que vai diretamente na SettingsActivity
        textBorrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView t = (TextView) getActivity().findViewById(R.id.tag_borrow_3);
                if (flagBorrow3 == true) {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_unmarked));
                    flagBorrow3 = false;
                } else {
                    t.setBackground(getResources().getDrawable(R.drawable.tag_borrow));
                    flagBorrow3 = true;
                }
            }
        });
    }

    private void selecionarLivro() {
        Intent it = new Intent(context, SelectedBookActivity.class);
        startActivity(it);
    }
}
