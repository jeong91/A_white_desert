package com.wd.model.vo.weapon;

/**
 * 모든 무기의 기초 클래스
 */
public class Weapon {

    private String weaponName; // 무기 이름
    private int attackPower; // 무기 공격력
    private int durabillity; // 무기 내구성
    private int weaponRange; // 무기 사거리

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDurabillity() {
        return durabillity;
    }

    public void setDurabillity(int durabillity) {
        this.durabillity = durabillity;
    }

    public int getWeaponRange() {
        return weaponRange;
    }

    public void setWeaponRange(int weaponRange) {
        this.weaponRange = weaponRange;
    }
}
