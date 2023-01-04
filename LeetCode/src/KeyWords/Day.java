package KeyWords;

 class ThisKeyword {
    int a;
    ThisKeyword(int x){
        this.a=x;
    }
  void m1(ThisKeyword thisKeyword)
  {

  }
  void m2()

  {
      m1(this);
  }
    public static void main(String[] args) {
        ThisKeyword value = new ThisKeyword(10);
        System.out.println("The value of a is" + value.a);
        //value.m1(this);
    }
}