public class Test11_For_99table {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1 ;i <= 9 ; i++){
            for (int j = 1 ;j <=9 ;j++){
                System.out.printf("%d * %d = %d \t",i,j,i*j);
            }
            System.out.println();
        }
    }
}
