class wstack{
    private int stck[];
    private int LaNamb;

    wstack(int size){
        stck = new int[size];
        LaNamb = -1;
    }

    void push(int item){
        if (LaNamb == stck.length - 1)
            System.out.println("Full stack");
        else
            stck[++LaNamb] = item;
    }
    public int pop(){
        if (LaNamb < 0 ) {
            System.out.println("Empty stack");
            return 0;
        }
        else {
            return stck[LaNamb--];
        }
    }
}



public class stack060821 {
    public static void main(String args[]){

        wstack mystackone = new wstack(4);
        wstack mysecondstack = new wstack((2));

        for(int i  = 0; i < 4;i++) mystackone.push(i);
        for(int i = 99;  i < 101 ; i++) mysecondstack.push(i);

        System.out.println("First stack have: ");
        for(int i = 0;i < 4;i++)
            System.out.print(mystackone.pop() + " ");
        System.out.println("\nSecond stack have: ");
        for(int i = 0 ; i <2 ; i++)
            System.out.print(mysecondstack.pop()+ " ");
    }
}
