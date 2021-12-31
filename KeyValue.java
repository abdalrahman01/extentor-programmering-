public class KeyValue {
    private String key;
    private int value; 

    public KeyValue(String key, int value){
        this.key = key;
        this.value = value; 
    }

    public void setValue(int value){
        this.value = value;
    }
    public void setKey(String key){
        this.key = key;
    }
    public int getValue() {
        return value;
    }
    public String getKey() {
        return key;
    }
    public String toString() {
        return "{" + key+ ": " + value + "}";
    }

    public static void main(String[] args) {
        KeyValue ss = new KeyValue("Abd", 123);
        System.out.println(ss);
    }
}
