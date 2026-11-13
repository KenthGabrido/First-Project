public class TestArray4{

    public static void main(String[] args){
        int ctr;
        char[] c = new char[4];

        c[0] = 'J';
        c[1] = 'A';
        c[2] = 'V';
        c[3] = 'A';

        ctr = 0;
        while(ctr <= 3){
            System.out.println(c[ctr]);
            ctr++;
        }
    }
}