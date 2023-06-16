
package correçãodiagraclasses;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    private Curso curso;
    private ArrayList<Double> notas;
    
    //metodo construtor de Aluno (chamando o super)
    public Aluno(){
        super();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    public Double calcularMedia(){
        double soma = 0;
        for(Double nota: getNotas()){
            soma += nota;
            
        }
        double media = soma/notas.size();
        return media;
    }
    public void imrpimir(){
        System.out.println("------Dados do Aluno");
        super.imprimir();
        getCurso().imrpimirCurso();
        for(int i = 0;i<getNotas().size();i++){
            System.out.println(getNotas().get(i).toString());
        }
            System.out.println("Media: "+calcularMedia());
    }
}
