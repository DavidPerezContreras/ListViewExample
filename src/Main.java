import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		
		ListView ls2 = new ListView();
		
		ListView ls1 = new ListView();
		
		
		ls2.getItems().add("Opción 1");
		ls2.getItems().add("Opción 2");
		ls2.getItems().add("Opción 3");
		
		
		
		
		
		//Esta linea hace que el usuario pueda seleccionar más de una opción simultáneamente

	    ls2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		
		
		//Añade las tres opciones
		
		ls1.getItems().add("Opcion 1");

	    ls1.getItems().add("Opcion 2");

	    ls1.getItems().add("Opcion 3");
		
		ls1.setMaxWidth(128);
		ls1.setMaxHeight(50);
	    
		ls2.setMaxWidth(128);
		ls2.setPrefHeight(Region.USE_COMPUTED_SIZE);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	       Button button = new Button("Mostrar opción seleccionada(0,1,2,3...)");



	       button.setOnAction(event -> {

	           ObservableList selectedIndices = ls1.getSelectionModel().getSelectedIndices();



	           for(Object o : selectedIndices){

	               System.out.println(o);

	           }

	       });
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	       root.getChildren().addAll(ls2,ls1,button);
	    
	    
	    
        Scene scene = new Scene(root, 600, 360);

        primaryStage.setScene(scene);

        primaryStage.show();
		
		
		
	}

}
