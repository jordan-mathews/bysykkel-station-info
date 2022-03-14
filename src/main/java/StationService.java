import java.util.*;
import java.util.stream.Collectors;

public class StationService {

  private final StationsClient stationsClient;

  public StationService(){
    this.stationsClient = new StationsClient();
  }

  public List<Station> getAllStations() throws Exception {
    StationInformation stationInfo = stationsClient.getStationInformation();
    StationStatus stationStatus = stationsClient.getStationStatus();

    List<Station> stations = mapStationStatusToInfo(stationInfo, stationStatus)
            .stream()
            .sorted(Comparator.comparing(Station::getName))
            .collect(Collectors.toList());

    return stations;

  }

  private List<Station> mapStationStatusToInfo(StationInformation stationInfo, StationStatus stationStatus){
    Map<String, Station> stationMap = new HashMap<>();


    for(Station station: stationInfo.getData().getStations()){
      if(!stationMap.containsKey(station.getStation_id())){
        stationMap.put(station.getStation_id(), station);
      }
    }

    for(Station station :stationStatus.getData().getStations()){
      if(!stationMap.containsKey(station.getStation_id())){
        stationMap.put(station.getStation_id(), station);
      }

      Station stn = stationMap.get(station.getStation_id());

      stn.setNum_docks_available(station.getNum_docks_available());
      stn.setNum_bikes_available(station.getNum_bikes_available());
      stn.setLast_reported(station.getLast_reported());
      stn.setIs_installed(station.getIs_installed());
      stn.setIs_returning(station.getIs_returning());
      stn.setIs_renting(station.getIs_renting());
    }

    return new ArrayList<>(stationMap.values());
  }

}
