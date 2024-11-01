class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
        ListNode dummyHead = new ListNode(0); // Dummy head for result linked list
        ListNode current = dummyHead;          // Pointer to the last node in the result
        int carry = 0;                         // Initialize carry to 0
        
        // Process both lists until both are empty and there is no carry
        while (h1 != null || h2 != null || carry > 0) {
            int sum = carry; // Start with carry
            if (h1 != null) {
                sum += h1.val; // Add value from first list if not null
                h1 = h1.next;   // Move to the next node
            }
            if (h2 != null) {
                sum += h2.val; // Add value from second list if not null
                h2 = h2.next;   // Move to the next node
            }
            
            carry = sum / 10; // Update carry
            current.next = new ListNode(sum % 10); // Create new node with the last digit
            current = current.next; // Move to the next node in the result list
        }
        
        return dummyHead.next; // Return the result, which starts after the dummy head
    }
}


/*class Solution {
    public ListNode addTwoNumbers(ListNode h1, ListNode h2) {
          int l1=1;int l2=1;
          if(h1.next==null && h2.next==null)
          {
              
          }
        
          ListNode temp1=h1;
          ListNode prev1=null;
          while(temp1!=null)
          {
              prev1=temp1;
              temp1=temp1.next;
              l1++;
          }
        
          ListNode temp2=h2;
          ListNode prev2=null;
          while(temp2!=null)
          {
              prev2=temp2;
              temp2=temp2.next;
              l2++;
          }
          
          int rem=Math.abs(l1-l2);
        
          ListNode addnode=null;
          if(l1>l2)
               addnode =prev2;
          else
               addnode =prev1;
        
          while(rem!=0)
          {
              ListNode newnode=new ListNode(0);
              addnode.next=newnode;
              addnode=newnode;
              rem--;
          }
         ListNode c1=h1;
         ListNode c2=h2;
         int newvalue;
         int carry =0;
         newvalue= c1.val+c2.val+carry;
        ListNode c3=new ListNode();
         if(newvalue<10)
          c3.val=newvalue;
         else
         {
             int last_digit=newvalue%10;
             c3.val=last_digit;
             carry=1;
         }
         
          while(c1!=null)
          {
              c1=c1.next;
              c2=c2.next;
             int newvalue1= c1.val+c2.val+carry;
             if(newvalue<10)
             {
                 ListNode newnode=new ListNode(newvalue1);
                 c3.next=newnode;
                 c3=newnode;
                 carry=0;
             }    
             else{
                 int last_digit=newvalue%10;
                 ListNode newnode=new ListNode(newvalue1);
                 c3.next=newnode;
                 c3=newnode;
                 carry=1;
             }
          }
        return c3;
          
    }
}*/