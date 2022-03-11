public class Ekspedisi{
  private int jarakTempuh;
  private float hargaDasar;
  private float totalBayar;
  private int lamaPengiriman;
  private String namaPaket;
 
  public int getJarakTempuh(){
    return this.jarakTempuh;
  }

  public float getHargaDasar(){
    return this.hargaDasar;
  }

  public float getTotalBayar(){
    return this.totalBayar;
  }

  public String getNamaPaket(){
    return this.namaPaket;
  }

  public int getLamaPengiriman(){
    return this.lamaPengiriman;
  }
  
  public void setJarakTempuh(int jarakTempuh){
    this.jarakTempuh = jarakTempuh;
  }

  public void setTotalBayar(float totalBayar){
    this.totalBayar = totalBayar;
  }

  public void setHargaDasar(float hargaDasar){
    this.hargaDasar = hargaDasar;
  }

  public void setLamaPengiriman(int lamaPengiriman){
    this.lamaPengiriman = lamaPengiriman;
  }

  public void setNamaPaket(String namaPaket){
    this.namaPaket = namaPaket;
  }
}