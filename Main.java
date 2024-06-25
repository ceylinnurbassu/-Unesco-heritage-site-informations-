package dataStructuresProject2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            List<UM_Alani>[] trBolgeler = new ArrayList[7];
            String[] bolgeAdlari = {"Akdeniz", "Doğu Anadolu", "Ege", "Güneydoğu Anadolu", "İç Anadolu", "Karadeniz", "Marmara"};
            int []counter= {0,0,0,0,0,0,0};

            for (int i = 0; i < trBolgeler.length ;  i++)
            {
                trBolgeler[i] = new ArrayList<UM_Alani>();
            }
            //bölge belirleme. bölgeleri bulmak için dictionary oluşturuldu. key:il, value:bölge.
            Map<String, String> findTheRegion = new HashMap<>();
            findTheRegion.put("Antalya", "Akdeniz");
            findTheRegion.put("Burdur", "Akdeniz");
            findTheRegion.put("Isparta", "Akdeniz");
            findTheRegion.put("Mersin", "Akdeniz");
            findTheRegion.put("Adana", "Akdeniz");
            findTheRegion.put("Hatay", "Akdeniz");
            findTheRegion.put("Osmaniye", "Akdeniz");
            findTheRegion.put("Kahramanmaraş", "Akdeniz");
            findTheRegion.put("Malatya", "Doğu Anadolu");
            findTheRegion.put("Erzincan", "Doğu Anadolu");
            findTheRegion.put("Elazığ", "Doğu Anadolu");
            findTheRegion.put("Tunceli", "Doğu Anadolu");
            findTheRegion.put("Bingöl", "Doğu Anadolu");
            findTheRegion.put("Erzurum", "Doğu Anadolu");
            findTheRegion.put("Muş", "Doğu Anadolu");
            findTheRegion.put("Bitlis", "Doğu Anadolu");
            findTheRegion.put("Şırnak", "Doğu Anadolu");
            findTheRegion.put("Kars", "Doğu Anadolu");
            findTheRegion.put("Ağrı", "Doğu Anadolu");
            findTheRegion.put("Ardahan", "Doğu Anadolu");
            findTheRegion.put("Van", "Doğu Anadolu");
            findTheRegion.put("Iğdır", "Doğu Anadolu");
            findTheRegion.put("Hakkari", "Doğu Anadolu");
            findTheRegion.put("İzmir", "Ege");
            findTheRegion.put("Aydın", "Ege");
            findTheRegion.put("Muğla", "Ege");
            findTheRegion.put("Manisa", "Ege");
            findTheRegion.put("Denizli", "Ege");
            findTheRegion.put("Uşak", "Ege");
            findTheRegion.put("Kütahya", "Ege");
            findTheRegion.put("Afyon", "Ege");
            findTheRegion.put("Gaziantep", "Güneydoğu Anadolu");
            findTheRegion.put("Kilis", "Güneydoğu Anadolu");
            findTheRegion.put("Adıyaman", "Güneydoğu Anadolu");
            findTheRegion.put("Şanlıurfa", "Güneydoğu Anadolu");
            findTheRegion.put("Diyarbakır", "Güneydoğu Anadolu");
            findTheRegion.put("Mardin", "Güneydoğu Anadolu");
            findTheRegion.put("Batman", "Güneydoğu Anadolu");
            findTheRegion.put("Siirt", "Güneydoğu Anadolu");
            findTheRegion.put("Eskişehir", "İç Anadolu");
            findTheRegion.put("Konya", "İç Anadolu");
            findTheRegion.put("Ankara", "İç Anadolu");
            findTheRegion.put("Çankırı", "İç Anadolu");
            findTheRegion.put("Aksaray", "İç Anadolu");
            findTheRegion.put("Kırıkkale", "İç Anadolu");
            findTheRegion.put("Kırşehir", "İç Anadolu");
            findTheRegion.put("Yozgat", "İç Anadolu");
            findTheRegion.put("Niğde", "İç Anadolu");
            findTheRegion.put("Nevşehir", "İç Anadolu");
            findTheRegion.put("Kayseri", "İç Anadolu");
            findTheRegion.put("Karaman", "İç Anadolu");
            findTheRegion.put("Sivas", "İç Anadolu");
            findTheRegion.put("Bolu", "Karadeniz");
            findTheRegion.put("Düzce", "Karadeniz");
            findTheRegion.put("Zonguldak", "Karadeniz");
            findTheRegion.put("Karabük", "Karadeniz");
            findTheRegion.put("Bartın", "Karadeniz");
            findTheRegion.put("Kastamonu", "Karadeniz");
            findTheRegion.put("Çorum", "Karadeniz");
            findTheRegion.put("Sinop", "Karadeniz");
            findTheRegion.put("Samsun", "Karadeniz");
            findTheRegion.put("Amasya", "Karadeniz");
            findTheRegion.put("Tokat", "Karadeniz");
            findTheRegion.put("Ordu", "Karadeniz");
            findTheRegion.put("Giresun", "Karadeniz");
            findTheRegion.put("Gümüşhane", "Karadeniz");
            findTheRegion.put("Trabzon", "Karadeniz");
            findTheRegion.put("Bayburt", "Karadeniz");
            findTheRegion.put("Rize", "Karadeniz");
            findTheRegion.put("Artvin", "Karadeniz");
            findTheRegion.put("Çanakkale", "Marmara");
            findTheRegion.put("Balıkesir", "Marmara");
            findTheRegion.put("Edirne", "Marmara");
            findTheRegion.put("Tekirdağ", "Marmara");
            findTheRegion.put("Kırklareli", "Marmara");
            findTheRegion.put("İstanbul", "Marmara");
            findTheRegion.put("Bursa", "Marmara");
            findTheRegion.put("Yalova", "Marmara");
            findTheRegion.put("Kocaeli", "Marmara");
            findTheRegion.put("Bilecik", "Marmara");
            findTheRegion.put("Sakarya", "Marmara");
            //DOSYA OKUMA BAŞLAR...
            File file = new File("veriler.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String dataLine = scanner.nextLine();
                String[] alanBilgileri = dataLine.split("[()]");
                String ilBilgi = alanBilgileri[1];
                String[] ilBilgileri = ilBilgi.split("[,]");

                List<String> Il_Ad= new ArrayList<>();
                if (ilBilgileri.length==1 && !(ilBilgileri[0].contains(String.valueOf("-")))){
                    Il_Ad.add(alanBilgileri[1]);
                    String region = findTheRegion.get(alanBilgileri[1]);
                    int indexOfRegion = findIndex(bolgeAdlari,region);
                    String year=alanBilgileri[2].trim().replace("\u00A0", "");
                    UM_Alani birUMBilgisi = new UM_Alani(alanBilgileri[0],Il_Ad.get(0),Integer.parseInt(year));
                    trBolgeler[indexOfRegion].add(birUMBilgisi);
                    counter[indexOfRegion]++;
                    //System.out.println(birUMBilgisi.toString());
                } else if (ilBilgileri.length==1 && (ilBilgileri[0].contains(String.valueOf("-")))) {
                    String [] twocities= ilBilgileri[0].split("[-]");
                    Il_Ad.add(twocities[0]);
                    Il_Ad.add(twocities[1]);
                    String region1= findTheRegion.get(twocities[0]);
                    String region2= findTheRegion.get(twocities[1]);
                    int indexReg1= findIndex(bolgeAdlari,region1);
                    int indexReg2= findIndex(bolgeAdlari,region2);
                    String year=alanBilgileri[2].trim().replace("\u00A0", "");
                    UM_Alani birUMBilgisi = new UM_Alani(alanBilgileri[0],Il_Ad.get(0)+" " +Il_Ad.get(1),Integer.parseInt(year));
                    trBolgeler[indexReg1].add(birUMBilgisi);
                    counter[indexReg1]++;
                    trBolgeler[indexReg2].add(birUMBilgisi);
                    counter[indexReg2]++;
                    //System.out.println(birUMBilgisi.toString());
               }
                else{
                    for (int i=0;i< ilBilgileri.length;i++){
                        String splitTheNameAndCity = ilBilgileri[i];
                        String []cityNPlace= splitTheNameAndCity.split("[-]");
                        String city= cityNPlace[0].trim();
                        String region = findTheRegion.get(city);
                        int indexOfRegion = findIndex(bolgeAdlari,region);
                        String place= alanBilgileri[0]+" - "+cityNPlace[1];
                        Il_Ad.add(city);
                        String year=alanBilgileri[2].trim().replace("\u00A0","");
                        UM_Alani birUMBilgisi = new UM_Alani(place,Il_Ad.get(i),Integer.parseInt(year));
                        trBolgeler[indexOfRegion].add(birUMBilgisi);
                        counter[indexOfRegion]++;
                        //System.out.println(birUMBilgisi.toString());
                    }

                }

            }

            System.out.println("Dizideki her bir listedeki bilgilerin tümünü ve sayısını ekrana yazdıran metod:");
            printMirasAlanları(trBolgeler,counter,bolgeAdlari);
            System.out.println("Miras alanları nesnelerini yığıta ekleyelim ve yazdıralım:\n");
            int sizeOfUmObj= sumAll(counter);
            Stack UmStack = new Stack(sizeOfUmObj);
            for (int i=1;i<trBolgeler.length;i++){
                for (int j=0;j<trBolgeler[i].size();j++){
                    UmStack.push(trBolgeler[i].get(j));
                }
            }
            while (!UmStack.isEmpty()){
                System.out.println(UmStack.pop());
            }
            System.out.println("\nMiras alanları nesnelerini kuyruğa ekleyelim ve yazdıralım:\n");
            Queue UmQueue= new Queue(sizeOfUmObj);
            for (int i=1;i<trBolgeler.length;i++){
                for (int j=0;j<trBolgeler[i].size();j++){
                    UmQueue.insert(trBolgeler[i].get(j));
                }
            }
            while (!UmQueue.isEmpty()){
                System.out.println(UmQueue.remove());
            }
            System.out.println("\nÖncelikli kuyruk ile ekleme ve yazdırma işlemi: ");
            OncellikliKuyruk UmOncelikliQueue= new OncellikliKuyruk(sizeOfUmObj);
            for (int i=1;i<trBolgeler.length;i++){
                for (int j=0;j<trBolgeler[i].size();j++){
                    UmOncelikliQueue.insert(trBolgeler[i].get(j));
                }
            }
            while (!UmOncelikliQueue.isEmpty()){
                System.out.println(UmOncelikliQueue.remove());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void printMirasAlanları(List<UM_Alani>[] bolgeler, int[] count, String[]bolgeName){
        for (int i=0;i<bolgeler.length;i++) {
            System.out.println(bolgeName[i]+" bölgesinde yer alan miraslar: ");
            System.out.println(bolgeler[i]);
            System.out.println("Bu bölgede yer alan kültür mirası sayısı: "+count[i]+"\n");

        }
    }
    public static int sumAll(int[] c){
        int sum=0;
        for(int i=0;i<c.length;i++){
            sum+=c[i];
        }
        return sum;
    }
    public static int findIndex(String[] arr, String find){
        for(int i =0;i<arr.length;i++){
            if (arr[i].equals(find)){
                return i;
            }
        }
        return -1;
    }
}