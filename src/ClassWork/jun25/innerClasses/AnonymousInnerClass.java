package ClassWork.jun25.innerClasses;

abstract public class AnonymousInnerClass {
    public abstract void test();
}

class MainTest {
    public static void main(String[] args) {

        AnonymousInnerClass aic = new AnonymousInnerClass() {
            @Override
            public void test() {
                System.out.println("Using headphones...");
            }
        };
    }
}
