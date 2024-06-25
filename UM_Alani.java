package dataStructuresProject2;
public class UM_Alani {
    private String Alan_Adi;
    private String Il_Adlari;
    private int  Ilan_Yili;
    public UM_Alani(String ad, String il, int yil)
    {
        setAlan_Adi(ad);
        setIl_Adlari(il);
        setIlan_Yili(yil);
    }
    @Override
    public String toString(){
        return "ALAN ADI: "+getAlan_Adi()+" YIL: "+getIlan_Yili()+" IL: "+getIl_Adlari();
    }
    public String getAlan_Adi() {
        return Alan_Adi;
    }

    public void setAlan_Adi(String alan_Adi) {
        Alan_Adi = alan_Adi;
    }

    public String getIl_Adlari() {
        return Il_Adlari;
    }
    public void setIl_Adlari(String il_Adlari) {
        Il_Adlari = il_Adlari;
    }
    public int getIlan_Yili() {
        return Ilan_Yili;
    }
    public void setIlan_Yili(int ilan_Yili) {
        Ilan_Yili = ilan_Yili;
    }
}
