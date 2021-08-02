
class osteck {
    private int stck[];
    private int last;

    osteck(int size) {
        stck = new int[size];
        last = -1;

    }

    void push(int item) {
        if (last == stck.length)
            System.out.println("full stack");
        else
            stck[++last] = item;

    }

    public int pop() {
        if (last < 0) {
            System.out.println("Stack empty");
            return 0;
        } else {
            return stck[last--];
        }
    }
}
public class steckTraining{
    public static void main(String args[]){
        osteck steckone = new osteck(11);
        osteck stecktwo = new osteck(200);


        for(int i = 0;i < 11;i++)steckone.push(i);
        for(int i = 145 ; i < 200;i++)stecktwo.push(i);

        System.out.println("Stack one have: ");
        for(int i = 0;i < 10;i++)
            System.out.print(steckone.pop()+ " ");

        System.out.println("\nStack two have: ");
        for(int i = 0;i < 55;i++)
            System.out.print(stecktwo.pop()+ " ");
    }
}


