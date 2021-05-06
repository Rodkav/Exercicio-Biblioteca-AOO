public class Livro {
    public class livro {

        String nome;
        Autor autor;
        Pessoa emprestadoPor;

        public livro(String nome, Autor autor) {
            this.nome = nome;
            this.autor = autor;

        }

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Autor getAutor() {
            return this.autor;
        }

        public void setAutor(Autor autor) {
            this.autor = autor;
        }

        public String getemprestadoPor() {
            return this.nome;
        }

        public void setEmprestadoPor(Pessoa emprestadoPor) {
            this.emprestadoPor = emprestadoPor;
        }

    }
}
