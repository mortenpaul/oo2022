public class Main {
    public static void main(String[] arg) {
        Kujund1 ristkülik = new Kujund1();
        Kujund2 ruut = new Kujund2();
        double[] ristkülikAndmed = {4, 12};
        double[] ruutAndmed = {3};
        double ristkülikPindala=ristkülik.Pindala(ristkülikAndmed);
        double ruutPindala=ruut.Pindala(ruutAndmed);
        double ristkülikUmbermoot=ristkülik.Umbermoot(ristkülikAndmed);
        double ruutUmbermoot=ruut.Umbermoot(ruutAndmed);

        System.out.println("ristküliku pindala on " + ristkülikPindala + " ruutühikut");
        System.out.println("ruudu pindala on "  + ruutPindala + " ruutühikut");
        System.out.println("ristküliku ümbermoot on " + ristkülikUmbermoot + " ühikut");
        System.out.println("ruudu ümbermõõt on " + ruutUmbermoot + " ühikut");
    }
}