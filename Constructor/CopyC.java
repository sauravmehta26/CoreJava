public class CopyC {
    int i;
    int j;

    CopyC(int i){
        this.i=i;
        this.j=0; 
    }
    CopyC(int i,int j){
        this.i=i;
        this.j=j;
    }
    CopyC(CopyC a){
        this.i=a.i;
        this.j=a.j;
    }
    public static void main(String[] args) {
        CopyC a= new CopyC(5);
        CopyC a1= new CopyC(10,20);
        CopyC a2= new CopyC(a1);//Copying object a1 using the copy constructor
        System.out.println(a2.i+"\t"+a2.j);
        System.out.println(a1.i+"\t"+a1.j);
        System.out.println(a.i+"\t"+a.j);

    }
}
