public class ControleSalario {
    private double somaSalarioBase, somaSalarioBonificado;

    public ControleSalario(Funcionario v[]){
        for(int i=0; i < v.length; i++){
            somaSalarioBase += v[i].getSalario();
            somaSalarioBonificado += v[i].getSalarioComBonificacao();
        }
    }

    public double getSomaSalarioBase() {
        return somaSalarioBase;
    }

    public double getSomaSalarioBonificado() {
        return somaSalarioBonificado;
    }

    
}
