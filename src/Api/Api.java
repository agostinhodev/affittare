
package Api;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Api {
    
    private String url = "http://192.168.0.58:3131/";
        
    public JSONObject send(String params, String method, String route){
                        
        try {
                                    
            this.url = this.url + route; 
            //Debug
            System.out.println(method + ": " + this.url + " - " + params);
            
            URL url = (method == "POST") ? new URL(this.url) : new URL(this.url + "?" + params);             
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod(method);
            request.setDoOutput(true);   
            request.setConnectTimeout(5000);             
            request.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");            
            request.setDoInput(true);
            request.setRequestProperty("Content-Length", Integer.toString(params.getBytes().length));  
            
            if(method == "POST"){ 
                
                DataOutputStream out = new DataOutputStream(request.getOutputStream());
                out.writeBytes(params);
                out.flush();
                out.close();                
            }
                        
            // Lê a resposta JSON
            InputStream in  = new BufferedInputStream(request.getInputStream());
            String response = IOUtils.toString(in, "UTF-8");      
            
            JSONObject json = new JSONObject(response);     
             
            //Fecha as conexões
            in.close();            
            request.disconnect();
            
            return json;
                          
        } catch (Exception e) {

            System.out.println(e);

        }
        
        return null;
    }
           
}
