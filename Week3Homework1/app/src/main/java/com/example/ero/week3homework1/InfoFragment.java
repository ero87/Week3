package com.example.ero.week3homework1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        final TextView textInfo = view.findViewById(R.id.name_info);
    //    final ImageView infoImage = view.findViewById(R.id.infoImage);

        if (getArguments() != null && getArguments().getString(MessengeAdapter.KAY88) != null) {

            String att = getArguments().getString(MessengeAdapter.KAY88);
          //  String fgg = getArguments().getString(MessengeAdapter.KAY77);
            textInfo.setText(att);
          // Picasso.get().load(fgg).into(infoImage);

        }
        return view;
    }

}
