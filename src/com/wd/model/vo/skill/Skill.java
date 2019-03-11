package com.wd.model.vo.skill;

import com.wd.model.vo.character.Character;

/**
 * 모든 스킬의 기초 클래스
 */
public abstract class Skill {

    private String skillName; // 스킬 이름
    private String skillEffect; // 스킬 효과
    private int skillRange; // 스킬 범위(사거리)
    private int mana; // 스킬 사용 시 필요 마나(= 소모되는 mp)
    private int cooltime; // 쿨타임
    private int duratione; // 지속 시간

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillEffect() {
        return skillEffect;
    }

    public void setSkillEffect(String skillEffect) {
        this.skillEffect = skillEffect;
    }

    public int getSkillRange() {
        return skillRange;
    }

    public void setSkillRange(int skillRange) {
        this.skillRange = skillRange;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCooltime() {
        return cooltime;
    }

    public void setCooltime(int cooltime) {
        this.cooltime = cooltime;
    }

    public int getDuratione() {
        return duratione;
    }

    public void setDuratione(int duratione) {
        this.duratione = duratione;
    }

    // 야 난 재료랑 작업장만 줄테니까 요리는 너가 해 abstract
    public abstract void useSkill(Character ch);
}
