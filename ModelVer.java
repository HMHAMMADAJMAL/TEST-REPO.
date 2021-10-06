package com.example.retrofitrecyclerhorvercompaginscreen;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelVer {

    @SerializedName("title")
    private String Title;
    @SerializedName("target_amount")
    private String Target;
    @SerializedName("raised_amount")
    private String Raised;
    @SerializedName("detail")
    private String Desc;

    @SerializedName("campaign_data")
    private List<CampaignDataModel> campaign_data;



    public ModelVer(String Title, String Target, String Raised, String Desc)
    {
        this.Title=Title;
        this.Target=Target;
        this.Raised=Raised;
        this.Desc=Desc;
    }
    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String title)
    {
        Title = title;
    }
    public String getTarget()
    {
        return Target;
    }

    public void setTarget(String target)
    {
        Target = target;
    }
    public String getRaised()
    {
        return Raised;
    }

    public void setRaised(String raised)
    {
        Raised = raised;
    }
    public String getDesc()
    {
        return Desc;
    }

    public void setDesc(String desc)
    {
        Desc = Desc;
    }

    public List<CampaignDataModel> getCampaign_data() {
        return campaign_data;
    }

    public void setCampaign_data(List<CampaignDataModel> campaign_data) {
        this.campaign_data = campaign_data;
    }
}