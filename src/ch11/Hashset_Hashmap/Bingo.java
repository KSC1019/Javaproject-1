package ch11.Hashset_Hashmap;

import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet(); //hashSet 선언
       // Set set = new LinkedHashSet();

        int [][] mp = new int[5][5];//2차원 배열 선언

        for(int i=0;set.size()<25;i++){
            set.add((int)(Math.random()*50)+1+""); //set에 1~50까지의 무작위 숫자를 부여하는 반복문
        }
        Iterator it = set.iterator();
        //Iterator 선언, Iterator를 통해 다음 요소에 접근하고, 이를 정수형으로 변환하여 2차원 배열 mp에 저장하고 출력하고 있습니다
        for(int i=0;i<mp.length;i++){
            for(int j=0;j < mp[i].length;j++){
                mp[i][j] = Integer.parseInt((String)it.next());// next()는 반환값이 Object타입이므로 형변환을 통해 원래 타입으로 돌려놔야합니다.
                System.out.print((mp[i][j]<10 ? " " : " ") + mp[i][j]);
            }
            System.out.println();
        }
    }
}
/*
해당 코드는 자바의 정석에서 가져온 예시문제로 Hashset을 통해 bingo판을 무작위로 만드는 코드입니다.

 */