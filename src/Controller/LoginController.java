package Controller;

import Api.Api;
import org.json.JSONObject;

public class LoginController {
    
    public JSONObject login(String email, String senha){
        
        /*Parâmetros da Requisição*/
        String params = "email=" + email + "&senha=" + senha;
        String method = "POST";
        String route  = "funcionario/login";
        
        Api api = new Api();
        
        return api.send(params, method, route);
        
    }
    
}
