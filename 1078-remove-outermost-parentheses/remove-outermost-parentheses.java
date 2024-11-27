class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()) {
            if(ch=='('){
                if(count>0)str.append(ch);
                count++;
            } else {
                count--;
                if(count>0)str.append(ch);
            }
        }
        return str.toString();
    }
}