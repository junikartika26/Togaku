package com.example.togaku.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.togaku.Detail;
import com.example.togaku.R;
import com.example.togaku.model.Toga;

import java.util.ArrayList;

public class ListTogaAdapter extends RecyclerView.Adapter<ListTogaAdapter.ListViewHolder>{
    private ArrayList<Toga> listToga;
    //private Context context;

    private OnItemClickCallback onItemClickCallback;

    public ListTogaAdapter(ArrayList<Toga>list){
        this.listToga = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_toga, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
       Toga toga = listToga.get(position);
        Glide.with(holder.itemView.getContext())
                .load(toga.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(toga.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listToga.get(holder.getAdapterPosition()));

              /*  Bundle bundle = new Bundle();
                bundle.putString("detailNama", listToga.get(position).getName());
                bundle.putString("detailIsi",  listToga.get(position).getDetail());
                bundle.putInt("detailImage", listToga.get(position).getPhoto());

                Intent intent = new Intent(v.getContext(), Detail.class);
                intent.putExtras(bundle);
                context.startActivity(intent); */
            }

        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Toga data);
    }

    @Override
    public int getItemCount() {
        return listToga.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto; TextView tvName;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }

}

