package com.example.subeksha.shopar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SUBEKSHA on 10/7/16.
 */
public class AdapterHome extends RecyclerView.Adapter<AdapterHome.RecyclerViewHolder> {
    ArrayList<BrandHome> arrayList = new ArrayList<BrandHome>();

    Context ctx;



    public AdapterHome(ArrayList<BrandHome> arrayList, Context ctx)
    {
        this.arrayList = arrayList;
        this.ctx= ctx;

    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_home, parent, false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view, ctx, arrayList);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        BrandHome BrandHome = arrayList.get(position);

        holder.imageView.setImageResource(BrandHome.getImg_res());
        holder.imageView2.setImageResource(BrandHome.getImg2_res());
        holder.f_name_home.setText(BrandHome.getF_name_home());
    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        ImageView imageView;
        ImageView imageView2;
        TextView f_name_home;
        TextView textView;
        ArrayList<BrandHome> arrayList = new ArrayList<BrandHome>();
        Context ctx;



        public RecyclerViewHolder(View view,  Context ctx, ArrayList<BrandHome> arrayList) {
            super(view);
            this.arrayList = arrayList;
            this.ctx = ctx;
            view.setOnClickListener(this);
            imageView = (ImageView) view.findViewById(R.id.img);
            imageView2 = (ImageView) view.findViewById(R.id.img2);
            f_name_home = (TextView) view.findViewById(R.id.f_name_home);
            //textView = (TextView) view.findViewById(R.id.s_name);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            BrandHome arrayList = this.arrayList.get(position);
            Intent intent = new Intent (this.ctx, StoreDetails.class);
            intent.putExtra("img_id", arrayList.getImage_id());
            intent.putExtra("img2_id", arrayList.getImage2_id());
            intent.putExtra("trial", arrayList.getTextView());
            intent.putExtra("try", arrayList.getF_name_home());
            this.ctx.startActivity(intent);


        }
    }

    public void setFilter(ArrayList<BrandHome> newList)
    {
        arrayList = new ArrayList<>();
        arrayList.addAll(newList);
        notifyDataSetChanged();

    }

}


