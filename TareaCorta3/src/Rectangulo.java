public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private double base;
    private double altura;
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base * altura;
    }

    public int numeroLados(){
        return 4;
    }

    public void compareTo(Rectangulo o){
        if (this.calcularArea() == o.calcularArea()){
            if (this.numeroLados() == o.numeroLados()){
                System.out.println("Son iguales");
            }
            else if (this.numeroLados() > o.numeroLados()){
                System.out.println("El rectangulo 1 tiene mas lados");
            }
            else {
                System.out.println("El rectangulo 2 tiene mas lados");
            }
            System.out.println("0");
        }

        if(this.calcularArea() > o.calcularArea()){
            System.out.println("1");
        }else {
            System.out.println("-1");
        }
    }
}

