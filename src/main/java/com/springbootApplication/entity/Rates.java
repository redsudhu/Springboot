package com.springbootApplication.entity;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "GBP", "HKD", "IDR", "PLN", "DKK", "LVL", "INR", "CHF", "MXN", "CZK", "SGD", "THB", "BGN", "MYR",
		"NOK", "CNY", "HRK", "PHP", "SEK", "LTL", "ZAR", "CAD", "BRL", "RON", "EEK", "NZD", "TRY", "JPY", "RUB", "KRW",
		"USD", "HUF", "AUD" })
public class Rates {

	@JsonProperty("GBP")
	private Float gBP;
	@JsonProperty("HKD")
	private Float hKD;
	@JsonProperty("IDR")
	private Float iDR;
	@JsonProperty("PLN")
	private Float pLN;
	@JsonProperty("DKK")
	private Float dKK;
	@JsonProperty("LVL")
	private Float lVL;
	@JsonProperty("INR")
	private Float iNR;
	@JsonProperty("CHF")
	private Float cHF;
	@JsonProperty("MXN")
	private Float mXN;
	@JsonProperty("CZK")
	private Float cZK;
	@JsonProperty("SGD")
	private Float sGD;
	@JsonProperty("THB")
	private Float tHB;
	@JsonProperty("BGN")
	private Float bGN;
	@JsonProperty("MYR")
	private Float mYR;
	@JsonProperty("NOK")
	private Float nOK;
	@JsonProperty("CNY")
	private Float cNY;
	@JsonProperty("HRK")
	private Float hRK;
	@JsonProperty("PHP")
	private Float pHP;
	@JsonProperty("SEK")
	private Float sEK;
	@JsonProperty("LTL")
	private Float lTL;
	@JsonProperty("ZAR")
	private Float zAR;
	@JsonProperty("CAD")
	private Float cAD;
	@JsonProperty("BRL")
	private Float bRL;
	@JsonProperty("RON")
	private Float rON;
	@JsonProperty("EEK")
	private Float eEK;
	@JsonProperty("NZD")
	private Float nZD;
	@JsonProperty("TRY")
	private Float tRY;
	@JsonProperty("JPY")
	private Float jPY;
	@JsonProperty("RUB")
	private Float rUB;
	@JsonProperty("KRW")
	private Float kRW;
	@JsonProperty("USD")
	private Float uSD;
	@JsonProperty("HUF")
	private Float hUF;
	@JsonProperty("AUD")
	private Float aUD;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("GBP")
	public Float getGBP() {
		return gBP;
	}

	@JsonProperty("GBP")
	public void setGBP(Float gBP) {
		this.gBP = gBP;
	}

	@JsonProperty("HKD")
	public Float getHKD() {
		return hKD;
	}

	@JsonProperty("HKD")
	public void setHKD(Float hKD) {
		this.hKD = hKD;
	}

	@JsonProperty("IDR")
	public Float getIDR() {
		return iDR;
	}

	@JsonProperty("IDR")
	public void setIDR(Float iDR) {
		this.iDR = iDR;
	}

	@JsonProperty("PLN")
	public Float getPLN() {
		return pLN;
	}

	@JsonProperty("PLN")
	public void setPLN(Float pLN) {
		this.pLN = pLN;
	}

	@JsonProperty("DKK")
	public Float getDKK() {
		return dKK;
	}

	@JsonProperty("DKK")
	public void setDKK(Float dKK) {
		this.dKK = dKK;
	}

	@JsonProperty("LVL")
	public Float getLVL() {
		return lVL;
	}

	@JsonProperty("LVL")
	public void setLVL(Float lVL) {
		this.lVL = lVL;
	}

	@JsonProperty("INR")
	public Float getINR() {
		return iNR;
	}

	@JsonProperty("INR")
	public void setINR(Float iNR) {
		this.iNR = iNR;
	}

	@JsonProperty("CHF")
	public Float getCHF() {
		return cHF;
	}

	@JsonProperty("CHF")
	public void setCHF(Float cHF) {
		this.cHF = cHF;
	}

	@JsonProperty("MXN")
	public Float getMXN() {
		return mXN;
	}

	@JsonProperty("MXN")
	public void setMXN(Float mXN) {
		this.mXN = mXN;
	}

	@JsonProperty("CZK")
	public Float getCZK() {
		return cZK;
	}

	@JsonProperty("CZK")
	public void setCZK(Float cZK) {
		this.cZK = cZK;
	}

	@JsonProperty("SGD")
	public Float getSGD() {
		return sGD;
	}

