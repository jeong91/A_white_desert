package com.wd.model.service.character;

import com.wd.model.vo.character.Character;
import com.wd.model.vo.character.tribe.elf.Elf;
import com.wd.model.vo.character.tribe.human.Human;
import com.wd.model.vo.character.tribe.oak.Oak;
import com.wd.model.vo.skill.Skill;

/**
 * 캐릭터 행위 구현 클래스
 */
public class CharacterServiceImpl implements CharacterService {

    public CharacterServiceImpl() {}

    @Override
    public Character createCharacter(String nickName, int tribeNum) {
        switch (tribeNum) {
            case 1:
                return new Human(nickName);
            case 2:
                return new Oak();
            case 3:
                return new Elf();
            default:
                System.out.println("[!] 올바르지 않은 선택");
                return null;
        }
    }

    @Override
    public void attackCharacter(Character ch) {
        System.out.println("... 기본 공격 >> 주먹 찌르기 ...");
    }

    @Override
    public void runAwayCharacter() {

    }

    @Override
    public void useSkill(Character ch, int skillNum) {
        int size = ch.getSkills().size() + 1;
        if (size < skillNum) {
            System.out.println("등록된 스킬이 없습니다.");
        } else {
            Skill skill = ch.getSkills().get(skillNum); // 종족스킬
            skill.useSkill(ch); // 종족스킬 발동
        }
    }
}
