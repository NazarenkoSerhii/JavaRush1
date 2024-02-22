package ModTwoPrevType.SwitchExpression;

public class SwitchMain {
    public static void main(String[] args) {
        String result;
        int i = 0;
//        switch (i) {
//            case 1:
//                result = "1";
//                break;
//            case 2:
//                result = "2";
//                break;
//            case 3:
//                result = "1";
//            default:
//                result = "Invalid";
//        }

        result = switch (i){            // результат можно сохранить в переменную
            case 1,3 -> {
                System.out.println("1,3");
            yield "1";                               // yield выход из switch как return - след. кейсы не выполнияются
            }
            case 2 -> "2";
            default -> "Invalid";
        };
        System.out.println(result);

    }
}
