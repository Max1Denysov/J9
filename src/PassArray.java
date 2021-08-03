public class PassArray {
    static void test(String msg, int...v){
        System.out.print(msg + v.length + " Containing : ");
        for(int x : v)
            System.out.print(x +" ");
        System.out.println();
    }
    public static void main(String args[]){
        test("One parameter ",10);
        test("Two parametres ",2,3);
        test("Only message");
    }
}
