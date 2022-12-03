package json;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ManipulandoJson {

    public void criandoJson() {
        JSONObject json = new JSONObject ();
            json.put("nome","Paula");
            json.put("sobrenome","Carneiro");
            json.put("idade",36);
            System.out.println(json);
        System.out.println(json.get("nome"));

        }

    public void navegarJsonArquivo(){
        JSONObject json;
        try{
            InputStream inputStream = new FileInputStream("./src/main/resources/arquivosJsons/cep.json");
            json = new JSONObject(new JSONTokener(inputStream));
            System.out.println( json.get("localidade"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



}
