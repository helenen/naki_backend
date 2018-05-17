package com.naki.Asset;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AssetMapper {

    AssetDTO assetToAssetDto(Asset asset);
}
