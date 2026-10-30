public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count=0;
      while(!s.equals("")){
        s=s.substring(1);
        count++;
      }
      return count;
    }
  
    public String copy(String s, int num){
      String newS= "";
      for (int x=0;x<num;x++){
        newS = newS + s;
      }
      return newS;
    }
  
    public String interweaving(String s1, String s2){
      String newS="";
      int sum = (s1.length()+s2.length()-2)/2;
      for (int x = 0; x<=sum;x++){
        newS=newS+s1.substring(x,x+1)+s2.substring(x,x+1);
      }
      return newS;
    }
  
  
  }