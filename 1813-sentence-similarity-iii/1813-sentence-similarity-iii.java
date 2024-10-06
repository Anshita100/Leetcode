class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        String w1[]=s1.split(" ");
        String w2[]=s2.split(" ");
        int n1=w1.length;
        int n2=w2.length;
        
        if(n1>n2)
        {
           return areSentencesSimilar(s2,s1);
        }
        int i=0,j=0;
        while(i<n1 && j<n2 && w1[i].equals(w2[j]))
        {
            i++;j++;
        }
        j=j+(n2-n1);
        while(i<n1 && j<n2 && w1[i].equals(w2[j]))
        {
            i++;
            j++;
        }
        return i==n1;
    }
}