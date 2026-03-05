import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
       public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String , List<String>> map = new HashMap<>();

        for(String str: strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
            GroupAnagrams obj = new GroupAnagrams();
            String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
            System.out.println(obj.groupAnagrams(arr));
    }
}
