package deep28;

import java.util.Stack;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
public class MinAddToValidParenthesis {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
                }
            else{
                stack.push(ch);//in case if '('
            }
            }
        return stack.size();
        }
    }

