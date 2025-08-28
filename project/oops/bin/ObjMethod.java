class ObjMethod{
    int i;
    int j;
    private void m1(ObjMethod b){
        System.out.println(i);
        System.out.println(j);
        System.out.println(b.i);
        System.out.println(b.j);
    }
    public static void main(String[] args){
        ObjMethod b1= new ObjMethod();
        ObjMethod b2= new ObjMethod();
        b1.i=10;
        b1.j=20;
        b2.m1(b1);

    }

}