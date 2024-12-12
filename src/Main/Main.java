package Main;
import Classe.Cliente;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random cadastro = new Random();
        Scanner teclado = new Scanner(System.in);
        ArrayList <Cliente> cliente = new ArrayList<Cliente>();

        Cliente cl1 = new Cliente();
        cl1.setNomeCompleto("Arthur Victor da Silva Santos");
        cl1.setIdade(19);
        cl1.setCpf(null);
        cl1.setEndereco(null);
        cl1.setCelular(null);
        cl1.setCadastro(cadastro.nextInt(1000)); // Ainda em rumo a fixação do numero aleatorio pra cadastro!
        cl1.setAniversario("04/02");
        
        // add dados de cl1 ao arraylist
        cliente.add(cl1);

        Cliente cl2 = new Cliente();
        cl2.setNomeCompleto("Wagner Barbosa");
        cl2.setIdade(18);

        cliente.add(cl2);

        for(Cliente clientes : cliente){
            System.out.println("Seu nome é: " + clientes.getNomeCompleto());
            System.out.print("Suas outras informações são privadas, gostaria de ver? "); // Escolha...
            String escolha = teclado.nextLine();
            if(escolha.equals("Sim") || escolha.equals("sim")){
                System.out.println("Sua idade é: " + clientes.getIdade());
            } else {
                System.out.println("Informações ocultadas");
            } 
            System.out.println("-----");
        }

        teclado.close();
    }
}
