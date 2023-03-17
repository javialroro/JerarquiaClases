public class Rectangulo extends Figura{
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
    public double calcularArea(){
        return base * altura;
    }

    public int numeroLados(){
        return 4;
    }
}

