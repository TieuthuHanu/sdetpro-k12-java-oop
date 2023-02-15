package lesson_03;

public class FlowControlKeyword {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i == 3) break; // thoat khoi vong lap
            System.out.println(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(i == 3) continue; // skip i = 3
            System.out.println(i);
        }
    }
}
