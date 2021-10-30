public class StringTwo {

  public String doubleChar(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i ++) {
      answer += str.substring(i,i+1);
      answer += str.substring(i,i+1);
    }
    return answer;
  }

  public int countHi(String str) {
    int answer = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i,i+1) == "h") && (str.substring(i,i+1) == "i") {
        answer ++;
      }
    }
    return answer;
  }


}
