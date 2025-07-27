// package variable;
 class Static_Non_Variable {
    static int i;
    int j;
    // =10;
    public static void main(String[] args) {
        System.out.println("================i================");
        System.out.println(i);
        i=5;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i);
        System.out.println("================j================");
        // System.out.println(j); => CTE
        Static_Non_Variable obj =new Static_Non_Variable();
        obj.j=10;
        System.out.println(obj.j);

        Static_Non_Variable obj2 = new Static_Non_Variable();
        // obj2.j=5;
        System.out.println(obj2.j);
        
        System.out.println("================k================");
        int k;
        // System.out.println(k); => CTE
        k=9;
        System.out.println(k);
        // i++;
      

    }
}

