package com.ohgiraffers.section04.assignment.run;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;
import com.ohgiraffers.section04.assignment.service.MemberService;

import java.util.Scanner;

/* 설명. 프로그램 실행 및 메뉴 출력과 사용자의 입력을 받을 View에 해당하는 클래스 */
public class Application {
    public static final MemberService mm = new MemberService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("=====회원 관리 시스템=====");
            System.out.println("1. 모든 회원 정보 조회");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("9. 시스템 종료");

            System.out.print("메뉴를 입력해주세요: ");
            int input = sc.nextInt();

            switch (input){
                case 1: mm.selectAllMembers();
                    break;
                case 2: mm.selectMember(chooseMemberNo());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 9: System.out.println("시스템을 종료합니다.");
                    return;
                default: System.out.println("번호를 다시 입력해주세요.");

            }
        }


    }

    /* 설명. 회원 한명 조회를 위해 해당 회원 번호를 입력받아 반환하는 메소드 */
    private static int chooseMemberNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾으시는 회원번호를 입력하세요: ");
        return sc.nextInt();
    }
}