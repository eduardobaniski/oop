public class Data {
    private int dia, mes, ano;

    
    public String toString() {
        return dia+"/"+mes+"/"+ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia < 0 || dia > 31){
            System.out.println("Dia inválido, não foi possivel configurar o dia.");
            return;
        }
            this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(dia < 0 || dia > 12){
            System.out.println("Mes inválido, não foi possivel configurar o mes.");
            return;
        }
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
