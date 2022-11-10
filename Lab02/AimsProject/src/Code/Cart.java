package Code;
import Code.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
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
