package ku.cs.shop.controllers;

import com.github.saacsos.src.main.java.com.github.saacsos.FXRouter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import ku.cs.shop.models.MemberCard;
import ku.cs.shop.models.MemberCardList;
import ku.cs.shop.services.MemberCardListHardCodeDataSource;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.io.IOException;


public class MemberCardListController {
    @FXML
    private ListView<MemberCard> cardsListView;

    @FXML private Label nameLabel;
    @FXML private Label phoneLabel;
    @FXML private Label cpLabel;
    @FXML private Label ptLabel;

    private MemberCardListHardCodeDataSource dataSource;
    private MemberCardList cardList;

    @FXML
    public void initialize() {
        dataSource = new MemberCardListHardCodeDataSource();
        cardList = dataSource.getCardList();
        showListView();
        clearSelectedMemberCard();
        handleSelectedListView();
    }

    private void showListView() {
        cardsListView.getItems().addAll(cardList.getAllCards());
        cardsListView.refresh();
    }


    private void handleSelectedListView() {
        cardsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<MemberCard>() {
                    @Override
                    public void changed(ObservableValue<? extends MemberCard> observable,
                                        MemberCard oldValue, MemberCard newValue) {
                        System.out.println(newValue + " is selected");
                        showSelectedMemberCard(newValue);
                    }
        });
    }

    private void showSelectedMemberCard(MemberCard card) {
        nameLabel.setText(card.getName());
        phoneLabel.setText(card.getPhone());
        cpLabel.setText(String.format("%.2f", card.getCumulativePurchase()));
        ptLabel.setText(String.valueOf(card.getStamp()));
    }

    private void clearSelectedMemberCard() {
        nameLabel.setText("");
        phoneLabel.setText("");
        cpLabel.setText("");
        ptLabel.setText("");
    }

    @FXML
    public void handlebackButton(ActionEvent event) {
        try{
            FXRouter.goTo("home");
        }catch (IOException e){
            System.err.println("??????????????????????????? home ??????????????????");
            System.err.println("?????????????????????????????????????????????????????? route");
        }

    }

}
