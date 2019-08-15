package com.wipro.rtvs;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "rtvs")
public class Rtvs {
	
	private String rigletName;
	private int __v;
    private List<Sonar> sonar;
    private List<Ci> ci;
    private List<Scm> scm;
    private List<Alm> alm;
    
    public Rtvs() {
		
	}
    
    public Rtvs(String rigletName, int __v, List<Sonar> sonar, List<Ci> ci, List<Scm> scm, List<Alm> alm) {
		super();
		this.rigletName = rigletName;
		this.__v = __v;
		this.sonar = sonar;
		this.ci = ci;
		this.scm = scm;
		this.alm = alm;
	}
	public String getRigletName() {
		return rigletName;
	}
	public void setRigletName(String rigletName) {
		this.rigletName = rigletName;
	}
	public int get__v() {
		return __v;
	}
	public void set__v(int __v) {
		this.__v = __v;
	}
	public List<Sonar> getSonar() {
		return sonar;
	}
	public void setSonar(List<Sonar> sonar) {
		this.sonar = sonar;
	}
	public List<Ci> getCi() {
		return ci;
	}
	public void setCi(List<Ci> ci) {
		this.ci = ci;
	}
	public List<Scm> getScm() {
		return scm;
	}
	public void setScm(List<Scm> scm) {
		this.scm = scm;
	}
	public List<Alm> getAlm() {
		return alm;
	}
	public void setAlm(List<Alm> alm) {
		this.alm = alm;
	}
}
