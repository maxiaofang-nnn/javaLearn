package leetCode.stack;

import java.util.Arrays;

/**
 * @Author Ning Nainian
 * @Date 2020/3/4 13:14
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        PinxieDanci pinxieDanci = new PinxieDanci();
       // words = ["cat","bt","hat","tree"], chars = "atach"

        String[] wordsArr = {"hello","world","leetcode"};
        String chars = "welldonehoneyr";

        int result = pinxieDanci.countCharacters(wordsArr,chars);
        System.out.println(result);
    }
}