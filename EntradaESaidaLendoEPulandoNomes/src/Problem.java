import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[  10   ];

        for(int i=0 ; i<10 ; i++)
            nomes[ i   ] = sc.nextLine();
        System.out.printf(nomes[2]);
        System.out.printf("\n" + nomes[6]);
        System.out.printf("\n" + nomes[8]);
        sc.close();
    }
}
