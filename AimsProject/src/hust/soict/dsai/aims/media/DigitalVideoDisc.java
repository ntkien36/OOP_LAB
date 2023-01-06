package hust.soict.dsai.aims.media;

import javax.swing.JDialog;
import javax.swing.JLabel;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable {
//    private String director;
//
//    private int length;


// update the nbDigitalVideoDiscs, assign the appropriate value for the id
    public DigitalVideoDisc() {
        super();
    }
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super(title, category, director, length, cost);
    }
//    public DigitalVideoDisc(String title, String category, float cost, String director, int length){
//        super(title, category, cost, director, length);
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.id + ". DVD - "
                + this.title + " - "
                + this.category + " - "
                + this.director + " - "
                + this.length + ": "
                + this.cost + " $";
    }

    public boolean isMatch(String title) {
        return this.title.equals(title);
    }
    @Override
    public boolean equals(Object obj) {
        DigitalVideoDisc disc = (DigitalVideoDisc) obj;
        return this.title.equals(disc.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length
                && this.cost == disc.cost;
    }
    @Override
    public void play() throws PlayerException {
		// TODO Auto-generated method stub
		if (this.getLength() > 0) {
			JDialog dialog = new JDialog();
			dialog.setSize(300, 200);

			// create Label
			JLabel text = new JLabel("DVD - Title : " + this.getTitle() + " Length : " + this.getLength());
			dialog.add(text);
			dialog.setTitle("Play DVD");
			dialog.setVisible(true);
		} else
			throw new PlayerException("ERROR : DVD length is non-positive");
	}
}
