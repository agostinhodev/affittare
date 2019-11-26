
package Api;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Api {
    
    private String url = "http://192.168.0.58:3131/";
    private String charset  = "UTF-8";
    private String chraset2 = "ISO-8859-1";
        
    public JSONObject send(String params, String method, String route){
                        
        try {
                        
            byte array[] = params.getBytes(this.charset);
            params = new String(array, this.chraset2);
                                  
            this.url = this.url + route;           
            System.out.println(method + ": " + this.url + " - " + params);
            
            URL url = (method == "POST") ? new URL(this.url) : new URL(this.url + "?" + params);             
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod(method);
            request.setDoOutput(true);   
            request.setConnectTimeout(5000);       
            
            request.setRequestProperty("Accept-Charset", this.charset);
            request.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + this.charset);
            request.setRequestProperty("Content-Length", Integer.toString(params.getBytes().length));  
            request.setDoInput(true);
            
            if(method == "POST"){ 
                
                DataOutputStream out = new DataOutputStream(request.getOutputStream());
                out.writeBytes(params);
                out.flush();
                out.close();                
            }
                        
            // Lê a resposta JSON
            InputStream in;
            
            System.out.println(request.getResponseCode());
            
            if (request.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST) {
                
                in = new BufferedInputStream(request.getInputStream());
                
            } else {
                
                in = new BufferedInputStream(request.getErrorStream());
                
            }
                         
            String response = IOUtils.toString(in, "UTF-8"); 
            JSONObject json = new JSONObject(response);     
             
            //Fecha as conexões
            in.close();            
            request.disconnect();
            
            return json;
                          
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Exceção Capturada na API:\n\n" + e);
            System.out.println(e);

        }
        
        return null;
    }
           
}
