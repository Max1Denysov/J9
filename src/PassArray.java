public class PassArray {
    static void test( int...v){
        System.out.print("Test(int...)  -  Numbers of argument: [" + v.length + "] Containing: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void test(Boolean...v){
        System.out.print("\nTest(boolean...)  -  Numbers of argument: [" + v.length + "] Containing: ");
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();


    }
    static void test(String msg,int...v){
        System.out.print("Test(String,int...)  " + msg + v.length + "] Containing: ");
        for(int x : v)
            System.out.print(x + " ");
    }

    public static void main(String args[]){
        test(10);
        test("- Numbers of argument: [",2,3);
        test(true,false,false,true);
    }
}
