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
      //System.out.println(x);
      while (num != 0) {
        int lastDigit = num % 10;
        newNum = (newNum * 10) + lastDigit; 
        num=num/10;
      }
      return newNum;
      // while(x>=0){
      //   newNum+=(num%10)*10^x;
      //   num=num/10;
      //   x=x-1;
      // }
      // return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int paliNum = 0;
      int b = start;
      for (;b<=finish;b++){
        if (b==reverseNum(b)){
          paliNum++;
      }
    }
    return paliNum;
  }


}
