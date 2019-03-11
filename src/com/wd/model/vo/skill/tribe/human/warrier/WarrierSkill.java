package com.wd.model.vo.skill.tribe.human.warrier;

import com.wd.model.vo.character.Character;
import com.wd.model.vo.skill.Skill;

/**
 * 사람 종족 - 전사 - 스킬
 */
public class WarrierSkill extends Skill {

    public WarrierSkill(){
        super();
        this.setSkillName("전사스킬"); // 스킬 이름
        this.setSkillEffect("=== 10초 무적 ===="); // 스킬 효과
        this.setSkillRange(3); // 스킬 사거리
        this.setMana(30); // 필요 마나
        this.setCooltime(30); // 쿨타임
        this.setDuratione(10); // 지속 시간
    }

    @Override
    public void useSkill(Character ch) {

    }
}
