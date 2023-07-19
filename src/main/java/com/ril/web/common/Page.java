package com.ril.web.common;

import com.ril.common.Environment;

import java.util.Map;

public class Page {
    protected Driver driver=Driver.driver;
    protected Environment env=Environment.env;
    protected Map<String, String> merchant=(Map) env.merchantData();
    protected String segment=env.SEGMENT;
    protected String environment=env.ENVIRONMENT;
}
