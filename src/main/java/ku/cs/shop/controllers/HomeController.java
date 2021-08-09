package ku.cs.shop.controllers;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import ku.cs.shop.models.MemberCard;
import com.github.saacsos.src.main.java.com.github.saacsos.FXRouter;
import javafx.event.ActionEvent;
import java.io.IOException;


public class HomeController {
    private MemberCard john, anna, harry;

    @FXML
    public void initialize() {
        john = new MemberCard("John Smith", "081-222-8888");
        anna = new MemberCard("Anna Frost", "082-333-9999", 135);
        harry = new MemberCard("Harry Potter", "083-444-0000", 40000);
    }
    @FXML
    public void handlecreateButton(ActionEvent event){
        try {
            FXRouter.goTo("viewhome");
        }catch (IOException e){
            System.err.println("ไปที่หน้า viewhome ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML
    public void handleJohnMemberCardButton(ActionEvent actionEvent) {
        try {
            FXRouter.goTo("member_card_detail", john);
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_detail ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML
    public void handleAnnaMemberCardButton(ActionEvent actionEvent) {
        try {
            FXRouter.goTo("member_card_detail", anna);
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_detail ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML
    public void handleHarryMemberCardButton(ActionEvent actionEvent) {
        try {
            FXRouter.goTo("member_card_detail", harry);
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_detail ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML
    public void handlemembercardlistButton(ActionEvent actionEvent) {
        try {
            FXRouter.goTo("member_card_list");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_list ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }


}
