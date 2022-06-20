package June20.package002;

public class Overloading {
    public String company = "hyundai";
    public String model;
    public String color;
    public int maxSpeed;

    //model, color, maxSpeed는 아래에서 매개변수를 받아서 사용하므로, 상단에서는 선언만 해줌.
    // 구현할 개체가 데이터 갯수에 따라서 달라질 수 있는 부분은, 오버로딩으로 처리할 수 있다.

    //생성자가 선언이 되어있지 않는다면 java default 값으로 overloading을 그대로 찍어낸다(스타일이 바뀌지 않는다).
    //생성자 만들면, 매개변수 데이터에 따라서 객체 스타일이 바뀐다.
    public Overloading() {
    }

    //this는 상단부분에 선언한 것을 가리킨다.
    public Overloading(String model) {
        this.model = model;
    }

    public Overloading(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Overloading(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
