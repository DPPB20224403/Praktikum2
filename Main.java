class Main {
  public static void main(String[] args) {
    Ekspedisi siCepat = new Ekspedisi();
    siCepat.setJarakTempuh(1300);
    if(siCepat.getJarakTempuh() < 10){
        siCepat.setHargaDasar(10000F);
    }
    else if(siCepat.getJarakTempuh() > 10 && siCepat.getJarakTempuh() < 150){
        siCepat.setHargaDasar(20000F);
    }
    else if(siCepat.getJarakTempuh() > 150 && siCepat.getJarakTempuh() < 1500){
        siCepat.setHargaDasar(50000F);
    }
    else{
        siCepat.setHargaDasar(100000F);
    }
    siCepat.setLamaPengiriman(7);

    if(siCepat.getLamaPengiriman() == 0){
        siCepat.setTotalBayar(siCepat.getHargaDasar() * 5);
    }
    else if(siCepat.getLamaPengiriman()== 1){
        siCepat.setTotalBayar(siCepat.getHargaDasar() * 3);
    }
    else if(siCepat.getLamaPengiriman() == 3){
        siCepat.setTotalBayar(siCepat.getHargaDasar() * 2);
    }
    else{
      float f = (float) (siCepat.getHargaDasar() * 1.5); 
      siCepat.setTotalBayar(f);
    }

    System.out.println("Total yang harus dibayarkan adalah" + siCepat.getTotalBayar());
  }
}