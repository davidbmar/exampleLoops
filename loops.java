import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int counter=0;
        int answerNumber=0;
        
        for(counter=1;counter<=10;counter++){
            answerNumber=n*counter;
            System.out.println(n+" x "+ counter + " = "+answerNumber);
        }
    }
    
}
