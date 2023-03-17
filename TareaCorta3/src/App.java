public class App {
    public static void main(String[] args) throws Exception {

         Circulo c = new Circulo(2);
         c.setRadio(4);
         Triangulo t = new Triangulo(2, 3);
         t.setBase(8);
         t.setAltura(4);
         Rectangulo r = new Rectangulo(2, 3);
         r.setBase(8);
         r.setAltura(2);

         c.compareTo(t);
         r.compareTo(c);
         t.compareTo(r);
         r.compareTo(t);

    }
}
