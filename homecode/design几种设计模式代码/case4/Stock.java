package priv.design.case4;

import java.util.ArrayList;


public class Stock {
    private ArrayList<Investor> investors = new ArrayList<>();
    private String stockName;
    private double price;

    public Stock(String stockName, double price){
        this.stockName = stockName;
        this.price = price;
    }

    public void notifyInvestor(){
        for (Investor investor : investors) {
            investor.response(this);
        }
    }

    public void attach(Investor investor){
        investors.add(investor);
    }

    public void detach(Investor investor){
        investors.remove(investor);
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(1 - this.price / price > 0.05){
            notifyInvestor();
        }
        this.price = price;
    }
}

