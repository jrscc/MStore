package Controller;



import java.io.IOException;

import View.SceneBuiderJanelaBuscarCliente;
import View.SceneBuiderJanelaHistorico;
import View.SceneBuilderJanelaCadastroCliente;
import View.SceneBuilderJanelaCadastroDespesa;
import View.SceneBuilderJanelaEstoque;
import View.SceneBuilderJanelaPagamento;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controlador {
	
	@FXML
    private TextField cod;

    @FXML
    private Button buscar;
    
    @FXML private javafx.scene.control.Button voltar; //variavel que acessa o botão voltar

    @FXML
    void onClickPagamento(ActionEvent event){
    	
    	try {
    	    new SceneBuilderJanelaPagamento().start(new Stage());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
    @FXML
    void onClickCadastroCliente(ActionEvent event){
    	
    	try {
    	    new SceneBuilderJanelaCadastroCliente().start(new Stage());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
    @FXML
    void onClickVisualizarEstoque(ActionEvent event){
    	
    	try {
    	    new SceneBuilderJanelaEstoque().start(new Stage());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
    @FXML
    void onClickBuscarCliente(ActionEvent event){
    	
    	try {
    	    new SceneBuiderJanelaBuscarCliente().start(new Stage());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
    @FXML
    void onClickHistorico(ActionEvent event){
    	
    	try {
    	    new SceneBuiderJanelaHistorico().start(new Stage());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
    @FXML
    void onClickCadastroDespesa(ActionEvent event){
    	
    	try {
    	    new SceneBuilderJanelaCadastroDespesa().start(new Stage());
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    }
    @FXML
    void onClickVoltar(ActionEvent event){
    	
    	Stage stage = (Stage) voltar.getScene().getWindow(); //Obtendo a janela atual
        stage.close(); //Fechando o Stage
    	
    }
}
