import java.util.*;

public class Main{
    public static void main(String[] args) {
        String str = "  Hello   World  ";
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        System.out.println("|"+str+"|"); 
    }
}








