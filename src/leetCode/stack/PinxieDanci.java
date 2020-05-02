package leetCode.stack;

/**
 * @Author Ning Nainian
 * @Date 2020/3/17 10:07
 * @Description
 * 拼写单词
 *
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 *
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 题解：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/solution/tong-ji-zi-mu-chu-xian-de-ci-shu-shu-zu-ji-qiao-cj/
 **/
public class PinxieDanci {
    /**
     *
     * @Description
     * @Author Ning Nainian
     * @param words : 字母
     * @param chars :词汇
     * @Date 2020/3/17 16:46
     */
    public int countCharacters(String[] words,String chars){
        int[] chars_count = count(chars);

        int flag = 0;
        for (int i=0;i<words.length;i++){
            int[] words_count = count(words[i]);
            if(contain(words_count,chars_count)){
                flag += words[i].length();
            }
        }

        return flag;
    }




    /**
     *
     * @Description 词汇表数组中，每个词汇出现的次数少于字母表中的每个字母，才成立
     * @Author Ning Nainian
     * @param char_count : 词汇表数组
     * @param word_count : 字母表数组
     * @Date 2020/3/17 12:41
     */
    boolean contain(int[] char_count,int[] word_count){
        for(int i=0;i<char_count.length;i++){
            if (char_count[i]>word_count[i]){
                return false;
            }
        }
        return true;
    }

   /**
    *
    * @Description 统计字符串中，26个字母各出现了多少次
    * @Author Ning Nainian
    * @param word :
    * @Date 2020/3/17 16:37
    */
    int[] count(String word){
        int[] counter = new int[26];
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            counter[c - 'a'] ++;
        }
        return counter;
    }

}