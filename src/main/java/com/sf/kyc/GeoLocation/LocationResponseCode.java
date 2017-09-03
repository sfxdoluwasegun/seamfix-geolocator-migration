/**
 * 
 */
package com.sf.kyc.GeoLocation;

/**
 * @author Charles
 *
 */
public enum LocationResponseCode {

	SUCCESS("00"),
	UNAUTHORIZED("02"),
	ERROR("06");
	
	private LocationResponseCode(String code) {
		this.code = code;
	}
	
	private String code;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
}

