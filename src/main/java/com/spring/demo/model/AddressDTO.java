package com.spring.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Address")
public class AddressDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "X")
	private String x;
	@Column(name = "Y")
	private String y;
	@Column(name = "OBJECTID")
	private String objectId;
	@Column(name = "ENTRY_ID")
	private String entryid;
	@Column(name = "ADDR_HN")
	private String addressHn;
	@Column(name = "ADDR_PT")
	private String addressPt;
	@Column(name = "ADDR_SN")
	private String addressSn;
	@Column(name = "ADDR_PD")
	private String addressPd;
	@Column(name = "ADDR_ST")
	private String addressSt;
	@Column(name = "ADDR_SD")
	private String addressSd;
	@Column(name = "FULL_ADDRESS")
	private String fullAddress;
	@Column(name = "SUB_HN")
	private String subHm;
	@Column(name = "APT_UNIT")
	private String aptUnit;
	@Column(name = "RES_TYPE")
	private String resType;
	@Column(name = "COMMUNITY")
	private String communityVar;
	@Column(name = "ZIPCODE")
	private String zipcode;
	@Column(name = "PO_NAME")
	private String poName;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTY_NAME")
	private String countryName;
	@Column(name = "FIPS")
	private String fips;
	@Column(name = "STATE_ID")
	private String stateId;
	@Column(name = "COORSYS")
	private String coorsys;
	@Column(name = "POINT_X")
	private String pointX;
	@Column(name = "POINT_Y")
	private String pointY;
	@Column(name = "USNG")
	private String usng;
	@Column(name = "DDLat")
	private String ddlat;
	@Column(name = "DDLon")
	private String ddlon;
	@Column(name = "PROCESS_ID")
	private String processId;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public String getEntryid() {
		return entryid;
	}

	public void setEntryid(String entryid) {
		this.entryid = entryid;
	}

	public String getAddressHn() {
		return addressHn;
	}

	public void setAddressHn(String addressHn) {
		this.addressHn = addressHn;
	}

	public String getAddressPt() {
		return addressPt;
	}

	public void setAddressPt(String addressPt) {
		this.addressPt = addressPt;
	}

	public String getAddressSn() {
		return addressSn;
	}

	public void setAddressSn(String addressSn) {
		this.addressSn = addressSn;
	}

	public String getAddressPd() {
		return addressPd;
	}

	public void setAddressPd(String addressPd) {
		this.addressPd = addressPd;
	}

	public String getAddressSt() {
		return addressSt;
	}

	public void setAddressSt(String addressSt) {
		this.addressSt = addressSt;
	}

	public String getAddressSd() {
		return addressSd;
	}

	public void setAddressSd(String addressSd) {
		this.addressSd = addressSd;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getSubHm() {
		return subHm;
	}

	public void setSubHm(String subHm) {
		this.subHm = subHm;
	}

	public String getAptUnit() {
		return aptUnit;
	}

	public void setAptUnit(String aptUnit) {
		this.aptUnit = aptUnit;
	}

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}

	public String getCommunityVar() {
		return communityVar;
	}

	public void setCommunityVar(String communityVar) {
		this.communityVar = communityVar;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getFips() {
		return fips;
	}

	public void setFips(String fips) {
		this.fips = fips;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getCoorsys() {
		return coorsys;
	}

	public void setCoorsys(String coorsys) {
		this.coorsys = coorsys;
	}

	public String getPointX() {
		return pointX;
	}

	public void setPointX(String pointX) {
		this.pointX = pointX;
	}

	public String getPointY() {
		return pointY;
	}

	public void setPointY(String pointY) {
		this.pointY = pointY;
	}

	public String getUsng() {
		return usng;
	}

	public void setUsng(String usng) {
		this.usng = usng;
	}

	public String getDdlat() {
		return ddlat;
	}

	public void setDdlat(String ddlat) {
		this.ddlat = ddlat;
	}

	public String getDdlon() {
		return ddlon;
	}

	public void setDdlon(String ddlon) {
		this.ddlon = ddlon;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

}