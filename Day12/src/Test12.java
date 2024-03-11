public class Test12 {
    public static void main(String[] args) {
        String inputString = "hello123java45is91fun14";

        // Delimiter: one or more non-digit characters
        String[] tokens = inputString.split("\\D+");
        int sum = 0;
        
        for (String token : tokens) {
            if(!token.isEmpty()) {
            	sum += Integer.parseInt(token);
            }
        }
        System.out.println("Á¤´ä " + sum);
    }
}
