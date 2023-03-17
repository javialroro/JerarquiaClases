public abstract class Figura implements Comparable<Figura>{
    public abstract double calcularArea();

    public abstract int numeroLados();

    public int compareTo(Figura f){
        if(this.calcularArea() > f.calcularArea()){
            System.out.println("El area de la figura " + this.getClass().getSimpleName() + " es mayor que el area de la figura " + f.getClass().getSimpleName());
            return 1;
        }else if(this.calcularArea() < f.calcularArea()){
            System.out.println("El area de la figura " + this.getClass().getSimpleName() + " es menor que el area de la figura " + f.getClass().getSimpleName());
            return -1;
        }else{
            // Si tienen el mismo area, va a retornar los mismos valores 1 y -1 comparando los lados
            if (this.numeroLados() > f.numeroLados()){
                System.out.println("La  " + this.getClass().getSimpleName() + " tiene mas lados que la figura " + f.getClass().getSimpleName());
                return 1;
            }else if(this.numeroLados() < f.numeroLados()){
                System.out.println("La figura " + this.getClass().getSimpleName() + " tiene menos lados que la figura " + f.getClass().getSimpleName());
                return -1;
            }
        }
        return 0;
    }
}
