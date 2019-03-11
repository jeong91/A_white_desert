package com.wd.model.service.character;

import com.wd.model.vo.character.Character;

/**
 * 캐릭터의 행위 모음
 */
public interface CharacterService {

    // 캐릭터 생성
    Character createCharacter(String nickName, int tribeNum);

    // 공격 행위
    void attackCharacter(Character ch);

    // 도망가기
    void runAwayCharacter();

    // 스킬 사용
    void useSkill(Character ch, int skillNum);
}
