package parser;

import utils.metrics.RuokMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class RuokParser {

    public static RuokMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        RuokMetrics rm = new RuokMetrics();
        rm.retInfo = str;
        return rm;
    }

}
