
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


}
