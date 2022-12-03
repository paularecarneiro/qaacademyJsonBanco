package json;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;

public class ManipulandoJson {

    public void criandoJson() {
        JSONObject json = new JSONObject ();
            json.put("nome","Paula");
            json.put("sobrenome","Carneiro");
            json.put("idade",36);
            System.out.println(json);
        System.out.println(json.get("nome"));


        }


    }
