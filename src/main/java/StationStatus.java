import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StationStatus {

  private String last_updated;
  private Data data;

  public String getLast_updated() {
    return last_updated;
  }

  public void setLast_updated(String last_updated) {
    this.last_updated = last_updated;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
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
