package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.ws.WS;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;


import play.libs.F.Promise;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Session extends Model {

    public static final String SESSION_VAR = "sessionID";
    public static Finder<String, Session> find = new Finder<>(Session.class);

    @Id
    private String id;
    private String ipAddress, location;
    private long since;

    @ManyToOne
    User user;

    public Session(User user, String ipAddress) {
        this.id = java.util.UUID.randomUUID().toString();
        this.user = user;
        this.ipAddress = ipAddress;
        this.since = System.currentTimeMillis();
        findIPLocation();
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getId() {
        return id;
    }

    public long getSince() {
        return since;
    }

    public String getLocation() {
        return location;
    }

    private void findIPLocation() {
        WSClient ws = WS.client();
        // In production environment on localhost this will fail(return "Unknown")
        // Uncomment following line to test(Should return "Melbourne") or enter another valid IP
        // String ipAddress = "139.130.4.5";
        String url = "http://ip-api.com/json/" + ipAddress;
        Promise<JsonNode> jsonPromise = ws.url(url).get().map(WSResponse::asJson);
        JsonNode content = jsonPromise.get(20000);
        if(content.get("status").asText().equals("fail")) {
            location = "Unknown";
        } else {
            location = content.get("city").asText();
        }
    }
}
