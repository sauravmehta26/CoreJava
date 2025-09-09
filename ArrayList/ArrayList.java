public class ArrayList{
    Object[] arr=new Object[5];
    int count=0;

    public void increase(){
        Object[] brr = new Object[((arr.length*3)/2) +1];
        for(int i =0;i<arr.length;i++){
            brr[i]=arr[i];
        }
        arr=brr;
    }
    public  void add(Object e){
        // if(index>=count||index<0) throw new ArrayIndexOutOfBoundsException();
        if(count == arr.length) increase();
        arr[count++]=e;
        
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public Object get(int index){
        if(index>=count||index<0) throw new ArrayIndexOutOfBoundsException("i am get exception index '"+index+"' not exist");
        return arr[index];      
    }
    public void remove(int index){
        if(index<0||index>=count) throw new ArrayIndexOutOfBoundsException();
        for(int i=index;i<count-1;i++){
            arr[i]=arr[i+1];
        }
        arr[--count] = null;
    }
    public void add(Object ele, int index) {
    if (index < 0 || index > count) {
        throw new ArrayIndexOutOfBoundsException();
    }
    if (count == arr.length) {
        increase();
    }
    for (int i = count; i > index; i--) {
        arr[i] = arr[i - 1];
    }
    arr[index] = ele;
    count++;
}

}