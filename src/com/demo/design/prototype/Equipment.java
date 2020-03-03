package com.demo.design.prototype;

import com.alibaba.fastjson.JSON;

public class Equipment implements IClone<Equipment> {
    private String equipNo;
    private String color;
    private String productionDate;


    public Equipment deepClone() {
        return JSON.parseObject(JSON.toJSONString(this), Equipment.class);
    }

    public String getEquipNo() {
        return equipNo;
    }

    public void setEquipNo(String equipNo) {
        this.equipNo = equipNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipNo='" + equipNo + '\'' +
                ", color='" + color + '\'' +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }
}
