package Json;

import json.ManipulandoJson;
import org.junit.Test;


public class jsonTest {

    @Test
    public void testCriandoJson(){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        manipulandoJson.criandoJson();

    }
    @Test
    public void lerJson (){
        ManipulandoJson manipulandoJson = new ManipulandoJson();
        manipulandoJson.navegarJsonArquivo();

    }
}
