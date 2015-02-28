package parser;

import utils.constants.FourLetterSplit;
import utils.metrics.EnviMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class EnviParser {

    public static EnviMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        EnviMetrics em = new EnviMetrics();
        String sline[] = str.split("\n");
        for(String l : sline) {
            if(l == null || l.equals("") || l.trim().equals("")) continue;
            String kv[] = l.split(FourLetterSplit.envi);
            if(kv.length == 2) {
                String key = kv[0];
                String value = kv[1];
                em.setData(key, value);
            }
        }
        return em;
    }

}
