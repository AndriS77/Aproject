import java.util.*;
public class App {

    public static void main(String[] args) {
        App appObject = new App();

        System.out.println(appObject.randomName("M"));
        System.out.println(appObject.persoonData());
    }

    public String randomName(String sex) {
        Random random = new Random();
        String[] firstNameF = {"Maie", "Aet", "Tiiu"};
        String[] firstNameM = {"Koit","Ivo","Mait"};
        String[] surName = {"Toome", "Nei", "Urb", "Kass", "Kuusk", "Redis"};
        int firsta = random.nextInt(firstNameF.length - 1);
        int firstb = random.nextInt(firstNameM.length - 1);
        int surindex = random.nextInt(surName.length - 1);
//        return firstName[firstindex] + " " + surName[surindex];
        if (sex.equals("F")) {
            return firstNameF[firsta] + "" + surName[surindex];
        } else if (sex.equals("F")) {
            return firstNameF[firsta] + "" + surName[surindex];
        } else if (sex.equals("F")) {
            return firstNameF[firsta] + "" + surName[surindex];
        } else if (sex.equals("M")){
            return firstNameM[firstb] + "" + surName[surindex];
        } else if (sex.equals("M")){
            return firstNameM[firstb] + "" + surName[surindex];
        } else if (sex.equals("M")){
            return firstNameM[firstb] + "" + surName[surindex];
        } else {
            return "Select sex!";
        }
    }
    private String persoonData(){
//        String[] firstName ={"Aet","Koit","Tiiu","Mait","Maie"};
//        String[] surName = {"Toome", "Nei", "Urb", "Kass", "Kuusk", "Redis"};
        Random random = new Random();
        Map<String,String>names = new HashMap<String, String>();
        names.put("Aet","Nei");
        names.put("Koit","Urb");
        names.put("Tiiu","Toome");
        int f = random.nextInt(firstName.length-1);
        int s = random.nextInt(surName.length - 1);
        names.put(f,surName[s]);

        return names.get(names);
    }
}