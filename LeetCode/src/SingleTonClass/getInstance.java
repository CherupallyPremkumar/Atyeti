package SingleTonClass;

final class GetInstance {
    private  String name;

    GetInstance(String name)
    {
        this.name=name;
    }



}
class A
{
    public static void main(String[] args) {
        GetInstance  getInstance=new GetInstance("rr");
      //  GetInstance  getInstance=new GetInstance("22");
     //   System.out.println(getInstance.);
    }
}
