
package estudante;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        Estudante e1 = new Estudante();
        e1.nome = "Arthur";
        e1.idade = 16;
        e1.matricula = 125;
        e1.endereco = "Rua dos Bobos";
        
       
        Estudante e2 = new Estudante();
        
        System.out.print("Nome: ");
        e2.nome = sc.nextLine();
        
        System.out.print("Idade: ");
        e2.idade = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Matricula: ");
        e2.matricula = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Endereço: ");
        e2.endereco = sc.nextLine();
        
        sc.close();
        
        
        
        
    }

}
