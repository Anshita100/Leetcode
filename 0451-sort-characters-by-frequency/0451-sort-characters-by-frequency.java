class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        List<Character>list=new ArrayList(hm.keySet());
        list.sort((a,b)->hm.get(b)-hm.get(a));
        for(char c:list)
        {
            for(int i=0;i<hm.get(c);i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}