package com.example.ero.week3homework1;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessengFragment extends Fragment {

    public MessengFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_messeng, container, false);
        final List<MessengeModel> itemList = new ArrayList<>();


        final MessengeAdapter messengeAdapter = new MessengeAdapter(itemList, getActivity());
        RecyclerView recyclerView = view.findViewById(R.id.recycler2_id);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(messengeAdapter);

        final TextView textUser = view.findViewById(R.id.fragment2_name);
        final CircleImageView userImage = view.findViewById(R.id.fragment2_image);

        final String arg;
        final String argImage;

        if (getArguments() != null && getArguments().getString(ChatAdapter.KAY) != null
                && getArguments().getString(ChatAdapter.KAYIMAGE) != null) {
            arg = getArguments().getString(ChatAdapter.KAY);
            argImage = getArguments().getString(ChatAdapter.KAYIMAGE);
            textUser.setText(arg);
            Picasso.get().load(argImage).into(userImage);

            FloatingActionButton fab = view.findViewById(R.id.fab);
            final EditText editText = view.findViewById(R.id.editText);

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String myStr = editText.getText().toString();
                    itemList.add(new MessengeModel("My", myStr, true));
                    messengeAdapter.notifyDataSetChanged();
                    editText.setText(null);
                    itemList.add(new MessengeModel(textUser.getText().toString(), myStr, false));
                    messengeAdapter.notifyDataSetChanged();
                }
            });

        }
        return view;
    }

}
