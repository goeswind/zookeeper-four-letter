package utils.metrics;

import utils.assist.Client;
import utils.constants.StatConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 15-2-2.
 */
public class StatMetrics {

    public String version;
    public List<Client> Clients = new ArrayList<Client>();
    public long minLatency;
    public long maxLatency;
    public long avgLatency;
    public long received;
    public long sent;
    public long connections;
    public long outstanding;
    public String zxid;
    public String mode;
    public long nodeCount;

    public void setData(String key, String value) {
        if(key == null || value == null || key.equals("") || value.equals("")) return;
        value = value.trim();
        if(key.equals(StatConstants.Zookeeper_version)) {
            version = value;
        } else if (key.equals(StatConstants.Clients)) {
            Client cli = Client.toClient(value);
            Clients.add(cli);
        } else if (key.equals(StatConstants.Latency)) {
            String data = value.trim();
            String ss[] = data.split("/");
            minLatency = Long.valueOf(ss[0].trim());
            avgLatency = Long.valueOf(ss[1].trim());
            maxLatency = Long.valueOf(ss[2].trim());
        } else if (key.equals(StatConstants.Received)) {
            received = Long.valueOf(value);
        } else if (key.equals(StatConstants.Sent)) {
            sent = Long.valueOf(value);
        } else if (key.equals(StatConstants.Connections)) {
            connections = Long.valueOf(value);
        } else if (key.equals(StatConstants.Outstanding)) {
            outstanding = Long.valueOf(value);
        } else if (key.equals(StatConstants.Zxid)) {
            zxid = value;
        } else if (key.equals(StatConstants.Mode)) {
            mode = value;
        } else if (key.equals(StatConstants.Node_count)) {
            nodeCount = Long.valueOf(value);
        } else  {
            //nothing
        }
    }

}
