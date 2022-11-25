package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[10];
    private int quantity = 0;

// add & remove DVDs    
    public void addDVD(DigitalVideoDisc ...dvdList){
        for(DigitalVideoDisc dvd:dvdList){
            itemsInStore[quantity] = dvd;
            quantity++;
        }
    }
    
    public void removeDVD(DigitalVideoDisc dvd){
        int dvdid = 0;
        for (int i=0; i<quantity; i++) {
            if (itemsInStore[i].equals(dvd)) {
                break;
            }
            dvdid++;
        }
        for(int i=dvdid; i<quantity; i++){
        	itemsInStore[i] = itemsInStore[i+1];
        }
        quantity --;
    }

// print Store
    public void print() {
        System.out.println("***********************STORE***********************");
        for (int i = 0; i < quantity; i++) {
            System.out.println(itemsInStore[i].toString());
        }
        System.out.println("**************************************************");
    }
}