/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarduinoparser;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;


public class JavaArduinoParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MAX_BYTES = 64;
        
        SerialPort comPort = SerialPort.getCommPorts()[0];
        comPort.openPort();
        comPort.addDataListener(new SerialPortDataListener() {
            
    @Override
    public int getListeningEvents() {
        return SerialPort.LISTENING_EVENT_DATA_AVAILABLE; 
    }
   
    @Override
    public void serialEvent(SerialPortEvent event)
   {
      if (event.getEventType() != SerialPort.LISTENING_EVENT_DATA_AVAILABLE) {
          return;
      }
         
      byte[] newData = new byte[MAX_BYTES];
      char[] message = new char[MAX_BYTES];
      
      
      
      int numRead = comPort.readBytes(newData, newData.length);
     System.out.println("Read " + numRead + " bytes.");
     
     for (int i = 0; i < newData.length; i++) {
         message[i] = (char)(newData[i]);

     }
     
     String output = new String (newData);
     System.out.println("Data: " + output);
     if (output.contains ("]")) {
         System.out.println("Found newline");
     }
              
              

   }
});
        
        SensorData data = new SensorData(2.44, 3);
        System.out.println(data);
        
        BioStationStringParser parser = new BioStationStringParser();
        SensorData testData = parser.parse("[128.3|185431]");
        System.out.println(testData);
        
        // Bad data
        SensorData badData = parser.parse("128.3|185431]");
        System.out.println(badData);
    }
    
}
