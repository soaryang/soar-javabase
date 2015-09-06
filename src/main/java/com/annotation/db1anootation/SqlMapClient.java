package com.annotation.db1anootation;

import java.util.Map;

public class SqlMapClient {

	
    private String type   = null;

    private String sqlMap = null;
    
    public SqlMapClient() {
    
    }
    
	public SqlMapClient(String s, String t) {
        sqlMap = s;
        type = t;
    }

    public String selectForObject(String sql, Map in) {
        return this.toString();
    }

	
	public String toString() {
		return "SqlMapClient [type=" + type + ", sqlMap=" + sqlMap + "]";
	}
    
    
}
