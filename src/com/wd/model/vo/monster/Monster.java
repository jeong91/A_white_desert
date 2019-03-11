package com.wd.model.vo.monster;

/**
 * 몬스터의 기초 클래스
 */
public class Monster {

    private String name = "크자카"; // 몬스터 이름
    private int hp = 100; // hp
    private int attackPower = 10; // 공격력
    private int defensivePower = 10; // 방어력
    private int status = 1; // 몬스터 상태 (0:죽음 / 1:디폴트 / 2:무적 / 3:기절)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensivePower() {
        return defensivePower;
    }

    public void setDefensivePower(int defensivePower) {
        this.defensivePower = defensivePower;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
