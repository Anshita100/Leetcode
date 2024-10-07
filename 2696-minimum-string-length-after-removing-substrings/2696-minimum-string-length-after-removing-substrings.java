class Solution {
  
    public int minLength(String s) {
    
       Stack<Character> st=new Stack<>();
      st.push(s.charAt(0));
      for(int i=1;i<s.length();i++)
      {
          char ch=s.charAt(i);
          
          if( (!st.empty())
             && (((ch=='B')&&(st.peek()=='A')) || ((ch=='D')&&(st.peek()=='C'))))
          {
              st.pop();
          }
          else
          {
              st.push(ch);
          }
      }
      return st.size();
    }
    
    /* public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(!st.isEmpty()&&((s.charAt(i)=='B'&&st.peek()=='A')||(s.charAt(i)=='D'&&st.peek()=='C')))
            {
                st.pop();
            }
            else
                st.push(s.charAt(i));
        }
        return st.size();
    }*/
    /*public int minLength(String s) {
      while (s.contains("AB") || s.contains("CD")) {
        s = s.replaceAll("AB", "").replaceAll("CD", "");
       }
      return s.length();
    }*/
   /* public int minLength(String s) {
        Stack st = new Stack<>();
     for(char ch : s.toCharArray()) {
    if(st.size() > 0) {
    if((ch == 'B' && st.peek() == 'A') || (ch == 'D'                 && st.peek() == 'C')) {
              st.pop();
    } else {
             st.push(ch);
            }
    }
     else {
       st.push(ch);
      }
    }
return st.size();
}*/
}