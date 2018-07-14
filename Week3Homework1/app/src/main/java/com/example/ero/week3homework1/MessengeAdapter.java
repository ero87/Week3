package com.example.ero.week3homework1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessengeAdapter extends RecyclerView.Adapter<MessengeAdapter.MyViewHolder> {

    public static final String KAY88 = "Mkay";
 //   public static final String KAY77 = "Mkay9";


    private List<MessengeModel> list;
    private Context context;

    public MessengeAdapter(List<MessengeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MessengeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.messeng_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MessengeAdapter.MyViewHolder holder, final int position) {
        final MessengeModel messengeModel = list.get(position);

        Picasso.get().load(messengeModel.getImageMessenge()).into(holder.imageMessenge);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final InfoFragment infoFragment = new InfoFragment();
                ((ChatActivity) context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fr_container, infoFragment)
                        .commit();
                Bundle bundle = new Bundle();
                bundle.putString(KAY88, messengeModel.getNameMessenge());
   //             bundle.putString(KAY77, messengeModel.getImageMessenge());
                infoFragment.setArguments(bundle);

            }
        });

        holder.itsMe = messengeModel.isItsMy();
        if (holder.itsMe) {
            holder.me.setText(messengeModel.getNameMessenge());
            holder.myText.setText(messengeModel.getMassage());
            holder.imageMessenge.setVisibility(View.GONE);

        } else {
            holder.textMessege.setText(messengeModel.getNameMessenge());
            holder.messeng.setText(messengeModel.getMassage());
            holder.imageMessenge.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageMessenge;
        private final TextView textMessege;
        private final TextView messeng;
        Boolean itsMe;
        private final TextView me;
        private final TextView myText;

        public MyViewHolder(View itemView) {
            super(itemView);
            textMessege = itemView.findViewById(R.id.name_chat_id);
            imageMessenge = itemView.findViewById(R.id.image_chat_id);
            messeng = itemView.findViewById(R.id.message_chat_id);
            me = itemView.findViewById(R.id.me);
            myText = itemView.findViewById(R.id.my_message_id);
        }
    }
}
