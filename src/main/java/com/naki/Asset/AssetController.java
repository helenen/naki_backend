package com.naki.Asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssetController {


    @Autowired
    private AssetService assetService;


    //@GetMapping("/assets")
    //public List<Asset> getAllAssets() {
        //return AssetService.listAllAssets();
    //}
}
