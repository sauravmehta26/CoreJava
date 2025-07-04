public class Mobile {
    String name;
    String brand;
    Mobile(String name, String brand){
        this.name=name;
        this.brand=brand;
        System.out.println("hiiiiiiiiiii"+"\t"+name);
    }
    public void display(){
        System.out.print("Mobile name :"+name);
        System.out.println("\t"+"Mobile brand :"+brand);

    }
    public static void main(String[] args) {
        Mobile A= new Mobile("redmi","mi");
        Mobile B= new Mobile("realme","xt");
        System.out.println("Mobile name :"+A.name+"\t"+"Mobile brand :"+A.brand);
        B.display();

    }
}
