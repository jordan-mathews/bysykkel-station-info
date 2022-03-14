import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class StationsClient {
  private static final ObjectMapper objectMapper = new ObjectMapper();
  private final HttpClient client;

  public StationsClient(){
    client = HttpClient.newHttpClient();
  }

  public StationInformation getStationInformation() throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://gbfs.urbansharing.com/oslobysykkel.no/station_information.json"))
            .header("Client-Identifier", "osloorigo-test")
            .GET()
            .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

      if(response.statusCode() != 200){
        throw new BysykkelStationException(response.body());
      }

    StationInformation stationInfo = objectMapper.readValue(response.body(), StationInformation.class);
    return stationInfo;

  }


  public StationStatus getStationStatus() throws Exception {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json"))
            .header("Client-Identifier", "osloorigo-test")
            .GET()
            .build();
    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    if(response.statusCode() != 200){
      throw new BysykkelStationException(response.body());
    }

    StationStatus stationStatus = objectMapper.readValue(response.body(), StationStatus.class);
    return stationStatus;

  }

}
