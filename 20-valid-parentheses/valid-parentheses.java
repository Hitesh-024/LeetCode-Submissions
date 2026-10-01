class Solution {
    public boolean isValid(String s) {
        //Stack<Character> open=new String<>();
        Stack<Character> close=new Stack<>();
        int l=s.length();
        for(int i=l-1;i>-1;i--){
            if(s.charAt(i)=='{'){
                if(close.isEmpty())
                return false;
                if(close.pop()!='}')
                return false;
            }else if(s.charAt(i)=='('){
                if(close.isEmpty())
                return false;
                if(close.pop()!=')')
                return false;
            }
            else if(s.charAt(i)=='['){
                if(close.isEmpty())
                return false;
                if(close.pop()!=']')
                return false;
            }else
            close.push(s.charAt(i));
        }
        if(close.isEmpty())
        return true;
        else
        return false;
    }
}