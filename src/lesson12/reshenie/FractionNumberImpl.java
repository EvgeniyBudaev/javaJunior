package lesson12.reshenie;

public class FractionNumberImpl implements FractionNumber {
    private int chislitel;
    private int znamenatel;

    public FractionNumberImpl(){

    }

    public FractionNumberImpl(int chislitel, int znamenatel){
        this.chislitel = chislitel;
        this.znamenatel = znamenatel;
    }

    @Override
    public void setDividend(int dividend) {
        this.chislitel = dividend;
    }

    @Override
    public double getDividend() {
        return this.chislitel;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.znamenatel = divisor;
    }

    @Override
    public double getDivisor() {
        return this.znamenatel;
    }

    @Override
    public double value() {
        return (double)this.chislitel/(double)this.znamenatel;
    }

    @Override
    public String toString() { //переопределение метода, чтобы на консоли выводилось красиво, а не чехарда букв.
        return  chislitel + " / " + znamenatel;

    }
}
