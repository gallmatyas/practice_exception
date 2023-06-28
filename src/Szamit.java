public class Szamit {
    public double duplaz(double szam) throws NegativSzamException {
        if (szam < 0) {
            throw new NegativSzamException("nem lehet a szám negatív");
        } else {
            return szam * 2;
        }
    }
}
