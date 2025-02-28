package org.example;

class ParkClass {
    private String name;

    public ParkClass(String name) {
        this.name = name;
    }
    class Attraction {
        private String attractionName;
        private String workingHours;
        private double ticketPrice;

        public Attraction(String attractionName, String workingHours, double ticketPrice) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.ticketPrice = ticketPrice;
        }

        public void displayAttractionInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Цена билета: " + ticketPrice);
            System.out.println();
        }
    }

    public void displayParkInfo() {
        System.out.println("Парк: " + name);
    }
}
