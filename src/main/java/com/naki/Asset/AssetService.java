package com.naki.Asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    @Autowired(required=true)
    private AssetRepository assetRepository;

    public List<Asset> listAllAssets() {
        System.out.println("Before finding all assets");
        return assetRepository.findAll();
    }
}
