/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaserialportexample;

/**
 *
 * @author nicod
 */
class SerialData {
    
    private byte[] data = new byte[0];
    
    public SerialData(byte[] data) {
        this.data = data.clone();
    }
    
    public String getDataAsString() {
        return new String(data);
    }
    
    public byte[] getDataAsBytes() {
        return data.clone();
    }
}
