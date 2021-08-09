package com.barchenko.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator{

    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSaleOffers;

    private int collegueCodes = 0;

    public StockMediator() {
        this.colleagues = new ArrayList<>();
        this.stockBuyOffers = new ArrayList<>();
        this.stockSaleOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
        collegueCodes++;
        colleague.setColleagueCode(collegueCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        for (StockOffer offer:stockBuyOffers) {
            if (offer.getStockSymbol().equals(stock) && offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock +
                        " sold to colleague code " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockSold = true;
            }
            if (stockSold) {
                break;
            }
        }
        if (!stockSold) {
            System.out.println(shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockSaleOffers.add(newOffering);

        }

    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {
        boolean stockBought = false;
        for (StockOffer offer:stockBuyOffers) {
            if (offer.getStockSymbol().equals(stock) && offer.getStockShares() == shares) {
                System.out.println(shares + " shares of " + stock +
                        " bought to colleague code " + offer.getColleagueCode());
                stockBuyOffers.remove(offer);
                stockBought = true;
            }
            if (stockBought) {
                break;
            }
        }
        if (!stockBought) {
            System.out.println(shares + " shares of " + stock +
                    " added to inventory");
            StockOffer newOffering = new StockOffer(shares, stock, collCode);
            stockBuyOffers.add(newOffering);

        }
    }

    public void getstockOfferings() {
        System.out.println("\nStocks for Sale");

        for(StockOffer offer: stockSaleOffers){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

        System.out.println("\nStock Buy Offers");
        for(StockOffer offer: stockBuyOffers){
            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());
        }

    }
}
