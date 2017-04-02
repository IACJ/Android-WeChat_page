package com.example.experience1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by apple1 on 2017/3/31.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder>{
    private List<Message> messagesList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View messageView;
        ImageView messageImage;
        TextView messageNickName;
        TextView messageContent;
        TextView messageTime;

        public ViewHolder (View view){
            super(view);
            messageView = view;
            messageImage = (ImageView) view.findViewById(R.id.image);
            messageNickName = (TextView) view.findViewById(R.id.nickName);
            messageContent = (TextView) view.findViewById(R.id.content);
            messageTime = (TextView) view.findViewById(R.id.time);
        }
    }

    public MessageAdapter (List<Message> messagesLsit){
        this.messagesList = messagesLsit;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.messageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Message message = messagesList.get(position);
                MyToast.showToast(v.getContext(), "你点击了 "+message.getNickName()+" 的消息");
            }
        });

        holder.messageImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Message message = messagesList.get(position);
                MyToast.showToast(v.getContext(), "你点击了 "+message.getNickName()+" 的头像");
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Message message = messagesList.get(position);
        holder.messageImage.setImageResource(message.getImageId());
        holder.messageNickName.setText(message.getNickName());
        holder.messageContent.setText(message.getContent());
        holder.messageTime.setText(message.getTime());
    }

    @Override
    public int getItemCount() {
        return messagesList.size();
    }
}
