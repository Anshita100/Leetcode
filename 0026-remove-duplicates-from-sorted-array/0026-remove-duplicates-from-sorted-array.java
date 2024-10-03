class Solution {
     public int removeDuplicates(int[] a) {
    int n = a.length;
    if (n == 1) return 1;
    
    int j = 1;  // track the next unique element index
    int i = 0;  // track the current unique element position
    
    // Loop over the array, find unique elements and overwrite the duplicates
    while (j < n) {
        if (a[i] != a[j]) {  // if the element is unique, move it to the next position
            i++;             // move the pointer for the last unique element
            a[i] = a[j];     // update the next unique element in place
        }
        j++;  // increment the next element index to check
    }
    
    return i + 1;  // length of the array with unique elements
}
 /*   public int removeDuplicates(int[] a) {
        
        int j=0;//track unique element index
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=a[j])
            {
                a[++j]=a[i];
            }
            
        }
        return j+1;
    }*/
}