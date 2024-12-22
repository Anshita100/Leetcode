class Solution {
  /*  public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int opened=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                if(opened >0) sb.append(c);
                
                opened++;
            }
            else
            {
                if(opened >1) sb.append(c);
                
                opened--;
            }    
        }
        return sb.toString();
    }*/
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character>st=new Stack<>();
        
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                if(!st.isEmpty())
                    sb.append(c);
                
                st.push(c);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                    sb.append(c);          
            }
        }
        return sb.toString();
    }
}