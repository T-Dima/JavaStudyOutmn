package homeTask;


public class WhileWithDivMultipl {
    public static void main(String[] args) {
        int i = -100;

        while (i != 101){
            if ((i % 3) == 0){
                System.out.print(i * 2);
            } else System.out.print(i / 2);
            i++;
        }
    }
}
