import pkg1.pkgTestClass1;

public class main {
    public static void main(String[] args) {
        absclass obj = new derClass1();
        obj.sub();
        obj.add(2,4);
        int f_i = 0;
        for(int i=0;i<5;i++){
            f_i = i;
            System.out.println("i is "+f_i);
        }
    }
}
