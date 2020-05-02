package leetCode.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Description
 *
 * 有效的括号
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author Ning Nainian
 * @Date 2020/3/4 12:19
 **/
public class YouxiaodeKuohao {

    HashMap<Character,Character> mapping = new HashMap<Character,Character>();

    public YouxiaodeKuohao(){
        this.mapping.put(')','(');
        this.mapping.put(']','[');
        this.mapping.put('}','{');
    }

    public boolean isValid(String s){
        Stack<Character>  stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);

            //判断该括号是否为闭括号
            if(this.mapping.containsKey(c)){
                //获取栈顶数据，并移除栈顶数据
                char topElement = stack.empty() ? '#' : stack.pop();
                //判断栈顶的括号与遍历出来的下一个括号是否匹配
                if(topElement != this.mapping.get(c)){
                    return false;
                }

            }else{
                //如果是开括号，推到栈里面
                stack.push(c);
            }

        }

        return stack.isEmpty();
    }


}