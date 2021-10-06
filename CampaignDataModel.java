package com.example.retrofitrecyclerhorvercompaginscreen;

import com.google.gson.annotations.SerializedName;

public class CampaignDataModel {

        @SerializedName("id")
        private int id;
        @SerializedName("image")
        private String image;
        @SerializedName("campaign")
        private int campaign;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getCampaign() {
            return campaign;
        }

        public void setCampaign(int campaign) {
            this.campaign = campaign;
        }
}
