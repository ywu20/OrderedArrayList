import java.util.ArrayList;
public class NoNullArrayList<T>  extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startCapacity){
    super(startCapacity);
  }

  public boolean add(T e){
    if(e==null){
      throw new IllegalArgumentException();
    }
    else{
      super.add(e);
    }
    return true;
  }

  public void add(int index, T e){
    if(e==null){
      throw new IllegalArgumentException();
    }
    else{
      super.add(index,e);
    }
  }

  public T set(int index, T e){
    if(e==null){
        throw new IllegalArgumentException();
    }else{
      return super.set(index,e);
    }
  }
}
