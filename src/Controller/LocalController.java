package Controller;

import Api.Api;
import org.json.JSONObject;

public class LocalController {
    
    public JSONObject getTodosLocais(){
        
        /*Parâmetros da Requisição*/
        String params = "";
        String method = "GET";
        String route  = "locais/todos";
        
        Api api = new Api();
        
        return api.send(params, method, route);
        
    }
    
}
