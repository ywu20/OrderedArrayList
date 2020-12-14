import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public boolean add(T e){
    if(this.size()>0 && e.compareTo(this.get(this.size()-1))<0){
      if(e.compareTo(this.get(0))<=0){
        super.add(0,e);
        System.out.println("less than first");
      }
      else{
        int s=this.size();
        for(int i=1;i<s;i++){
          if(e.compareTo(this.get(i-1))>=0 && e.compareTo(this.get(i))<=0){
            super.add(i,e);
            System.out.println("somewhere between");
          }
        }
      }
    }else{
      super.add(e);
      System.out.println("add to end");
    }
    return true;
}
}
