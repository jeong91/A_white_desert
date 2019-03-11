package com.wd.model.vo.character;

import com.wd.model.vo.skill.Skill;
import com.wd.model.vo.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * 모든 캐릭터의 기초 클래스
 */
public class Character {

    private String nickName; // 캐릭터 이름
    private int level = 1; // level
    private int hp = 100; // hp
    private int mp = 100; // mp
    private int attackPower; // 공격력
    private int defensivePower; // 방어력
    private int status = 1; // 캐릭터 상태 (0:죽음 / 1:디폴트 / 2:무적 / 3:기절)
    private String tribeName; // 종족 이름
    private List<Skill> skills = new ArrayList<>(); // 보유 스킬 리스트 (0:종족 스킬 / 1:직업 스킬)
    private Weapon weapon; // 장착 무기


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
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

    public String getTribeName() {
        return tribeName;
    }

    public void setTribeName(String tribeName) {
        this.tribeName = tribeName;
        System.out.println(tribeName + "종족 선택 완료");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Skill skill) {
        this.skills.add(skill);
    }
}
