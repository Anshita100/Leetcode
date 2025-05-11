class Solution {
    public boolean checkString(String s) {
        //approach yehi hai b ke aane ke baad a nhi aana chahiye

        //my brute force solution
       /* char [] c=s.toCharArray();
        int n=c.length;
        for(int i=0;i<n;i++)
        {
            char curr=c[i];
            if(curr=='b'&& i!=n-1)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(c[j]=='a') return false;
                }
            }
        }
        return true;*/
        
        int count=0;
        char [] arr=s.toCharArray();
        for(char c:arr)
        {
            if(c=='b') count++;
            if(count>0 && c=='a')return false;
        }
        return true;
    }
}