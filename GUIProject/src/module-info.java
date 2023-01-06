module GUIProject {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.media;
	exports hust.soict.hedspi.javafx;
	opens hust.soict.hedspi.javafx to javafx.graphics, javafx.fxml;
	
	
}
