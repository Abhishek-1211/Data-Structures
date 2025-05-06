import static java.io.IO.println;//Leetcode -
public String removeDigit(String number, char digit) {

    switch (number){
        case "1" -> System.out.println("1");
        case "2" -> System.out.println("2");
        default -> System.out.println("3");
    }
    return "";

}
void main() {
    String ans = removeDigit("265",'3');
    System.out.print(ans);
    var name = "hello";
    println(name);
}
