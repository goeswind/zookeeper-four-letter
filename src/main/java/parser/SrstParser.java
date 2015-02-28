package parser;

import utils.metrics.SrstMetrics;

/**
 * Created by hp on 15-2-26.
 */
public class SrstParser {

    public static SrstMetrics parser(String str) {
        if(str == null || str.equals("")) return null;
        SrstMetrics sm = new SrstMetrics();
        sm.retInfo = str;
        return sm;
    }

}
