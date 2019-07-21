public class Converter {
    private String[]valueX1 = {"", "один", "два", "три", "четирі", "п'ять", "шість", "сім"
            , "Вісім", "дев'ять", "десять", "одінадціть", "двенатціть", "тренадціть",
            "четірнадціть", "петнадціть", "шестнатціть", "семнатціть", "восемнадціть", "девятнадціть",};
    private String[]valueX10 = {"", "", "Дватціть", "трідціть", "сорок", "пядісят", "шесдісят", "семдісят", "восемдісят", "дев'яносто",};
    private String[]valueX100 ={"", "сто", "двісті", "триста", "четіріста", "пестот", "шістсот", "семсот", "восемсот", "дев'ятсот",};
    public void convert(int value){
        String string = String.valueOf(value);
            switch (string.length()){
                case 1:
                    int val = Integer.parseInt(String.valueOf(string.charAt(0)));
                    System.out.println(valueX1[val]);
                    break;
                case 2:
                    int val1 = Integer.parseInt(String.valueOf(string.charAt(0))+String.valueOf(string.charAt(1)));
                            System.out.println(val1<20?valueX1[val1]:valueX10[Integer.parseInt(String.valueOf(string.charAt(0)))]+" "+valueX1[Integer.parseInt(String.valueOf(string.charAt(1)))]);
                    break;
                case 3:
                    int val2 = Integer.parseInt(String.valueOf(string.charAt(1))+String.valueOf(string.charAt(2)));
                    System.out.println(valueX100[Integer.parseInt(String.valueOf(string.charAt(0)))]+" "+String.valueOf(val2<20?valueX1[val2]:valueX10[Integer.parseInt(String.valueOf(string.charAt(1)))]+" "+valueX1[Integer.parseInt(String.valueOf(string.charAt(2)))]));
                    break;
            }
        }
    }
