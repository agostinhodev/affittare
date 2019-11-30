/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Api.Api;
import org.json.JSONObject;

/**
 *
 * @author Agostinho Neto
 */
public class SignUpController {
    
     public JSONObject novo(String nome, String cpf, String email, String telefone, String senha){
        
        /*Parâmetros da Requisição*/
        String params = "nome=" + nome + "&cpf=" + cpf + "&email=" + email + "&telefone=" + telefone + "&senha=" + senha; 
        String method = "POST";
        String route  = "funcionario/novo";
        
        Api api = new Api();
        
        return api.send(params, method, route);
        
    }
    
}
