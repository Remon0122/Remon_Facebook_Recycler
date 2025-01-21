package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ContactRecyclerAdapter extends RecyclerView.Adapter<ContactRecyclerAdapter.ViewHolder>{

    List<Content> contentList;

    ContactRecyclerAdapter(List<Content> contactList){
        this.contentList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Content contact = contentList.get(position);

        holder.name.setText(contact.name);
        holder.date.setText(contact.states);
        holder.imageView.setImageResource(contact.Image);
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView date;
        ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.tvUsername);
            date = itemView.findViewById(R.id.tvTimestamp);
            imageView = itemView.findViewById(R.id.ivProfile);
        }
    }
}
