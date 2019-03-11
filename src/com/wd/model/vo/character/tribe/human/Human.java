package com.wd.model.vo.character.tribe.human;

import com.wd.model.vo.character.Character;
import com.wd.model.vo.skill.tribe.human.common.HumanCommonSkill;

/**
 * 사람 종족 기초 클래스
 */
public class Human extends Character {

    public Human() {}

    public Human(String nickName) {
        super();
        this.setNickName(nickName);
        this.setTribeName("사람");
        this.setAttackPower(80);
        this.setDefensivePower(80);
        this.setSkills(new HumanCommonSkill());
    }





}
