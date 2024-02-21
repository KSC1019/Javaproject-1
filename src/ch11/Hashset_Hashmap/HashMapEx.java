package ch11.Hashset_Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("홍길동",80);
        mp.put("카리나",85);
        mp.put("제시카",95);
        mp.put("홍길동",80);
        System.out.println("총 Entry 수: " + mp.size());

        System.out.println("\t홍길동: " + mp.get("홍길동"));
        System.out.println();

        // 3. 객체를 하나씩 처리
        Set<String> keySet = mp.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = mp.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 4. 객체 삭제
        mp.remove("홍길동");
        System.out.println("총 Entry 수: " + mp.size());

        // 5. 객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = mp.entrySet(); // Map.EntrySet 얻기
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 6. 모든 Map.Entry 삭제
        mp.clear();
        System.out.println("총 Entry 수: " + mp.size());
    }

}
