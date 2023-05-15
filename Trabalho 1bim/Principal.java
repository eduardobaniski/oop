public class Principal {
    public static void main(String[] args) {
        //Cria uma instância de um aluno com seus atributos
        Aluno carlos = new Aluno("Carlos Eduardo", "123456789", new Data(01, 02, 1975), "123456");
        
        //Matricula o aluno em quatro disciplinas 
        carlos.matricular(4);
        System.out.println("Informações do aluno: \n"+carlos.toString());
        System.out.println("Horas semanais de aula: "+carlos.getCargaSemanal());

        //Cria e adiciona 3 funcionários ao vetor de funcionários v
        Funcionario v[] = new Funcionario[3];
        Funcionario f1 = new Funcionario("Antonio", new Data(11, 12, 1955), "456789", 500);
        Chefe f2 = new Chefe("Bernardo", "987654321", new Data(05, 05,1999), "555555", 1000, "Chefe de dept");
        Professor f3 = new Professor("Diego", new Data(22, 10, 1988), "121212", 800, 40);
        v[0] = f1;
        v[1] = f2;
        v[2] = f3;

        //Imprime as informações de cada funcionario
        for(int i=0; i<3; i++){
            System.out.println(i+1+"o Funcionario: "+v[i].toString()+"\n");
        }

        //Passa o array de funcionários para o ControleSalario
        ControleSalario salarios = new ControleSalario(v);
        System.out.println("A soma de salarios base é: "+salarios.getSomaSalarioBase());
        System.out.println("A soma de salarios com bonificação é: "+salarios.getSomaSalarioBonificado());
    }
}
