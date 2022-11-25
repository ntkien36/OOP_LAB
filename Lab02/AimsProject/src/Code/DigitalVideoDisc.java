package Code;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDisc = 0;
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	// update the nbDigitalVideoDiscs, assign the appropriate value for the id
    public DigitalVideoDisc() {
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.director=director;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category, String director,int length, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.director=director;
		this.length=length;
		this.cost=cost;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}	
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
    public boolean equals(Object obj){
        DigitalVideoDisc disc = (DigitalVideoDisc)obj;
        return this.title.equals(disc.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length
                && this.cost == disc.cost;
    }
}
