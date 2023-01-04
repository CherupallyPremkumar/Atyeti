package DataStructure;

public class HashMap<I extends Number, I1 extends Number> {
    public static void main(String[] args) {
    Hash hash=new Hash();
     hash.Check("aa","aab");
    }
}
class Hash{
  public Boolean Check(String ramsonNote,String magizne){
      boolean valueforreturn=false;
      if(magizne.length() <ramsonNote.length() )
      {
          return valueforreturn;
      }
      int m[]  =new int[126];
      for(int i=0;i<ramsonNote.length();i++) {
          char c = ramsonNote.toLowerCase().charAt(i);
         m[c] =m[c] +1;
          System.out.println(m[c]);
      }





return true;
  }
}
