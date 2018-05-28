package pl.ttpsc.builder;

import java.util.Date;
import java.util.Map;

public class BuildingBuilder {
    private Long id;
    private String streetName;
    private int streetNumber;
    private String zipCode;
    private String buildingCompanyName;
    private String landlordName;
    private Date constructionYear;
    private Date constructionEndYear;
    private long flatsNumber;
    private long completeRentArea;
    private String completeRentAreaUnit;
    private Map<String, String> flatsDescription;
    private Map<String, Long> flatsPrices;
    private boolean hasCarPark;
    private boolean hasGarden;
    private boolean hasFence;
    private boolean petFriendlyFlag;
    private boolean commercialGroundFloorFlag;

    public BuildingBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public BuildingBuilder setStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public BuildingBuilder setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public BuildingBuilder setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public BuildingBuilder setBuildingCompanyName(String buildingCompanyName) {
        this.buildingCompanyName = buildingCompanyName;
        return this;
    }

    public BuildingBuilder setLandlordName(String landlordName) {
        this.landlordName = landlordName;
        return this;
    }

    public BuildingBuilder setConstructionYear(Date constructionYear) {
        this.constructionYear = constructionYear;
        return this;
    }

    public BuildingBuilder setConstructionEndYear(Date constructionEndYear) {
        this.constructionEndYear = constructionEndYear;
        return this;
    }

    public BuildingBuilder setFlatsNumber(long flatsNumber) {
        this.flatsNumber = flatsNumber;
        return this;
    }

    public BuildingBuilder setCompleteRentArea(long completeRentArea) {
        this.completeRentArea = completeRentArea;
        return this;
    }

    public BuildingBuilder setCompleteRentAreaUnit(String completeRentAreaUnit) {
        this.completeRentAreaUnit = completeRentAreaUnit;
        return this;
    }

    public BuildingBuilder setFlatsDescription(Map<String, String> flatsDescription) {
        this.flatsDescription = flatsDescription;
        return this;
    }

    public BuildingBuilder setFlatsPrices(Map<String, Long> flatsPrices) {
        this.flatsPrices = flatsPrices;
        return this;
    }

    public BuildingBuilder setHasCarPark(boolean hasCarPark) {
        this.hasCarPark = hasCarPark;
        return this;
    }

    public BuildingBuilder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public BuildingBuilder setHasFence(boolean hasFence) {
        this.hasFence = hasFence;
        return this;
    }

    public BuildingBuilder setPetFriendlyFlag(boolean petFriendlyFlag) {
        this.petFriendlyFlag = petFriendlyFlag;
        return this;
    }

    public BuildingBuilder setCommercialGroundFloorFlag(boolean commercialGroundFloorFlag) {
        this.commercialGroundFloorFlag = commercialGroundFloorFlag;
        return this;
    }

    public Building createBuilding() {
        return new Building(id, streetName, streetNumber, zipCode, buildingCompanyName, landlordName, constructionYear, constructionEndYear, flatsNumber, completeRentArea, completeRentAreaUnit, flatsDescription, flatsPrices, hasCarPark, hasGarden, hasFence, petFriendlyFlag, commercialGroundFloorFlag);
    }
}