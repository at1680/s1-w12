public class NumbersLoops{
    public NumbersLoops(){
      //private int x=0;
      // while(x<11){
      //   System.out.println(x);
      //   x++;
      // }
      // x=0;
      // for (;x<11;x++){
      //   System.out.println(x);
      // }
    }
    
    public int digitSum(int num){
      int sum =0;
      for(int x=0; x<num; x++){
        sum = sum + x;
      }
      return sum;
    }
  
    public int reverseNum(int num){
      int newNum=0;
      int x=String.valueOf(num).length();
      while(x>0){
        newNum=newNum+(num%10)*10*x;
        newNum=newNum+(num/10)%10;
        num=(num/10)*x*10;
        x--;
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      return 0;
    }
  
  
  }
