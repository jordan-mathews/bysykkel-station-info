import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StationInformation {
  private String last_updated;
  private String version;
  private Data data;
  private int ttl;


  public String getLast_updated() {
    return last_updated;
  }

  public void setLast_updated(String last_updated) {
    this.last_updated = last_updated;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  public int getTtl() {
    return ttl;
  }

  public void setTtl(int ttl) {
    this.ttl = ttl;
  }



  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Data {
    private List<Station> stations;

    public List<Station> getStations() {
      return stations;
    }

    public void setStations(List<Station> stations) {
      this.stations = stations;
    }
  }

}
