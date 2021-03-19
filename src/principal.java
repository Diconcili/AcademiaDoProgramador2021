import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);   
       
             
       RecebeEquipamento recebe = new RecebeEquipamento();
       RecebeChamados recebeChamados = new RecebeChamados();
       
       
       ArrayList<Chamados> listaDeChamados = new ArrayList();              
       ArrayList<Equipamentos> listaDeEquipamentos = new ArrayList();
       
        System.out.println("Menu: ");
        System.out.println("1 - Registrar equipamento");
        System.out.println("2 - Editar lista de equipamentos");
        System.out.println("3 - Registrar chamado");
        System.out.println("4 - Editar lista de chamados");
        System.out.println("Observação 1: O nome do equipamento deve conter o menos 6 letras.");
        System.out.println("Observação 2: Editar a lista implica em refazê-la completamente.");        
        int operação = entrada.nextInt();
       
       switch (operação){
           
           
           case 1: System.out.println("Quantos equipamentos serão registrados?");
        int quantEquipamentos = entrada.nextInt();
        
        for (int x = 0; x<quantEquipamentos; x++){            
            System.out.print("Digite o nome do equipamento: ");
            String nome = entrada.next();
            if (nome.length()<6){
            System.out.println("O nome deve ter mais de 6 caracteres, repita o processo.");
            break;}
            
            System.out.print("Digite o preço de aquisição do equipamento: ");
            String preço = entrada.next();
            
            System.out.print("Digite o fabricante do equipamento: ");
            String fabricante = entrada.next();
            
            System.out.print("Digite o número de série do equipamento: ");
            String nSérie = entrada.next();
            
            System.out.print("Insira  data de fabricação do equipamento: ");
            String dataFabricação = entrada.next();
            
            Equipamentos equipamento = new Equipamentos(nome, preço, fabricante, nSérie, dataFabricação);
            
            recebe.associaListaDeEquipamentos(listaDeEquipamentos);
            listaDeEquipamentos.add(equipamento);
        }                
        System.out.println(recebe.toString());    
        break;
        
        
                case 2: System.out.println("Quantos equipamentos estarão na lista?");
                int editarEquipamentos = entrada.nextInt();
                
                for(int y=0; y<editarEquipamentos;y++){
            System.out.print("Digite o nome do equipamento: ");
            String nome = entrada.next();
            if (nome.length()<6){
            System.out.println("O nome deve ter mais de 6 caracteres, repita o processo.");
            break;}
            
            System.out.print("Digite o preço de aquisição do equipamento: ");
            String preço = entrada.next();
            
            System.out.print("Digite o fabricante do equipamento: ");
            String fabricante = entrada.next();
            
            System.out.print("Digite o número de série do equipamento: ");
            String nSérie = entrada.next();
            
            System.out.print("Insira  data de fabricação do equipamento: ");
            String dataFabricação = entrada.next();
            
            Equipamentos equipamento = new Equipamentos(nome, preço, fabricante, nSérie, dataFabricação);
            
            recebe.associaListaDeEquipamentos(listaDeEquipamentos);
            listaDeEquipamentos.add(equipamento);
                }
                    System.out.println(recebe.toString());
        break;
        
        
                case 3: System.out.println("Quantos chamados serão registrados?"); 
        int quantChamados = entrada.nextInt();
        for(int z = 0; z<quantChamados; z++){
            System.out.print("Digite o título do chamado: ");
            String titulo = entrada.next();
            
            System.out.println("Digite a descrição do chamado (nome da peça a ser consertada) : ");
            String descrição = entrada.next();
            
            System.out.print("Digite o nome do equipamento registrado no chamado: ");
            String nomeEquipamento = entrada.next();
            if (nomeEquipamento.length()<6){
            System.out.println("O nome deve ter mais de 6 caracteres, repita o processo.");
            break;}
            
            System.out.print("Digite a data de abertura do chamado: ");
            String dataAbertura = entrada.next();            
            
            Chamados chamado = new Chamados(titulo, descrição, nomeEquipamento, dataAbertura);
            
            recebeChamados.associaListaDeChamados(listaDeChamados);
            listaDeChamados.add(chamado);
        }
      
        System.out.println(recebeChamados.toString());
        break;
        
        
                case 4: System.out.println("Quantos chamados serão registrados?"); 
        int editarChamados = entrada.nextInt();
        for(int w = 0; w<editarChamados; w++){
            System.out.print("Digite o título do chamado: ");
            String titulo = entrada.next();
            
            System.out.println("Digite a descrição do chamado (nome da peça a ser consertada) : ");
            String descrição = entrada.next();
            
            System.out.print("Digite o nome do equipamento registrado no chamado: ");
            String nomeEquipamento = entrada.next();
            if (nomeEquipamento.length()<6){
            System.out.println("O nome deve ter mais de 6 caracteres, repita o processo.");
            break;}
            
            System.out.print("Digite a data de abertura do chamado: ");
            String dataAbertura = entrada.next(); 
            
            
            Chamados chamado = new Chamados(titulo, descrição, nomeEquipamento, dataAbertura);
            
            recebeChamados.associaListaDeChamados(listaDeChamados);
            listaDeChamados.add(chamado);
        }
      
        System.out.println(recebeChamados.toString());
        break;
                default: System.out.println("Comando indisponível");
                break;
    }   
    }
                      
    }
    

