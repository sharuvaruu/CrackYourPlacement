import java.util.*;
public class DupCharinString{
    public static void printDups(String str){
        int len=str.length();//sabse pehle apn ne ekvarible me string ki length stor krli
        char[] chars =str.toCharArray();//fir usko char array me convert liya
        Arrays.sort(chars);///vvimpppp usko sort kiys agar sort nahi krte to 
        /* We sort the character array to
         make duplicates come together. 
         This makes it easier to count consecutive characters. */
        for(int i=0;i<len;i++){
            int count=1;//qk har ek charcter ek baar to present rahega hi
            while(i<len-1 && chars[i]==chars[i+1]){ //condition simple he its that 
            //consequtive chars dups rahege or out of bound nahi jana chahie i
            //ye jo while loop he na wo simply jab consequtive pairs aana chalu honge
            //tab perform honga other wise bas for loop ka i increment honga
                count++;
                i++;

            }
            if(count>1){
                //agar ek se jyada count he to simply print karo
                System.out.println(chars[i]+ " Count= "+count);
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "test string";
        printDups(str);
    }
}