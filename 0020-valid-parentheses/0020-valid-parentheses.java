class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
            if(stack.isEmpty()){
                return false;
            }
            
            char top=stack.pop();
            if(ch==')'&&top!='(') return false;
            if(ch=='}'&&top!='{') return false;
            if(ch==']'&&top!='[') return false;
    }
        }
    return stack.isEmpty();
}
}