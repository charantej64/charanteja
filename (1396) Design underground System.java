import java.util.*;

class UndergroundSystem {
    Map<Integer, Pair> checkIns = new HashMap<>();
    Map<String, double[]> travelData = new HashMap<>();

    public void checkIn(int id, String station, int t) {
        checkIns.put(id, new Pair(station, t));
    }

    public void checkOut(int id, String station, int t) {
        Pair start = checkIns.remove(id);
        String route = start.station + "->" + station;
        travelData.putIfAbsent(route, new double[2]);
        travelData.get(route)[0] += t - start.time;
        travelData.get(route)[1]++;
    }

    public double getAverageTime(String s, String e) {
        double[] d = travelData.get(s + "->" + e);
        return d[0] / d[1];
    }

    static class Pair {
        String station; int time;
        Pair(String s, int t) { station = s; time = t; }
    }
}
