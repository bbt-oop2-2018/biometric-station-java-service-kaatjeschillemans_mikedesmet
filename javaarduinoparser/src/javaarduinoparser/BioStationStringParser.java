/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarduinoparser;

/**
 *
 * @author nicod
 */
public class BioStationStringParser {
    
    public SensorData parse(String dataString) {
        if (!isValidString(dataString)) {
            return null;
        }
        
        double waterlevel = 0;
        int ranking = 0;
        
        // Parsen
        
        
        return new SensorData(waterlevel, ranking);
    }
    
    private boolean isValidString(String dataString) {
//        if ( dataString.indexOf("[") != -1 &&
//             dataString.indexOf("]") != -1 &&
//                dataString.indexOf("|") != -1) {
//            return true;
//        } else {
//            return false;
//        }
        return ( dataString.indexOf("[") != -1 &&
             dataString.indexOf("]") != -1 &&
                dataString.indexOf("|") != -1);
    }
}
