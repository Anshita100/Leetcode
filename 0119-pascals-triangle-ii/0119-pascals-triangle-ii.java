class Solution {
    public List<Integer> getRow(int rowIndex) {
        //element at (1 based indexing) row=3,col=2=ele->3-1^C>2-1(nCr)
     /*   List<Integer>mylist=new ArrayList<>();
        rowIndex++;
        int ans=1;
        mylist.add(ans);
        for(int i=1;i<rowIndex;i++)
        {
            ans=ans*(rowIndex-i);
            ans=ans/i;
            mylist.add(ans);
        }
        return mylist;*/
        List<Integer>mylist=new ArrayList<>();
        rowIndex++;
        long ans=1;
        mylist.add((int)ans);
        for(int i=1;i<rowIndex;i++)
        {
            ans=ans*(rowIndex-i);
            ans=ans/i;
            mylist.add((int)ans);
        }
        return mylist;
    }
}