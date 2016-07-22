package com.xpmets.bookaway;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class UserAccountInfoActivity extends Fragment {

    private Context context;
    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.content_user_account_info, container, false);
        context = getActivity().getApplicationContext();
        this.mView = v;

        Button editar = (Button) mView.findViewById(R.id.editar_perfil);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editUserAccount();
            }
        });

        return v;
    }

    private void editUserAccount() {
        Intent it = new Intent(context, UserAccountEditActivity.class);
        startActivity(it);
    }
}
