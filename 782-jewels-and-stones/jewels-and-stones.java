import java.util.regex.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int x=0;
        for(char c:jewels.toCharArray())
        {
            Pattern p=Pattern.compile(String.valueOf(c));
            Matcher m=p.matcher(stones);
            while(m.find())
            {
                x++;
            }
        }
        return x;
    }
}
// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {
//         int count = 0;
//         for (char stone : stones.toCharArray()) {
//             if (jewels.indexOf(stone) != -1) {
//                 count++;
//             }
//         }
//         return count;
//     }
// }
