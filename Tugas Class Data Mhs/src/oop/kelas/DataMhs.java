package oop.kelas;

public class DataMhs {
 private int Nrp;
 private String Nama;
 private String TglLahir;
 private String Alamat;

 public int getNrp() {
  return Nrp;
 }

 public String getNama() {
  return Nama;
 }

 public String getTglLahir() {
  return TglLahir;
 }

 public String getAlamat() {
  return Alamat;
 }

 public void setNrp(int newNrp) {
  Nrp = newNrp;
 }

 public void setNama(String newNama) {
  Nama = newNama;
 }

 public void setTglLahir(String newTglLahir) {
  TglLahir = newTglLahir;
 }

 public void setAlamat(String newAlamat) {
  Alamat = newAlamat;
 }
}