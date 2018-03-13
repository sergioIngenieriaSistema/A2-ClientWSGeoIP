/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsgeoip;

import java.io.IOException;
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
        Scanner scanner = new Scanner(url.openStream());
        String resource = new String();
        while (scanner.hasNext()) {
            resource += scanner.next();
        }
        
        System.out.println("RESPONSE: " + resource);
        Serializer serializer = new Persister();
        GeoIP geoIP = new GeoIP();
        serializer.read(geoIP, resource);
        System.out.println("CountryName: " + geoIP.getCountryName());
    }
    
}
