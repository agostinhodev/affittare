
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
                       
            System.out.println(this.url);
            URL url = new URL(this.url + route);             
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setConnectTimeout(5000);
             
            request.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
            request.setDoOutput(true);
            request.setDoInput(true);
            request.setRequestProperty("Content-Length", Integer.toString(params.getBytes().length));
            request.setRequestMethod(method);
                   
            DataOutputStream dos = new DataOutputStream(request.getOutputStream());
            dos.writeBytes(params);
            dos.flush();
             
             // Lê a resposta JSON
            InputStream in = new BufferedInputStream(request.getInputStream());
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
