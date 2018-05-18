package com.naki.Asset;

import java.io.Serializable;

public class AssetDTO implements Serializable {

    private Long id;

    private String type;

    private String value;

    private int asset_order;

    public Long getId(){
        return  id;
    }

    public String getType(){
        return type;
    }

    public String getValue(){
        return value;
    }

    public Integer getAssetOrder() {
        return asset_order;
    }

    public Long setId(){ return id;}

    public String setType(){ return type;}

    public String setValue(){ return value;}

    public Integer setAssetOrder(){ return asset_order;}
}

