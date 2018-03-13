/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwsgeoip;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author sergio
 */
@Root
public class GeoIP {
    @Element
    private int ReturnCode;
    
    @Element
    private String IP;
    
    @Element
    private String ReturnCodeDetails;
    
    @Element
    private String CountryName;
    
    @Element
    private  String CountryCode;

    public int getReturnCode() {
        return ReturnCode;
    }

    public String getIP() {
        return IP;
    }

    public String getReturnCodeDetails() {
        return ReturnCodeDetails;
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }
    
}
