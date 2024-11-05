package ijpPractice;

public class OperationOnNo {
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public void add(int d,int e,int f){
        int g=d+e+f;
        System.out.println(g);
    }

    public static void main(String[] args) {
        OperationOnNo sc=new OperationOnNo();
        System.out.println(sc.add(12,78));
        sc.add(15,29,30);
    }
}

