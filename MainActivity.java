package com.example.retrofitrecyclerhorvercompaginscreen;


import static android.content.ContentValues.TAG;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<ModelVer> data;
    private List<CampaignDataModel> datas;
    private List<ModelHor> data2;
    private PlaceHolderApi apiInterface;
    private ModalVerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView) findViewById(R.id.rec2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));



        Call<List<ModelVer>> call = RetrofitClient.getInstance().getMyApi().getPostsData();
       call.enqueue(new Callback<List<ModelVer>>() {
           @Override
           public void onResponse(Call<List<ModelVer>> call, Response<List<ModelVer>> response) {
               data = response.body();
               for (ModelVer post : data) {
                   String postData = "";
                   postData += "\n" + "Title: = " + post.getTitle() + "\n";
                   postData += "Target : = " + post.getTarget() + "\n";
                   postData += "Raised: = " + post.getRaised() + "\n";
                   postData += "Description: = " + post.getDesc() + "\n";
                   postData += "Compaign Data: = " + post.getCampaign_data() + "\n";
                   Log.i(TAG, "Detail Data  " + postData);

                   data2 = new ArrayList<>();
                   data2.clear();

                   for (int i = 0 ; i < post.getCampaign_data().size(); i++)
                   {
                       Log.i(TAG, "onResponse: "+post.getCampaign_data().get(i).getImage());
                       data2.add(new ModelHor(post.getCampaign_data().get(i).getImage()));
                   }

               }

               adapter =new ModalVerAdapter(data, MainActivity .this, data2);
               rv.setAdapter(adapter);

            }

           @Override
           public void onFailure(Call<List<ModelVer>> call, Throwable t) {

           }
       });












    }
}