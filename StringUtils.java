public class StringUtils {

    public static void main(String[] args) {
    
    timesCharOccurs('L', "Elias");
    
    }
    public static int timesCharOccurs(char ch, String string){        
    
    int counter = 0;

    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) == ch){
            counter ++;
        }
    
        
    }

    return counter;
}

    public static int randomNumber(){
        return (int) (Math.random() * 10);
    }
}
