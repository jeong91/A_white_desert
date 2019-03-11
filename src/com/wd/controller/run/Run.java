package com.wd.controller.run;

import com.wd.model.service.character.CharacterService;
import com.wd.model.service.character.CharacterServiceImpl;
import com.wd.model.vo.character.Character;
import com.wd.model.vo.monster.Monster;
import com.wd.model.vo.skill.tribe.human.common.HumanCommonSkill;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n .... 하얀 사막 start......... ");
        System.out.print("\n <<< 닉네임 >>> \n 닉네임 입력 : ");
        String nickName = sc.nextLine();
        Character ch = null;
        CharacterService cs = new CharacterServiceImpl();

        System.out.println("\n <<< 종 족 >>> \n 종족은 세 가지가 있다. \n 1. 사람 \n 2. 오크 \n 3. 엘프");
        for(;;) {
            System.out.print("종족 선택 : ");
            int tribeNum = sc.nextInt();
            ch = cs.createCharacter(nickName, tribeNum);
            if(ch != null) {
                break;
            }
        }

        System.out.println("\n <<< 내 정보 >>>>");
        System.out.println("닉네임 : " + ch.getNickName());
        System.out.println("레벨 : " + ch.getLevel());
        System.out.println("HP : " + ch.getHp());
        System.out.println("MP : " + ch.getMp());
        System.out.println("종족 : " + ch.getTribeName());

        System.out.println("\n <<< 몬스터 발견 !!! >>>>");
        Monster monster = new Monster();
        System.out.println("\n 몬스터 정보 \n 이름 : " + monster.getName()
                                            + "\n hp : " + monster.getHp()
                                            + "\n 공격력 : " + monster.getAttackPower()
                                            + "\n 방어력 : " + monster.getDefensivePower());
        System.out.println("\n 1. 공격 \n 2. 도망");
        System.out.print("선택 : ");
        int option1 = sc.nextInt();
        if (option1 == 1){
            cs.attackCharacter(ch);
            System.out.println(monster.getName() + "(이)가 공격 당했다 \n");


            System.out.println("\n스킬 사옹 \n 1. 회복 스킬 \n 2. 분노 스킬 \n 3. 종족 스킬");
            System.out.print("\n스킬 선택 : ");
            int skillNum1 = sc.nextInt();
            switch (skillNum1){
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    System.out.println("현재 방어력 : " + ch.getDefensivePower());
                    //ch.setDefensivePower(HumanCommonSkill.(ch.getDefensivePower()));
                    System.out.println("변경 방어력 : " + ch.getDefensivePower());
                    System.out.println("종족 스킬 사용 완료(방어력 20% 증가)"); break;
            }


        }






    }
}
