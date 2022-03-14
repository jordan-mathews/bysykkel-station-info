import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Station {

  private String station_id;
  private String name;
  private String address;
  private String lat;
  private String lon;
  private int capacity;
  private Boolean is_installed;
  private Boolean is_renting;
  private int num_bikes_available;
  private int num_docks_available;
  private long last_reported;
  private Boolean is_returning;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public Boolean getIs_installed() {
    return is_installed;
  }

  public void setIs_installed(Boolean is_installed) {
    this.is_installed = is_installed;
  }

  public Boolean getIs_renting() {
    return is_renting;
  }

  public void setIs_renting(Boolean is_renting) {
    this.is_renting = is_renting;
  }

  public int getNum_bikes_available() {
    return num_bikes_available;
  }

  public void setNum_bikes_available(int num_bikes_available) {
    this.num_bikes_available = num_bikes_available;
  }

  public int getNum_docks_available() {
    return num_docks_available;
  }

  public void setNum_docks_available(int num_docks_available) {
    this.num_docks_available = num_docks_available;
  }

  public long getLast_reported() {
    return last_reported;
  }

  public void setLast_reported(long last_reported) {
    this.last_reported = last_reported;
  }

  public Boolean getIs_returning() {
    return is_returning;
  }

  public void setIs_returning(Boolean is_returning) {
    this.is_returning = is_returning;
  }

  public String getStation_id() {
    return station_id;
  }

  public void setStation_id(String station_id) {
    this.station_id = station_id;
  }
}
