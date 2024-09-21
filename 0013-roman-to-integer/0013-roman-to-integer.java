class Solution {
    public int romanToInt(String s) {
      /*  int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String symbol[]={,,,,,,,,,,,,};*/
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('\0',0);
        hm.put('I',1);
     hm.put('V',5);hm.put('X',10);hm.put('L',50);hm.put('C',100);hm.put('D',500);hm.put('M',1000);
        Integer sum=0;char prev='\0';
        for(int i=s.length()-1;i>=0;i--)
        {
            
            char current=s.charAt(i);
            if(hm.get(prev)<=hm.get(current))
            {
                sum=sum+hm.get(current);
                prev=current;
            }
            else
            {
                sum=sum-hm.get(current);
                prev=current;
            }   
        }
        return sum;
    }
}