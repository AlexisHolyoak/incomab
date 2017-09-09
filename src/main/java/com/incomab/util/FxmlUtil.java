/*
 * Developed by: Alexis Peralta Holyoak.
 */
package com.incomab.util;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import java.io.IOException;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
/**
 *
 * @author peral
 */
public class FxmlUtil {    
      public void OpenNewScene(String resource,boolean border,boolean maximized){
         try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resource));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                if(!border){
                stage.initStyle(StageStyle.TRANSPARENT);
                }
                if(maximized){
                stage.setMaximized(true);
                }
                stage.setScene(new Scene(root1));  
                stage.show();
        } catch(IOException e) {
                System.out.println(e.getMessage());
          }
    }
    /*Method Created By: Alexis Peralta Holyoak
    Params: String,String, StacPane
    Return: One dialog*/
    public void ShowMessageDialog(String header, String content,StackPane stackPane){
       stackPane.setDisable(false);
       JFXDialogLayout dialogLayout=new JFXDialogLayout();
       dialogLayout.setHeading(new Text(header));
       dialogLayout.setBody(new Label(content));
       JFXButton btnOk=new JFXButton("Aceptar");
       JFXDialog dialog=new JFXDialog(stackPane, dialogLayout, JFXDialog.DialogTransition.CENTER);
       btnOk.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               stackPane.setDisable(true);
               dialog.close();
           }
       });
       dialog.setOnDialogClosed(disableStackPane->{
            stackPane.setDisable(true);
        });
       dialogLayout.setActions(btnOk);        
       dialog.show();        
    }
    public void ShowAlert(Alert.AlertType type,String title,String content,String header,String exception){
        Alert alert=new Alert(type);          
        alert.setTitle(title);
        alert.setContentText(content);
        if(header!=null){
            alert.setHeaderText(header);
        }        
        ButtonType buttonCancel=new ButtonType("Cancelar", ButtonBar.ButtonData.CANCEL_CLOSE);
        ButtonType buttonSendFail=null;
        if(exception != null){
            TextArea area=new TextArea(exception);
            alert.getDialogPane().setExpandableContent(area);
            buttonSendFail=new ButtonType("Reportar error");
        }
        if(buttonSendFail!=null){
            alert.getButtonTypes().setAll(buttonSendFail,buttonCancel);
        }else{
            alert.getButtonTypes().setAll(buttonCancel);
        }
        Optional<ButtonType> result=alert.showAndWait();
        if(result.get()==buttonSendFail){
            //TODO:handle send issue to github
        }
    }
    /*Method Created By: Alexis Peralta Holyoak
    Params: type 1: for insert
            type 2. for update
            type 3: for delete
            type 4: for information
    Position can be anywhere u want
    Fill title and txt when showing information, so type must be 4
    Return: One push notification on screen*/
    public void ShowPushNotification(String title,String txt,int type,Pos pos){
       
        Image insert=new Image(getClass().getResourceAsStream("/images/insert.png"));
        Image update=new Image("/images/update.png");
        Image delete=new Image("/images/delete.png");
        Image information=new Image("/images/information.png");
        Notifications notifications=null;        
        switch(type){
            case 1:
                notifications=Notifications.create()
                .title("Registro insertado")
                .text("La información se registro correctamente")
                .hideAfter(Duration.seconds(3))
                .position(pos)
                .darkStyle()
                .graphic(new ImageView(insert));
                break;
            case 2:
                  notifications=Notifications.create()
                .title("Registro actualizado")
                .text("La información se actualizo correctamente")
                .hideAfter(Duration.seconds(3))
                .darkStyle()
                .graphic(new ImageView(update));
                break;
            case 3:      
                 notifications=Notifications.create()
                .title("Registro eliminado")
                .text("El registro se elimino correctamente")
                .hideAfter(Duration.seconds(3))
                .position(pos)
                .darkStyle()
                .graphic(new ImageView(delete));
                break;
            case 4:   
                 notifications=Notifications.create()
                .title(title)
                .text(txt)
                .hideAfter(Duration.seconds(3))
                .position(pos)
                .darkStyle()
                .graphic(new ImageView(information));
                break;
            default:
                break;
        }
        notifications.show();
         AudioUtil.playSound("job-done.wav");
        }    
}
