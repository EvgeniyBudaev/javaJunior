package lesson15;

public class Coin implements Comparable<Coin>{ //класс монет
    private double diametr;
    private int year;
    private int nominal;

    public Coin() {
    }

    public Coin(double diametr, int year, int nominal){
        this.diametr = diametr;
        this.year = year;
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr =" + diametr +
                ", year =" + year +
                ", nominal =" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (Double.compare(coin.diametr, diametr) != 0) return false;
        if (year != coin.year) return false;
        return nominal == coin.nominal;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(diametr);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + year;
        result = 31 * result + nominal;
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        if(this.year != o.year){
            return this.year - o.year;
        }

        if(this.diametr != o.diametr){
            return (int) (this.diametr - o.diametr);
        }

        return this.nominal - o.nominal;
    }
}
