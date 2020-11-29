package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    TextField Text1;
    @FXML
    TextField Text2;
    @FXML
    TextField TextResult;


    public void plus(){

        int første = Integer.parseInt(Text1.getText());

        int anden = Integer.parseInt(Text2.getText());

        int result = første + anden;

        TextResult.setText(String.valueOf(result));

    }
    public void minus(){

        int første = Integer.parseInt(Text1.getText());

        int anden = Integer.parseInt(Text2.getText());

        int result = første - anden;

        TextResult.setText(String.valueOf(result));

    }
    public void gange(){

        int første = Integer.parseInt(Text1.getText());

        int anden = Integer.parseInt(Text2.getText());

        int result = første * anden;

        TextResult.setText(String.valueOf(result));

    }
    public void dividere(){

        int første = Integer.parseInt(Text1.getText());

        int anden = Integer.parseInt(Text2.getText());

        int result = første / anden;

        TextResult.setText(String.valueOf(result));

    }


}