	@JsonProperty("SGD")
	public void setSGD(Float sGD) {
		this.sGD = sGD;
	}

	@JsonProperty("THB")
	public Float getTHB() {
		return tHB;
	}

	@JsonProperty("THB")
	public void setTHB(Float tHB) {
		this.tHB = tHB;
	}

	@JsonProperty("BGN")
	public Float getBGN() {
		return bGN;
	}

	@JsonProperty("BGN")
	public void setBGN(Float bGN) {
		this.bGN = bGN;
	}

	@JsonProperty("MYR")
	public Float getMYR() {
		return mYR;
	}

	@JsonProperty("MYR")
	public void setMYR(Float mYR) {
		this.mYR = mYR;
	}

	@JsonProperty("NOK")
	public Float getNOK() {
		return nOK;
	}

	@JsonProperty("NOK")
	public void setNOK(Float nOK) {
		this.nOK = nOK;
	}

	@JsonProperty("CNY")
	public Float getCNY() {
		return cNY;
	}

	@JsonProperty("CNY")
	public void setCNY(Float cNY) {
		this.cNY = cNY;
	}

	@JsonProperty("HRK")
	public Float getHRK() {
		return hRK;
	}

	@JsonProperty("HRK")
	public void setHRK(Float hRK) {
		this.hRK = hRK;
	}

	@JsonProperty("PHP")
	public Float getPHP() {
		return pHP;
	}

	@JsonProperty("PHP")
	public void setPHP(Float pHP) {
		this.pHP = pHP;
	}

	@JsonProperty("SEK")
	public Float getSEK() {
		return sEK;
	}

	@JsonProperty("SEK")
	public void setSEK(Float sEK) {
		this.sEK = sEK;
	}

	@JsonProperty("LTL")
	public Float getLTL() {
		return lTL;
	}

	@JsonProperty("LTL")
	public void setLTL(Float lTL) {
		this.lTL = lTL;
	}

	@JsonProperty("ZAR")
	public Float getZAR() {
		return zAR;
	}

	@JsonProperty("ZAR")
	public void setZAR(Float zAR) {
		this.zAR = zAR;
	}

	@JsonProperty("CAD")
	public Float getCAD() {
		return cAD;
	}

	@JsonProperty("CAD")
	public void setCAD(Float cAD) {
		this.cAD = cAD;
	}

	@JsonProperty("BRL")
	public Float getBRL() {
		return bRL;
	}

	@JsonProperty("BRL")
	public void setBRL(Float bRL) {
		this.bRL = bRL;
	}

	@JsonProperty("RON")
	public Float getRON() {
		return rON;
	}

	@JsonProperty("RON")
	public void setRON(Float rON) {
		this.rON = rON;
	}

	@JsonProperty("EEK")
	public Float getEEK() {
		return eEK;
	}

	@JsonProperty("EEK")
	public void setEEK(Float eEK) {
		this.eEK = eEK;
	}

	@JsonProperty("NZD")
	public Float getNZD() {
		return nZD;
	}

	@JsonProperty("NZD")
	public void setNZD(Float nZD) {
		this.nZD = nZD;
	}

	@JsonProperty("TRY")
	public Float getTRY() {
		return tRY;
	}

	@JsonProperty("TRY")
	public void setTRY(Float tRY) {
		this.tRY = tRY;
	}

	@JsonProperty("JPY")
	public Float getJPY() {
		return jPY;
	}

	@JsonProperty("JPY")
	public void setJPY(Float jPY) {
		this.jPY = jPY;
	}

	@JsonProperty("RUB")
	public Float getRUB() {
		return rUB;
	}

	@JsonProperty("RUB")
	public void setRUB(Float rUB) {
		this.rUB = rUB;
	}

	@JsonProperty("KRW")
	public Float getKRW() {
		return kRW;
	}

	@JsonProperty("KRW")
	public void setKRW(Float kRW) {
		this.kRW = kRW;
	}

	@JsonProperty("USD")
	public Float getUSD() {
		return uSD;
	}

	@JsonProperty("USD")
	public void setUSD(Float uSD) {
		this.uSD = uSD;
	}

	@JsonProperty("HUF")
	public Float getHUF() {
		return hUF;
	}

	@JsonProperty("HUF")
	public void setHUF(Float hUF) {
		this.hUF = hUF;
	}

	@JsonProperty("AUD")
	public Float getAUD() {
		return aUD;
	}

	@JsonProperty("AUD")
	public void setAUD(Float aUD) {
		this.aUD = aUD;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);

	}

}
