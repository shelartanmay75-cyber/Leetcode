class Solution {
    public int subtractProductAndSum(int x) {
        

int b = 0;
int a = 1;;



        while(x!=0){
            int last = x%10;

         b =  b+last;
         a = a*last;
         x = x/10;

  }
    


return a-b;
    }
}