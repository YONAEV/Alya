
public class Utility {

    public void util1(){
        System.out.println("Hello");
    }
    public String reverse(String res){
        String end="";
        for (int i =res.length();i>0 ; i--) {
            end+=res.charAt(i);
        }
        return end;
    }
    public static boolean isFirstAndLastLetterSame(String each){
        each=each.toLowerCase();
        char firstLetter=each.charAt(0);
        char lastLetter=each.charAt(each.length()-1);
        return firstLetter==lastLetter;
    }

}
