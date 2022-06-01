public class Property {

    // Attributes
    private int yearOfConstruction;
    private String propertyCategory;
    private String address;
    private String neighborhood;
    private String spaces;
    private String level;
    private String energyClass;
    private String orientation;
    private String heating;
    private String buildingBills;
    private float structureFactor;
    private float coverFactor;
    private String electricalCurrentPhase;
    private boolean urbanPlan;
    private String landUseCategory;
    private float area;
    private boolean available;

    public Property(int yearOfConstruction, String propertyCategory, String address, String neighborhood, String spaces, String level, String energyClass, String orientation, String heating, String buildingBills, float structureFactor, float coverFactor, String electricalCurrentPhase, boolean urbanPlan, String landUseCategory, float area, boolean available){
        this.yearOfConstruction = yearOfConstruction;
        this.propertyCategory = propertyCategory;
        this.address = address;
        this.neighborhood = neighborhood;
        this.spaces = spaces;
        this.level = level;
        this.energyClass = energyClass;
        this.orientation = orientation;
        this.heating = heating;
        this.buildingBills = buildingBills;
        this.structureFactor = structureFactor;
        this.coverFactor = coverFactor;
        this.electricalCurrentPhase = electricalCurrentPhase;
        this.urbanPlan = urbanPlan;
        this.landUseCategory = landUseCategory;
        this.area = area;
        this.available = available;
    } // Constructor

    // Methods

    public boolean availableProperty(){

        return available;
    }

    public boolean isUrbanPlan() {
        return urbanPlan;
    }

    public float getArea() {
        return area;
    }

    public float getCoverFactor() {
        return coverFactor;
    }

    public float getStructureFactor() {
        return structureFactor;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public String getAddress() {
        return address;
    }

    public String getBuildingBills() {
        return buildingBills;
    }

    public String getElectricalCurrentPhase() {
        return electricalCurrentPhase;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public String getHeating() {
        return heating;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getLandUseCategory() {
        return landUseCategory;
    }

    public String getLevel() {
        return level;
    }

    public String getOrientation() {
        return orientation;
    }

    public String getPropertyCategory() {
        return propertyCategory;
    }

    public String getSpaces() {
        return spaces;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
