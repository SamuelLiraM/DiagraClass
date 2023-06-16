package correçãodiagraclasses;

import java.util.Scanner;
import java.util.ArrayList;

public class CorreçãoDiagraClasses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        Curso curso;
        ArrayList<Curso> cursos;
        
        Aluno novoAluno = new Aluno();
        ArrayList<Double> notas = new ArrayList<>();
        
        Telefone telefone;
        ArrayList<Telefone> telefones;
        
        Professor novoProf = new Professor();
        Endereço endereco;
        
        System.out.println("--------Cadastro do Professor---------");
        
        System.out.println("Digite o nome do professor: ");
        novoProf.setNome(sc.nextLine());
        
        System.out.println("Digite o email do professor: ");
        novoProf.setEmail(sc.nextLine());
        
        System.out.println("Digite o cpf do professor: ");
        novoProf.setCpf(sc.nextLine());
        
        endereco = new Endereço();
        
        System.out.println("Digite a Rua: ");
        endereco.setRua(sc.nextLine());
        
        System.out.println("Digite a Cidade: ");
        endereco.setCidade(sc.nextLine());
        
        System.out.println("Digite a Estado: ");
        endereco.setEstado(sc.nextLine());
        
        novoProf.setEndereco(endereco);
        
        telefones = new ArrayList<>();
        System.out.println("Digite os telefones do professor - maximo 2");
        for(int i = 0 ; i < 2 ; i++){
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD do telefone: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero do telefone: ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
        }
        
        novoProf.setTelefones(telefones);
        
        System.out.println("Digite a titulação: ");
        novoProf.setTitulacao(sc.nextLine());
        
        System.out.println("Digite o salario: ");
        novoProf.setSalario(sc.nextDouble());
        
        sc.nextLine();
        cursos = new ArrayList<>();
        System.out.println("Digite os cursos do professor - maximo 2");
        for(int i = 0 ; i < 2 ; i++){
            curso = new Curso();
            System.out.println("Digite o nome do curso: ");
            curso.setNome(sc.nextLine());
            cursos.add(curso);    
        }
        
        novoProf.setCursos(cursos);
        
        System.out.println("--------Cadastro do Aluno---------");
        
        System.out.println("Digite o nome do Aluno: ");
        novoAluno.setNome(sc.nextLine());
        
        System.out.println("Digite o email do Aluno: ");
        novoAluno.setEmail(sc.nextLine());
        
        System.out.println("Digite o cpf do Aluno: ");
        novoAluno.setCpf(sc.nextLine());
        
        endereco = new Endereço();
        
        System.out.println("Digite a Rua: ");
        endereco.setRua(sc.nextLine());
        
        System.out.println("Digite a Cidade: ");
        endereco.setCidade(sc.nextLine());
        
        System.out.println("Digite a Estado: ");
        endereco.setEstado(sc.nextLine());
        
        novoAluno.setEndereco(endereco);
        
        telefones = new ArrayList<>();
        System.out.println("Digite os telefones do professor - maximo 2");
        for(int i = 0 ; i < 2 ; i++){
            telefone = new Telefone();
            System.out.println("Digite o tipo do telefone: ");
            telefone.setTipo(sc.nextLine());
            System.out.println("Digite o DDD do telefone: ");
            telefone.setDdd(sc.nextLine());
            System.out.println("Digite o numero do telefone: ");
            telefone.setNumero(sc.nextLine());
            telefones.add(telefone);
        }
        
        novoAluno.setTelefones(telefones);
        
        curso = new Curso();
        System.out.println("Digite o curso do aluno: ");
        curso.setNome(sc.nextLine());
        
        novoAluno.setCurso(curso);
        
        System.out.println("Digite as notas do aluno: ");
        for(int i = 0 ; i < 2 ; i++){
            notas.add(sc.nextDouble());
        }
        novoAluno.setNotas(notas);
        
        novoProf.imprimir();
        novoAluno.imprimir();
        
    }
}
