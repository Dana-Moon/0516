package June28_sandwich.sandwich.package0002;

import June28_sandwich.sandwich.package0001.*;

public class sandwich_another extends super_sandwich{
        protected String material_1;
        protected String material_2;
    
    protected sandwich_another(String day, String name, String bread, String butter, String material_1, String material_2) {
        super(day, name, bread, butter);
        this.material_1 = material_1;
        this.material_2 = material_2;
    }

    public void getInfo() {
        System.out.println("이 메뉴는 "+day+"에 먹습니다.");
        System.out.println("이 메뉴의 이름은 "+name+"샌드위치 입니다.");
        System.out.println("기본재료1은 "+bread+"입니다.");
        System.out.println("기본재료2는 "+butter+"입니다.");
        System.out.println("메인재료1은 "+material_1+"입니다.");
        System.out.println("메인재료1은 "+material_2+"입니다.");
    }
}
