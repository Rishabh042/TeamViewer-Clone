

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.io.File;


public class MyClient 
{

public static String signup(String username, String email,String password, String phone, File photo)
{
    try 
    {
        HttpResponse<String> res = Unirest.post("http://localhost:9000/signup")
                .queryString("username", username)
                .queryString("email", email)
                .queryString("password", password)
                .queryString("phone", phone)
                .field("photo", photo)
                .asString();
        
        if(res.getStatus() == 200)
        {
            return res.getBody();
        }
        else
        {
            return "Server Error";
        }
        
    } 
    catch (Exception e) 
    {
    return e.toString();
    }
    
    
}
    
}
