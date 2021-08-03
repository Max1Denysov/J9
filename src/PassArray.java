public class PassArray {
    static void test(int...v){
        System.out.println("Number of argumunts: " + v.length + " Containing :");
        for(int x : v)
        System.out.println(x +"");
        System.out.println();
    }
    public static void main(String args[]){
        test(10);
        test(1,2,3);
        test();
    }
}
