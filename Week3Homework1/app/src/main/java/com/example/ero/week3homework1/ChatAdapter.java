package com.example.ero.week3homework1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolder> {

    public static final String KAY = "My kay";
    public static final String KAYIMAGE = "My kay image";

    private List<ChatModel> list;
    private Context context;

    public ChatAdapter(List<ChatModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ChatAdapter.MyViewHolder holder, int position) {
        final ChatModel chatModel = list.get(position);
        holder.chatName.setText(chatModel.getNameSurname());
        holder.status.setText(chatModel.getStatus());
        Picasso.get().load(chatModel.getImageChatId()).into(holder.chatImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               MessengFragment messengFragment = new MessengFragment();

                ((ChatActivity)context).getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fr_container, messengFragment)
                        .commit();
                Bundle bundle = new Bundle();
                bundle.putString(KAY,chatModel.getNameSurname());
                bundle.putString(KAYIMAGE,chatModel.getImageChatId());
                messengFragment.setArguments(bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView chatName;
        private final TextView status;
        private final CircleImageView chatImage;

        public MyViewHolder(View itemView) {
            super(itemView);
            chatImage = itemView.findViewById(R.id.circleImage);
            chatName = itemView.findViewById(R.id.name_surname);
            status = itemView.findViewById(R.id.status);

        }
    }
}
