package com.lecture.review;
/*
  Find the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah,
  Georgia; and Charlotte, North Carolina from (Google) and compute the estimated
  area enclosed by these four cities.
  for area you have to add all distances together.
*/

public class Ex05 {
    public static void main(String[] args) {
        Location atlanta = new Location(33.7405800, - 84.5545400);
        Location orlando = new Location(28.4115300, - 81.5250400);
        Location savannah = new Location(32.1672300, - 81.1998900);
        Location charlotte = new Location(35.2072400, - 80.9567600);
        double distanceBtwAtlantaOrlando = calculateDistance(atlanta, orlando);
        double distanceBtwOrlandoSavannah = calculateDistance(orlando, savannah);
        double distanceBtwOrSavannahCharlotte = calculateDistance(savannah, charlotte);
        double distanceBtwCharlotteAtlanta = calculateDistance(charlotte, atlanta);
        System.out.println(" The total journey distance is: "
                + distanceBtwAtlantaOrlando
                + distanceBtwOrlandoSavannah
                + distanceBtwOrSavannahCharlotte
                + distanceBtwCharlotteAtlanta
        );
    }
    
    public static double calculateDistance(Location first, Location second) {
        // distance = sqrt( (x2-x1)^2 + (y2-y1)^2 )
        double x2 = second.getX();
        double x1 = first.getX();
        double y2 = second.getY();
        double y1 = first.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // inner class
    public static class Location {
        private double x;
        private double y;
        
        public Location(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        public double getX() {
            return x;
        }
        
        public double getY() {
            return y;
        }
    }
}


