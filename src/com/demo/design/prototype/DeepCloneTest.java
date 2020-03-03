package com.demo.design.prototype;

public class DeepCloneTest {
    public static void main(String[] args) {
        Equipment equip = new Equipment();
        equip.setEquipNo("888");
        equip.setColor("橙色");
        equip.setProductionDate("2020-03-01");


        System.out.println(equip);

        Equipment equipCloned = equip.deepClone();
        System.out.println(equipCloned);
        System.out.println(equip == equipCloned);
    }
}
