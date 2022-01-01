

public class U7C200414 {

    public static String encrypt(String Text, KeyValue[] map) {
        String output = "";
        for (int i = 0; i < Text.length(); i++) {
            for (int j = 0; j < map.length; j++) {
                if((Text.charAt(i) + "").equals(map[j].getKey())){
                    output += map[j].getValue();
                }
            }
        }                                       
        return output;                       
    }
    public static void main(String[] args) {
        KeyValue[] map = new KeyValue[138];
        for (int i = 0; i < 138; i++) {
            map[i] = new KeyValue((char) i + "", (int) (Math.random() * 8999999 + 1000000));
        }
     

        System.out.println(encrypt("Abd ALrhman", map));
        
    }
}
