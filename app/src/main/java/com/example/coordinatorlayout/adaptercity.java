package com.example.coordinatorlayout;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class adaptercity extends RecyclerView.Adapter<adaptercity.ViewHolder> {

    private List<datamodel> data;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private ImageView imgs;
    public Context context;
    // data is passed into the constructor
    adaptercity(Context context, List<datamodel> data) {
     this.context=context;
       this.data=data;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlestateview, parent, false);
        context=parent.getContext();

        return new ViewHolder(view);


    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        String name=data.get(position).getName();
        int pic=data.get(position).getImage();

        holder.setdesctext(name);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return data.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;

        private View mview;
        ViewHolder(View itemView) {
            super(itemView);


            itemView.setOnClickListener(this);
            mview=itemView;
        } public void setdesctext(String des)
        {
            myTextView=mview.findViewById(R.id.tvtime);
            myTextView.setText(des);

        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        return data.get(id).toString();
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}