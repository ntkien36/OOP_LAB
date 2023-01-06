package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int quantity = 0;
    public void addMedia(Media ...m_list){
        for(Media m:m_list){
            itemsInStore.add(m);
            quantity++;
        }
    }
    public void removeMedia(Media m) {
		for(Media media: itemsInStore) {
			if(media.getTitle() == m.getTitle()) {
				itemsInStore.remove(m);
				quantity --;
				System.out.println("The disc has been removed");
			}
		}
	}
    public boolean search(int id) {
		for(Media m: itemsInStore) {
			if(m.getId() == id) {
				return true;
			}
		}
		return false;
	}
	// Search by Title
	public boolean search(String title) {
		for(Media m: itemsInStore) {
			if(m.getTitle() == title) {
				return true;
			}
		}
		return false;
	}
	public void printStore() {
		System.out.println("***********************STORE***********************");
		int i = 1;
		for(Media m: itemsInStore) {
			System.out.println((i) + ".DVD - " + m.getTitle() + " - " + 
					m.getCategory() + " - " + 
					m.getTitle() + " - " + 
//					m.getDirector() + " - " + 
//					m.getLength() + " : " + 
					m.getCost());
			i++;
		}
		System.out.println("***************************************************");
	}
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

//// print Store
//    public void print() {
//        System.out.println("***********************STORE***********************");
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(itemsInStore[i].toString());
//        }
//        System.out.println("**************************************************");
//    }
}
