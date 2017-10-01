package homeTask;


public class ForDivMultipl {
    public static void main(String[] args) {
        for (int i = -100; i <= 100; i++){
            if ((i % 3) == 0){
                System.out.print(i * 2);
            }else System.out.print(i / 2);
        }
    }
}
