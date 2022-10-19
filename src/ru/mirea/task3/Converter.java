package ru.mirea.task3;

public class Converter {
    private final double currencyRUB = 1;
    private double money;
    private double currencyUSD;
    private double currencyEUR;

    public Converter(float money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public String getCurrencyUSD() {
        currencyUSD = this.money / 61.88;
        return "USD: " + currencyUSD;
    }

    public String getCurrencyEUR() {
        currencyEUR = this.money / 59.94;
        return "Euro: " + currencyEUR;
    }

    @Override
    public String toString() {
        return "Converter: " + "currencyUSD = " + currencyUSD + ", currencyEUR = " + currencyEUR;
    }

    public static void main(String[] args) {
        Converter con = new Converter(1000);
        System.out.println(con.getCurrencyUSD());
        System.out.println(con.getCurrencyEUR());
        System.out.print(con.toString());
    }
}
