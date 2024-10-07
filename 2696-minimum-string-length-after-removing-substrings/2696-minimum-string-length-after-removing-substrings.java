class Solution {
  
   /* public int minLength(String s) {
    
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
    }*/
    
    public int minLength(String s) {
    int left = 0;
    StringBuilder result = new StringBuilder();
    while (left < s.length()) {
        char ch = s.charAt(left);
        int len = result.length();
        if (len > 0 && ((ch == 'B' && result.charAt(len - 1) == 'A') || (ch == 'D' && result.charAt(len - 1) == 'C'))) {
            result.deleteCharAt(len - 1); // Remove the last character
        } else {
            result.append(ch);
        }
        left++;
    }
    return result.length();
}

    /*public int minLength(String s) {
      while (s.contains("AB") || s.contains("CD")) {
        s = s.replaceAll("AB", "").replaceAll("CD", "");
       }
      return s.length();
    }*/
    
   
}