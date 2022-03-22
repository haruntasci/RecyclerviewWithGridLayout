package com.haruntasci.recyclerviewgridproject;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PhysicsAdapter extends RecyclerView.Adapter<PhysicsAdapter.PhysicistHolder> {
    private List<Physicists> myList;

    public PhysicsAdapter(List<Physicists> myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public PhysicistHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.container_layout,parent,false);
        return new PhysicistHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhysicistHolder holder, int position) {

        holder.imageView.setImageResource(myList.get(position).getImage());
        holder.textView.setText(myList.get(position).getName());
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                myList.remove(holder.getAdapterPosition());
                notifyItemRemoved(holder.getAdapterPosition());

                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class PhysicistHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public PhysicistHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.name_text);
        }
    }
}
