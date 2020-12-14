import java.util.ArrayList;
public class Tester{
  public static void main(String[] args){
    NoNullArrayList<String> a= new NoNullArrayList<String>();
    a.add("djahguhg");
    System.out.println(a.get(0));
    try{
    a.add(null);
  }
  catch(IllegalArgumentException e){
    System.out.println("add to end exception catched");
  }

  a.add(0,"dssf");
  System.out.println(a.get(0));
  try{
  a.add(0,null);
}
catch(IllegalArgumentException e){
  System.out.println("add to index exception catched");
}


  }
}
