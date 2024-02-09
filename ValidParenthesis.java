package deep28;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParenthesis {
    public boolean isValid(String s) {
     Stack<Character> stack=new Stack<>();
     for(char ch:s.toCharArray()){
         if(ch=='(' || ch== '{' || ch=='['){
             stack.push(ch);
         }
         else{
             if(ch==')'){
                 if(stack.isEmpty() || stack.pop()!='('){
                     // we are using pop since after using it we should remove it
                     return false;
                 }
             }
             if(ch=='}'){
                 if(stack.isEmpty() || stack.pop()!='{'){
                     return false;
                 }
             }
             if(ch==']'){
                 if(stack.isEmpty() || stack.pop()!='['){
                     return false;
                 }
             }
         }
     }
     return stack.isEmpty();
    }//if stack is empty then return true
}
