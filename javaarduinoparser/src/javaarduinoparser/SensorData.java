
package javaarduinoparser;

public class SensorData {
    private double waterLevel;
    private int pubgRanking;
    
    public SensorData(double waterLevel,
            int pubgRanking) {
        this.waterLevel = waterLevel;
        this.pubgRanking = pubgRanking;
    }
    
    public double getWaterLevel() {
        return waterLevel;
    }
    
    public int getPubgRanking() {
        return pubgRanking;
    }

    @Override
    public String toString() {
        return "Waterlevel: " + waterLevel
                + " | PUBG Ranking: " + pubgRanking;
    }
    
    
}
