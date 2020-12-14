import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public boolean add(T e){
    if(e!=null&&this.size()>0 && e.compareTo(this.get(this.size()-1))<0){
      if(e.compareTo(this.get(0))<=0){
        super.add(0,e);
      }
      else{
        int s=this.size();
        boolean isAdded=false;
        for(int i=1;i<s&&!isAdded;i++){
          if(e.compareTo(this.get(i-1))>=0 && e.compareTo(this.get(i))<=0){
            super.add(i,e);
            isAdded=true;
          }
        }
      }
    }else{
      super.add(e);
    }
    return true;
}

public void add(int index, T e){
  this.add(e);
}

public T set(int index, T e){
  if(e==null){
    return super.set(index,e);
  }
  else{
    T out=this.get(index);
    this.remove(index);
    this.add(e);
    return out;
  }
}

}
