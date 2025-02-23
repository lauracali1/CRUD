package com.thinkconstructive.db_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeId;
    private String storeName;
    private String storeDetail;
    private String storePhoneNumber;

    @Override
    public String toString() {
        return "StoreInformation{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeDetail='" + storeDetail + '\'' +
                ", storePhoneNumber='" + storePhoneNumber + '\'' +
                '}';
    }

    public StoreInformation() {

    }

    public StoreInformation(String storeName, String storeDetail, String storePhoneNumber) {
        this.storeName = storeName;
        this.storeDetail = storeDetail;
        this.storePhoneNumber = storePhoneNumber;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreDetail(String storeDetail) {
        this.storeDetail = storeDetail;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getStoreDetail() {
        return storeDetail;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }


}
