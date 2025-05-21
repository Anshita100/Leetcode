class Solution {
    //2ms
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int opened=0;Stack<Character>st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                opened++; st.push(c);
                if(opened>1)
                sb.append(c);
            }
            else
            {
                opened--;
                if(opened==0)st.pop();
                else
                {
                    st.pop();
                    sb.append(c);
                }
            }
        }
        return sb.toString();
       /* StringBuilder sb=new StringBuilder();
        int opened=0;
        for(char c:s.toCharArray())
        {
            //my approach
            if(c=='(')
            {
                opened++;
              
                //if(opened ==1) dont append
                if(opened>1)
                sb.append(c);
                
            }
            else
            {
                opened--;

                //if(opened==0) dont append
                if(opened>0)
                sb.append(c);           
            } 
        }
        return sb.toString();*/
    }
    //5ms
   // public String removeOuterParentheses(String s) {
      /*  If the character is '(':
If the stack is not empty, append it to the result (because it's not an outermost parenthesis).
Push '(' onto the stack.
If the character is ')':
pop the top of the stack (to close the last opened '(').
If the stack is not empty, append ')' to the result (because it's not an outermost parenthesis). 
At last-The StringBuilder contains the modified string after removing the outermost parentheses.*///TC-O(N),SC-O(N)
       /* StringBuilder sb=new StringBuilder();
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
        return sb.toString();*/
    //}
}