import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for(char c : a.toCharArray()){
            if(c>64 && c<91){
                char tmp = (char)(c+32);
                result += tmp;
            }else{
                char tmp = (char)(c-32);
                result += tmp;
            }
        }
        System.out.println(result);
    }
}