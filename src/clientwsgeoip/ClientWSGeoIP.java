/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsgeoip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author sergio
 */
public class ClientWSGeoIP {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException, Exception {
        String stringURL = "http://www.webservicex.net/geoipservice.asmx/GetGeoIPContext";
        URL url = new URL(stringURL);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String rest = new String();
        String line;
        while((line = br.readLine()) != null){
            rest += line;
        }
        
        Serializer serializer = new Persister();
        GeoIP geoIP = new GeoIP();
        serializer.read(geoIP, rest);
        System.out.println("CountryName: " + geoIP.getCountryName());
    }
    
}
