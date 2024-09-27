import java.util.*;
public class SubsetCheckHash{
    public static boolean isSubset(List<Integer> arr1,List<Integer> arr2){
        Set<Integer> set=new HashSet<>(arr1);
        for(Integer num:arr2){
            if(!set.contains(num)){
                return false;
            }
        }
        return true;
    }
}