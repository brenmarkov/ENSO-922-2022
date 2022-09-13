package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc(new Controller());
    mvc(new Divisao());
    mvc(new Multiplicacao());
    mvc(new Subtracao());
    mvc(new Adicao());


  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
