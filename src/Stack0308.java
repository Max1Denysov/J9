class ZTsteck{
    private int stck[];
    private String sstck[];
    private int LastNumb;
    ZTsteck(int size){
        stck = new int[size];
        sstck = new String[size];
        LastNumb = -1;
    }
    void push(int item){
        if (LastNumb == stck.length - 1)
            System.out.println("Full stack");
        else
            stck[++LastNumb] = item;
    }
    void push(String item){
        if(LastNumb == stck.length )
            System.out.println("Full stack");
        else
            sstck[++LastNumb] = item;

    }

    public int Ipop(){
        if(LastNumb < 0){
            System.out.println("Empty Steck");
            return 0;
        }

        else {
            return stck[--LastNumb];
        }


    }
    public String Spop(){
        if(LastNumb < 0) {
            System.out.println("Empty Steck");
            return "zero";
        }
        else{
            return sstck[--LastNumb];
            }

    }
}



public class Stack0308 {
    public static void main(String args[]){
        ZTsteck digisteck = new ZTsteck(15);
        ZTsteck wordsteck = new ZTsteck(15);
        String arr[] = {"zero","one", "two","three","four","five","six","seven","eight","nine"};

        for(int i = 0;i<15;i++) digisteck.push(i);
        for(int i = 0;i<10;i++) wordsteck.push(arr[i]);

        System.out.println("Digital Steck : ");
        for(int i = 0 ; i < 14;i++)
            System.out.print(digisteck.Ipop()+" ");

        System.out.println("\nWord Steck : ");
        for(int i = 0;i<9;i++)
            System.out.print(wordsteck.Spop()+" ");
    }
}
