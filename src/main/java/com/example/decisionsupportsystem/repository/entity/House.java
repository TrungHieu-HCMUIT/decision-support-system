package com.example.decisionsupportsystem.repository.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("house")
@Getter
@Setter
public class House {
    @Id
    String id;

    @Field("item_id")
    String itemId;
    Integer deposit;
    @Field("monthly_rent")
    Integer monthlyRent;
    @Field("district_uuid")
    String districtUuid;
    @Field("room_qty")
    Integer roomQty;
    @Field("unit_area")
    Integer unitArea;
    @Field("has_elevator")
    Boolean hasElevator;
    @Field("building_floor_count")
    Integer buildingFloorCount;
    @Field("unit_floor")
    Integer unitFloor;
    @Field("has_storage_area")
    Boolean hasStorageArea;
    @Field("property_age")
    Integer propertyAge;
}
