public class U7B200414 {
    
    public static KeyValue[] generate_map(String text) {

        char[] all = new char[text.length()];
        int position = 1;
        all[0] = text.charAt(0);
        for (int i = 1; i < text.length(); i++) {
            boolean taken = false; 
            for (int j = 0; j < text.length() && !taken; j++) {
                if(text.charAt(i) == all[j]){
                    taken = true;
                }
            }
            if (!taken) {
                all[position] = text.charAt(i); 
                position++;
            }
            
        }

        KeyValue[] keyv = new KeyValue[position];
        for (int i = 0; i < position; i++) {
            keyv[i] = new KeyValue(all[i]+ "", (int) (Math.random() * 89999 + 10000));
        }

        return keyv;
    }
    
    public static void main(String[] args) {
        KeyValue[] test = generate_map("1234567890+wertyuiopåäölk,mjnhbgvfcdxszaQAWSEDRFTGYHUJIKOLPÖÅÄ-.,MNBVCCZXAQWSDATWF213761TEG!¤%&/()=?¡@£$€¥{");
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
       
    }
}
