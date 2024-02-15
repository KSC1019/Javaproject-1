package ch10.DQ0214;

public class Util {
    public static <K,V> V getValue(Pair<K,V> pair,String key){
        if(key.equals(pair.getKey())){
            return pair.getValue();
        }
        return null;
    }
}
