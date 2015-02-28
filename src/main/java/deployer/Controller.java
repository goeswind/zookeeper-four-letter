package deployer;

import parser.ConfParser;
import parser.ConsParser;
import parser.CrstParser;
import parser.DumpParser;
import parser.EnviParser;
import parser.MntrParser;
import parser.RuokParser;
import parser.SrstParser;
import parser.SrvrParser;
import parser.StatParser;
import parser.WchcParser;
import parser.WchpParser;
import parser.WchsParser;
import tracker.FourLetterTracker;
import utils.constants.FourLetterWords;
import utils.metrics.ConfMetrics;
import utils.metrics.ConsMetrics;
import utils.metrics.CrstMetrics;
import utils.metrics.DumpMetrics;
import utils.metrics.EnviMetrics;
import utils.metrics.MntrMetrics;
import utils.metrics.RuokMetrics;
import utils.metrics.SrstMetrics;
import utils.metrics.SrvrMetrics;
import utils.metrics.StatMetrics;
import utils.metrics.WchcMetrics;
import utils.metrics.WchpMetrics;
import utils.metrics.WchsMetrics;

import java.util.Map;

/**
 * Created by hp on 15-2-26.
 */
public class Controller {

    private String ip = "127.0.0.1";
    private int port = 2181;

    public Controller() {

    }

    public Controller(String ips, int ports) {
        ip = ips;
        port = ports;
    }

    public void start() throws Exception {
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start();
        Map<String, String> retMap = flt.getInfo();
        for(String cmd : FourLetterWords.cmds) {
            String data = retMap.get(cmd);
            if(cmd.equals(FourLetterWords.conf)) {
                ConfMetrics info = ConfParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.cons)) {
                ConsMetrics info = ConsParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.crst)) {
                CrstMetrics info = CrstParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.dump)) {
                DumpMetrics info = DumpParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.envi)) {
                EnviMetrics info = EnviParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.mntr)) {
                MntrMetrics info = MntrParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.ruok)) {
                RuokMetrics info = RuokParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.srst)) {
                SrstMetrics info = SrstParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.srvr)) {
                SrvrMetrics info = SrvrParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.stat)) {
                StatMetrics info = StatParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.wchs)) {
                WchsMetrics info = WchsParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.wchc)) {
                WchcMetrics info = WchcParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else if (cmd.equals(FourLetterWords.wchp)) {
                WchpMetrics info = WchpParser.parser(data);
                print(cmd + "\n" + info.toString());
            } else {

            }
        }
        flt.close();
    }

    public void start(String cmd) throws Exception {
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        if(cmd.equals(FourLetterWords.conf)) {
            ConfMetrics info = ConfParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.cons)) {
            ConsMetrics info = ConsParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.crst)) {
            CrstMetrics info = CrstParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.dump)) {
            DumpMetrics info = DumpParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.envi)) {
            EnviMetrics info = EnviParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.mntr)) {
            MntrMetrics info = MntrParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.ruok)) {
            RuokMetrics info = RuokParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.srst)) {
            SrstMetrics info = SrstParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.srvr)) {
            SrvrMetrics info = SrvrParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.stat)) {
            StatMetrics info = StatParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.wchs)) {
            WchsMetrics info = WchsParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.wchc)) {
            WchcMetrics info = WchcParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else if (cmd.equals(FourLetterWords.wchp)) {
            WchpMetrics info = WchpParser.parser(data);
            print(cmd + "\n" + info.toString());
        } else {

        }
        flt.close();
    }

    public ConfMetrics getCONF() throws Exception {
        String cmd = FourLetterWords.conf;
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return ConfParser.parser(data);
    }

    public ConsMetrics getCONS() throws Exception {
        String cmd = FourLetterWords.cons;
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return ConsParser.parser(data);
    }

    public DumpMetrics getDUMP() throws Exception {
        String cmd = FourLetterWords.dump;
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return DumpParser.parser(data);
    }

    public EnviMetrics getENVI() throws Exception {//change 2
        String cmd = FourLetterWords.envi;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return EnviParser.parser(data);//change 1
    }

    public RuokMetrics getRUOK() throws Exception {//change 2
        String cmd = FourLetterWords.ruok;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return RuokParser.parser(data);//change 1
    }

    public SrvrMetrics getSRVR() throws Exception {//change 2
        String cmd = FourLetterWords.srvr;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return SrvrParser.parser(data);//change 1
    }

    public StatMetrics getSTAT() throws Exception {//change 2
        String cmd = FourLetterWords.stat;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return StatParser.parser(data);//change 1
    }

    public WchsMetrics getWCHS() throws Exception {//change 2
        String cmd = FourLetterWords.wchs;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return WchsParser.parser(data);//change 1
    }

    public WchcMetrics getWCHC() throws Exception {//change 2
        String cmd = FourLetterWords.wchc;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return WchcParser.parser(data);//change 1
    }

    public WchpMetrics getWCHP() throws Exception {//change 2
        String cmd = FourLetterWords.wchp;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return WchpParser.parser(data);//change 1
    }

    public MntrMetrics getMNTR() throws Exception {//change 2
        String cmd = FourLetterWords.mntr;//change 1
        FourLetterTracker flt = new FourLetterTracker();
        flt.setIp(ip);
        flt.setPort(port);
        flt.start(cmd);
        Map<String, String> retMap = flt.getInfo();
        String data = retMap.get(cmd);
        return MntrParser.parser(data);//change 1
    }

    private void print(String s) {
        System.out.print(s);
    }

}
