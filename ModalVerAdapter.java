package com.example.retrofitrecyclerhorvercompaginscreen;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ModalVerAdapter extends RecyclerView.Adapter<ModalVerAdapter.ChildViewHolder> {

    Context context;



    private static final String TAG = "ModalVerAdapter";


    List<ModelVer> data;
    List<ModelHor> data2;


    public ModalVerAdapter(List<ModelVer> data, Context context,List<ModelHor> data2) {
        this.data = data;
        this.context = context;
        this.data2=data2;
    }
    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vertical_rec, viewGroup, false);
        return new ChildViewHolder(view);

    }
    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder childViewHolder, int position)
    {
        ChildViewHolder myHolder= (ChildViewHolder) childViewHolder;
        childViewHolder.Titles.setText(data.get(position).getTitle());
        childViewHolder.Targets.setText(data.get(position).getTarget());
        childViewHolder.Raiseds.setText(data.get(position).getRaised());
        childViewHolder.Descriptions.setText(data.get(position).getDesc());

        ModalHorAdapter modalHorAdapter = new ModalHorAdapter(data2);
        childViewHolder.recyclerViewHor.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        childViewHolder.recyclerViewHor.setAdapter(modalHorAdapter);


    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }


    




    class ChildViewHolder extends RecyclerView.ViewHolder {



        TextView Titles,Targets,Raiseds,Descriptions,btn;
        RecyclerView recyclerViewHor;

        ChildViewHolder(View itemView)
        {
            super(itemView);

            recyclerViewHor = itemView.findViewById(R.id.rec1);
            Titles=itemView.findViewById(R.id.titles);
            Targets=itemView.findViewById(R.id.target);
            Raiseds=itemView.findViewById(R.id.raised);
            Descriptions=itemView.findViewById(R.id.des);

            btn=itemView.findViewById(R.id.btn);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if( btn.getText().toString().equalsIgnoreCase("more"))
                    {
                        Descriptions.setMaxLines(Integer.MAX_VALUE);
                        btn.setText("Showless");
                    }
                    else
                    {
                        Descriptions.setMaxLines(3);
                        btn.setText("more");
                    }

                }
            });
        }
    }
}