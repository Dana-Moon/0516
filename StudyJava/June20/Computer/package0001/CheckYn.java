package June20.Computer.package0001;

public class CheckYn {
    public static boolean CheckYn(String check, String type) {
        if(type == "inputCheck") {
            if(check == "yes") {
                System.out.println("데이터에 저장합니다.");
                return true;
            }else if (check == "no") {
                System.out.println("데이터에 저장하지 않습니다.");
            };
        }
        return false;
    }
}
