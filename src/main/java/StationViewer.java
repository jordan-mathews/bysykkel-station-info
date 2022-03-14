import java.util.List;

public class StationViewer {
  private final StationService stationService;

  public StationViewer(){
    this.stationService = new StationService();
  }

  public void run(){
    try{
      printTable(stationService.getAllStations());
    } catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

  private void printTable(List<Station> stations){

    printTableHeader();
    for(Station station :stations){
      printStationInformation(station);
    }
  }

  private void printTableHeader(){
    System.out.println(String.format("%-30s %20s %10s %10s %10s", "Station Name", "|", "Bikes Available", "|", "Docks Available"));
    System.out.println(String.format("%s", "----------------------------------------------------------------------------------------------------------------"));
  }

  private void printStationInformation(Station station){
    System.out.println(String.format("%-30s %20s %10s %15s %10s", station.getName(), "|", station.getNum_bikes_available(), "|", station.getNum_docks_available()));
  }
}
