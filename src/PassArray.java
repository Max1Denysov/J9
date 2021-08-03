public class PassArray {
    static void test(int v[]){
        System.out.println("Number of argumunts: " + v.length + " Containing :");
        for(int x : v)
        System.out.println(x +"");
        System.out.println();
    }
    public static void main(String args[]){
        int n1[] = {10};
        int n2[] = {1,2,3};
        int n3[] = {};
        test(n1);
        test(n2);
        test(n3);
    }
}
