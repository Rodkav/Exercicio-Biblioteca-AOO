public class Main {

    public static void main(String[] args) {
        
        Autor autor1 = new Autor("");
        autor1.nome = "Stephen Hawking";
        autor1.nacionalidade = "Reino Unido";
        Autor autor2 = new Autor("");
        autor2.nome =  "Stephen Covey";
        autor2.nacionalidade = "Estados Unidos";
        Aluno aluno1 = new Aluno("");
        aluno1.nome = "Gardenio";
        aluno1.codigo = "85439";
        Aluno aluno2 = new Aluno("");
        aluno2.nome = "Jenilson";
        aluno2.codigo = "67283";
        Professor Prof1 = new Professor();
        Prof1.nome = "Nelson Rubens";
        Prof1.codigo = "2469";


        Livro livro1 = new Livro();
        livro1.nome = "Uma breve história do tempo";
        livro1.autor1 = "Stephen Hawking";
        livro1.emprestadoPor = "Gardenio";

        Livro livro2 = new Livro();
        livro2.nome = "Os 7 hábitos das pessoa altamente eficazes";
        livro2.autor2 = "Stephen Covey";
        livro2.emprestadoPor = "Jenilson";

        System.out.println("Biblioteca Mundial");
        System.out.println("==================");
        System.out.println("A seguir sera apresentado os livros emprestados");
        System.out.println("Sendo eles:");
        System.out.println("==================");
        System.out.println("O livro"+livro1.nome);
        System.out.println("Do autor"+livro1.autor1+" do" +autor1.nacionalidade);
        System.out.println("Esta com o "+aluno1.nome);
        System.out.println("=====================");
        System.out.println("Ha tambem outro livro emprestado:")
        System.out.println("O livro"+livro2.nome);
        System.out.println("Do autor"+livro2.autor2+" do" +autor2.nacionalidade);
        System.out.println("Esta com o "+aluno2.nome);
        System.out.println("=====================");
        System.out.println("E eh isso, ateh a proxima.");


    }
}
