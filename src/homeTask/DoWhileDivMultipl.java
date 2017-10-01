package homeTask;


public class DoWhileDivMultipl {
    public static void main(String[] args) {
        int i = -100;
        do {
            if (i % 3 == 0){
                System.out.print(i  * 2);
            }
            else System.out.print(i / 2);
            i++;
        }while (i < 101);
    }
}
