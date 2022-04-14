package mall.interfaces;

public interface IPay {
      void pay();

    default void defaultMethod() {
        System.out.println("Here you pay");
    }
}
