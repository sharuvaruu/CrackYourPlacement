class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stk.isEmpty() && s.charAt(i)=='#'){
                stk.pop();
            }else if(s.charAt(i)!='#'){
                stk.push(s.charAt(i));
            }
        }
      String s1="";
      int size=stk.size();
      if(!stk.isEmpty()){
        for(int i=0;i<size;i++){
        s1+=stk.peek();
        stk.pop();
      }
      }
      stk.clear();
      for(int i=0;i<t.length();i++){
            if(!stk.isEmpty() && t.charAt(i)=='#'){
                stk.pop();
            }else if(t.charAt(i)!='#'){
                stk.push(t.charAt(i));
            }
        }
      String t1="";
      int siz=stk.size();
      if(!stk.isEmpty()){
        for(int i=0;i<siz;i++){
        t1+=stk.peek();
        stk.pop();
      }
      }
      return s1.equals(t1); 
    }
}