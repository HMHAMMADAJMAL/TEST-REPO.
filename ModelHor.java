package com.example.retrofitrecyclerhorvercompaginscreen;


import com.google.gson.annotations.SerializedName;

public class ModelHor {


    @SerializedName("image")
    private String ChildItemImage;
    public ModelHor(String childItemImage)
    {

        this.ChildItemImage=childItemImage;
    }

    public String getChildItemImage()
    {
        return ChildItemImage;
    }
    public void setChildItemImage(String childItemImage)
    {
        ChildItemImage = childItemImage;
    }


}