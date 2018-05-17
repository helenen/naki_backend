package com.naki.Asset;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AssetMapper {

    AssetDTO assetToAssetDto(Asset asset);
}
