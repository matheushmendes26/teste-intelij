package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato  =  new Gato();
        System.out.println(gato);

        Livro livro = new Livro();
        livro.nome = "AAAA";
        livro.numPag = 300;
        System.out.println(livro);
        /*        int a = 5;
        int b = 4;
        System.out.println("Hello World!"+ (a+b));*/
    }
}

class Livro{
    public String nome;
    public Integer numPag;

    public Livro() {
        this.nome = nome;
        this.numPag = numPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }
}