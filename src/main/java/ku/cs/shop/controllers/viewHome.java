package ku.cs.shop.controllers;

import com.github.saacsos.src.main.java.com.github.saacsos.FXRouter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.shop.models.MemberCard;

import java.io.IOException;

public class viewHome {
    @FXML private ImageView image;

    @FXML
    public void initialize() {
        String path = getClass().getResource("/image/ice1.jpg").toExternalForm();
        image.setImage(new Image(path));
    }

    @FXML
    public void handlebackButton(ActionEvent event){
        try {
            FXRouter.goTo("home");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า home ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }

    }

}
