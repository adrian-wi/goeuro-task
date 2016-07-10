package com.goeuro.domain.transfer;

import java.util.Map;

public class CityDto {

    private Long id;
    private String key;
    private String name;
    private String fullName;
    private String iataAirportCode;
    private String type;
    private String country;
    private String latitude;
    private String longitude;

    private Long locationId;
    private Boolean inEurope;
    private Long countryId;
    private String countryCode;
    private Boolean coreCountry;
    private String distance;
    private Map<String, String> names;
    private Map<String, String> alternativeNames;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Map<String, String> getNames() {
        return names;
    }

    public void setNames(Map<String, String> names) {
        this.names = names;
    }

    public Map<String, String> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(Map<String, String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "CityDto{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", iataAirportCode='" + iataAirportCode + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", locationId=" + locationId +
                ", inEurope=" + inEurope +
                ", countryId='" + countryId + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", coreCountry='" + coreCountry + '\'' +
                ", distance='" + distance + '\'' +
                ", names=" + names +
                ", alternativeNames=" + alternativeNames +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CityDto)) return false;

        CityDto cityDto = (CityDto) o;

        if (id != null ? !id.equals(cityDto.id) : cityDto.id != null) return false;
        if (key != null ? !key.equals(cityDto.key) : cityDto.key != null) return false;
        if (name != null ? !name.equals(cityDto.name) : cityDto.name != null) return false;
        if (fullName != null ? !fullName.equals(cityDto.fullName) : cityDto.fullName != null) return false;
        if (iataAirportCode != null ? !iataAirportCode.equals(cityDto.iataAirportCode) : cityDto.iataAirportCode != null)
            return false;
        if (type != null ? !type.equals(cityDto.type) : cityDto.type != null) return false;
        if (country != null ? !country.equals(cityDto.country) : cityDto.country != null) return false;
        if (latitude != null ? !latitude.equals(cityDto.latitude) : cityDto.latitude != null) return false;
        if (longitude != null ? !longitude.equals(cityDto.longitude) : cityDto.longitude != null) return false;
        if (locationId != null ? !locationId.equals(cityDto.locationId) : cityDto.locationId != null) return false;
        if (inEurope != null ? !inEurope.equals(cityDto.inEurope) : cityDto.inEurope != null) return false;
        if (countryId != null ? !countryId.equals(cityDto.countryId) : cityDto.countryId != null) return false;
        if (countryCode != null ? !countryCode.equals(cityDto.countryCode) : cityDto.countryCode != null) return false;
        if (coreCountry != null ? !coreCountry.equals(cityDto.coreCountry) : cityDto.coreCountry != null) return false;
        if (distance != null ? !distance.equals(cityDto.distance) : cityDto.distance != null) return false;
        if (names != null ? !names.equals(cityDto.names) : cityDto.names != null) return false;
        return alternativeNames != null ? alternativeNames.equals(cityDto.alternativeNames) : cityDto.alternativeNames == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (iataAirportCode != null ? iataAirportCode.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        result = 31 * result + (inEurope != null ? inEurope.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (coreCountry != null ? coreCountry.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (names != null ? names.hashCode() : 0);
        result = 31 * result + (alternativeNames != null ? alternativeNames.hashCode() : 0);
        return result;
    }
}
