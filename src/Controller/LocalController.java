package Controller;

import Api.Api;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class LocalController {
    
    public JSONObject getTodosLocais(int funcionario){
        
        /*Parâmetros da Requisição*/
        String params = "funcionario=" + funcionario;
        String method = "GET";
        String route  = "locais/todos";
        
        Api api = new Api();
        
        return api.send(params, method, route);
        
    }
    
    public JSONObject novoLocal(String nome, String endereco, String valor, int funcionario, String foto){
            
        String params = "nome=" + nome + "&endereco=" + endereco + "&valor=" + valor + "&funcionario=" + funcionario + "&foto=" + foto;
        String method = "POST";
        String route  = "locais/novo";
        
        Api api = new Api();
        
        return api.send(params, method, route);
    
    }
    
}
