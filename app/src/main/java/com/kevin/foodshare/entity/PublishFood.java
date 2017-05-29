package com.kevin.foodshare.entity;

import java.io.Serializable;

/**
 * Created by zhangchao_a on 2017/5/29.
 * 发布美食实体类
 */

public class PublishFood implements Serializable {

    private String foodName;
    private String coverImg;
    private String ingredient;
    private int price;
    private Type type;
    private boolean isConnect;
    private boolean isRandomBuy;
    private boolean isLimitePeopleCount;
    private boolean isDeliverHome;
    private boolean isTimeLimite;
    private boolean isUseTemplate;

    public enum Type{
        BAKING,SOUP,
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isConnect() {
        return isConnect;
    }

    public void setConnect(boolean connect) {
        isConnect = connect;
    }

    public boolean isRandomBuy() {
        return isRandomBuy;
    }

    public void setRandomBuy(boolean randomBuy) {
        isRandomBuy = randomBuy;
    }

    public boolean isLimitePeopleCount() {
        return isLimitePeopleCount;
    }

    public void setLimitePeopleCount(boolean limitePeopleCount) {
        isLimitePeopleCount = limitePeopleCount;
    }

    public boolean isDeliverHome() {
        return isDeliverHome;
    }

    public void setDeliverHome(boolean deliverHome) {
        isDeliverHome = deliverHome;
    }

    public boolean isTimeLimite() {
        return isTimeLimite;
    }

    public void setTimeLimite(boolean timeLimite) {
        isTimeLimite = timeLimite;
    }

    public boolean isUseTemplate() {
        return isUseTemplate;
    }

    public void setUseTemplate(boolean useTemplate) {
        isUseTemplate = useTemplate;
    }
}
