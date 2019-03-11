package com.wd.model.vo.skill.tribe.human.common;

import com.wd.model.vo.character.Character;
import com.wd.model.vo.skill.Skill;

/**
 * 사람 종족 공통 스킬
 */
public class HumanCommonSkill extends Skill {

    public HumanCommonSkill(){
        super();
        this.setSkillName("사람스킬"); // 스킬 이름
        this.setSkillEffect("=== 방어력 up ==="); // 스킬 효과
        this.setSkillRange(1); // 스킬 사거리
        this.setMana(0); // 필요 마나
        this.setCooltime(0); // 쿨타임
        this.setDuratione(1); // 지속 시간
    }

    /**
     * 사람 종족 공통 스킬(방어력 20% 상승)
     * @return 상승 된
     */
/*    public static int useHumanSkill(int defensivePower){

        defensivePower = (int) (defensivePower + (defensivePower * 0.2));
        return defensivePower;
    }*/

    /**
     * 사람 종족 공통 스킬(방어력 20% 상승)
     * @param ch
     */
    @Override
    public void useSkill(Character ch) {
        int defensivePower = ch.getDefensivePower();
        defensivePower = (int) (defensivePower + (defensivePower * 0.2));
        ch.setDefensivePower(defensivePower);
    }
}
