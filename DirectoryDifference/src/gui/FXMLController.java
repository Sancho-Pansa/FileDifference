package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import differencer.Differencer;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FXMLController {
	
	@FXML
	private TextField pathFieldA, pathFieldB;
	
	@FXML
	private Button actionButton;
	
	@FXML
	private TextArea areaAbsenceA, areaAbsenceB;
	
	@FXML
	private void findDifference() throws FileNotFoundException {
		File a = new File(pathFieldA.getText());
		File b = new File(pathFieldB.getText());
		if(!a.exists() || !b.exists())
			throw new FileNotFoundException();
		Differencer diff = new Differencer();
		for(String x: diff.compareBetween(a, b))
			appendTextArea(areaAbsenceB, x);
		for(String x: diff.compareBetween(b, a))
			appendTextArea(areaAbsenceA, x);
	}
	
	private void appendTextArea(TextArea ta, String s) {
		ta.appendText(s + "\n");
	}
}
