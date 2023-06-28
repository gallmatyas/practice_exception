public class Program {

    public static void main(String[] args) throws NegativSzamException {
        Szamit szamit = new Szamit();

        try {
            double result = szamit.duplaz(-3.8);
            System.out.println(result);
        } catch (NegativSzamException e) {
            System.out.println(e.getMessage());
        }
    }
}

