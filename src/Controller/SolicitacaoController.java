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
 * @author tim
 */
public class SolicitacaoController {
 
    public JSONObject getSolicitacoes(int funcionario, int status){
    
        /*Parâmetros da Requisição*/
        String params = "funcionario=" + funcionario;
        String method = "GET";
        
        String route;
        
        switch(status){
    
            case 0:
            default:
                
                route  = "locais/solicitacoes/pendentes";
                
            break;            
        }       
        
        Api api = new Api();        
        return api.send(params, method, route);            
            
    }
    
    public JSONObject aprovarReprovar(int status, int funcionario, int id){
        
        /*Parâmetros da Requisição*/
        String params = "status=" + status + "&funcionario=" + funcionario + "&id=" + id;
        String method = "POST";
        String route  = "locais/solicitacoes/aprovarReprovar";
        
        Api api = new Api();        
        return api.send(params, method, route);          
    
    }
    
}
