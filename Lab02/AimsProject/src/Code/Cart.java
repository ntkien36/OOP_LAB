package Code;
import Code.DigitalVideoDisc;

public class Cart {
	public final static int MAX_NUMBERS_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
    	if(qtyOrdered < MAX_NUMBERS_ORDERED)
		{
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.printf("The disc " + disc.getTitle() + " has been added\n");
		}
		else {
			System.out.printf("The cart is almost full\n");
		}
    }
// New method 1 adding a list of DVDs to the current cart
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for(DigitalVideoDisc disc: dvdList){
            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
                itemsOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added");
            }
            else{
                System.out.println("The cart is almost full");
                break;
            }
        }
    }
// New method 2 for passing an arbitrary number of arguments for dvd
//    public void addDigitalVideoDisc(DigitalVideoDisc ...dvdList){
//        for(DigitalVideoDisc disc: dvdList){
//            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
//                itemsOrdered[qtyOrdered] = disc;
//                qtyOrdered++;
//                System.out.println("The disc has been added");
//            }
//            else{
//                System.out.println("The cart is almost full");
//                break;
//            }
//        }
//    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = 0;
        for(int i=0; i<qtyOrdered; i++){
            if(disc.equals(itemsOrdered[i])) break;
            index++;
        }
        for(int i=index; i<qtyOrdered-1; i++){
            itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered--;
		System.out.printf("The disc " + disc.getTitle() + " has been removed\n");
	}
    public float totalCost() {
		float SUM = 0 ;
		for ( int i = 0 ; i < qtyOrdered ; i++ ) {
				SUM += itemsOrdered[i].getCost();
		}
		return SUM;
	}
    
	
}
