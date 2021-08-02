public class CommandLine {
    static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String args[]){

        for(int i = 0;i< args.length;i++)
            System.out.println("arr["+ i +  "] : "+ args[i]);
    }
}
